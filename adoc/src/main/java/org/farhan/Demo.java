package org.farhan;

import org.asciidoctor.Asciidoctor.Factory;
import org.asciidoctor.Options;
import org.asciidoctor.OptionsBuilder;
import org.asciidoctor.ast.Author;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.RevisionInfo;
import org.asciidoctor.ast.StructuralNode;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import org.asciidoctor.Asciidoctor;

public class Demo {
	public static void main(String[] args) throws Exception {
		readStructure();
	}

	private static void readStructure() {

		Asciidoctor asciidoctor = Factory.create();
		Document adoc = asciidoctor.loadFile(new File("structure.adoc"), Options.builder().asMap());

		for (StructuralNode part : adoc.getBlocks()) {
			System.out.println(part.getTitle());
			System.out.println("----");
			System.out.println(part.getContent());
			System.out.println("----");
		}
	}

	private static void printDocHeader() {
		Asciidoctor asciidoctor = Factory.create();
		Document adoc = asciidoctor.loadFile(new File("header-sample.adoc"), Options.builder().asMap());

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
