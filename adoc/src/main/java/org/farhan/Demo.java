package org.farhan;

import org.asciidoctor.Asciidoctor.Factory;
import org.asciidoctor.Options;
import org.asciidoctor.OptionsBuilder;
import org.asciidoctor.ast.Author;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.RevisionInfo;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.asciidoctor.Asciidoctor;

public class Demo {
	public static void main(String[] args) throws Exception {
		readStructure();
	}

	private static void readStructure() {

		Asciidoctor asciidoctor = Factory.create();
		Document adoc = asciidoctor.loadFile(new File("structure.adoc"), Options.builder().build());
		for (StructuralNode block : adoc.getBlocks()) {
			outputSection((Section) block);
		}
	}

	private static void outputSection(Section section) {
		System.out.println("----");
		System.out.println(section.getTitle());
		System.out.println(section.getLevel());
		List<StructuralNode> blocks = section.getBlocks();
		for (StructuralNode block : blocks) {
			if (block instanceof Block) {
				outputBlock((Block) block);
			} else if (block instanceof Section) {
				outputSection((Section) block);
			}
		}
		System.out.println("----");
	}

	private static void outputBlock(Block block) {
		ArrayList<String> lines = new ArrayList<String>();
		for (String line : block.getLines()) {
			System.out.println(line);
			lines.add(line + line);
		}
		block.setLines(lines);
		for (String line : block.getLines()) {
			System.out.println(line);
		}
	}

	private static void printDocHeader() {
		Asciidoctor asciidoctor = Factory.create();
		Document adoc = asciidoctor.loadFile(new File("header-sample.adoc"), Options.builder().build());

		System.out.println(adoc.getDoctitle());

		Author author = adoc.getAuthors().getFirst();
		System.out.println(author.getEmail());
		System.out.println(author.getFullName());

		RevisionInfo revisionInfo = adoc.getRevisionInfo();

		System.out.println(revisionInfo.getDate());
		System.out.println(revisionInfo.getNumber());
		System.out.println(revisionInfo.getRemark());
	}

	private static void writeFile() throws Exception {
		File aFile = new File("demo.adoc");
		PrintWriter aPrintWriter = new PrintWriter(aFile, StandardCharsets.UTF_8);
		aPrintWriter.print("Writing AsciiDoc is _easy_!");
		aPrintWriter.flush();
		aPrintWriter.close();
	}

	private static void demo1() {
		Asciidoctor asciidoctor = Factory.create();
		String html = asciidoctor.convert("Writing AsciiDoc is _easy_!", OptionsBuilder.options());
		System.out.println(html);
	}
}
