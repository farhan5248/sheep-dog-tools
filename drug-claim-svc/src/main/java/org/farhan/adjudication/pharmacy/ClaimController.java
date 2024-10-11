package org.farhan.adjudication.pharmacy;

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
public class ClaimController {

	@GetMapping("/claimer")
	public ClaimResponse claimer(@RequestParam(value = "din", defaultValue = "9999") String din) {
		return new ClaimResponse("", "", "", "");
	}

	@PostMapping("/updateModel")
	public ClaimResponse updateModel(@RequestParam(value = "fileName", defaultValue = "test.txt") String fileName,
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
			return new ClaimResponse(content, test.getAbsolutePath(), getStackTraceAsString(e), "");
		}
		return new ClaimResponse(content, test.getAbsolutePath(), "OK", "");
	}

	public static String getStackTraceAsString(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		String exceptionAsString = sw.toString();
		return exceptionAsString;
	}

}