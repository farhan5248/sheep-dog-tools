package org.farhan.mbt.service;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelTransformerController {

	@GetMapping("/initModel")
	public ModelTransformerResponse initModel(@RequestParam(value = "tag", defaultValue = "debug") String tag) {
		return new ModelTransformerResponse("target/uml.pst", "", "");
	}

	@PostMapping("/updateModel")
	public ModelTransformerResponse updateModel(@RequestParam(value = "fileName") String fileName,
			@RequestBody String content) {

		File test = new File("target/" + fileName);
		System.out.println(test.getParentFile().getAbsolutePath());
		try {
			PrintWriter aPrintWriter;
			test.getParentFile().mkdirs();
			aPrintWriter = new PrintWriter(test, StandardCharsets.UTF_8);
			aPrintWriter.print(content);
			aPrintWriter.flush();
			aPrintWriter.close();
		} catch (IOException e) {
			return new ModelTransformerResponse(test.getAbsolutePath(), content, getStackTraceAsString(e));
		}
		return new ModelTransformerResponse(test.getAbsolutePath(), content, "");
	}

	private String getStackTraceAsString(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		return sw.toString();
	}

}