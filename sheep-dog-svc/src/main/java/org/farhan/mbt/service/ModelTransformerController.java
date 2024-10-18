package org.farhan.mbt.service;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.farhan.mbt.convert.ConvertCucumberToUML;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.MojoGoal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelTransformerController implements ApplicationListener<ApplicationReadyEvent> {

	Logger logger = LoggerFactory.getLogger(ModelTransformerController.class);
	// TODO share this between sessions or the tag will be lost?
	MojoGoal mojo;

	@GetMapping("/initModelFromCucumber")
	public ModelTransformerResponse initModelFromCucumber(
			@RequestParam(value = "tag", defaultValue = "debug") String tag) {
		mojo = new ConvertCucumberToUML();
		// TODO abstract this away into a method like in MBTMojo
		try {
			mojo.mojoGoal(tag);
			for (String fileName : mojo.getFileList()) {
				// TODO append to a string list for now but later make a proper JSON object
				// TODO add uml file to the list too?
				logger.info("File name: " + fileName);
			}
		} catch (Exception e) {
			return new ModelTransformerResponse("target/uml.pst", "", getStackTraceAsString(e));
		}
		// TODO should probably return a model ID to later on be passed in. Perhaps use
		// the tag in the name?
		return new ModelTransformerResponse("target/uml.pst", "", "Transformation complete");
	}

	@PostMapping("/updateModelFromCucumber")
	public ModelTransformerResponse updateModelFromCucumber(@RequestParam(value = "fileName") String fileName,
			@RequestBody String content) {

		mojo = new ConvertCucumberToUML();
		try {
			mojo.addFile(fileName, content);
		} catch (Exception e) {
			return new ModelTransformerResponse(fileName, content, getStackTraceAsString(e));
		}
		return new ModelTransformerResponse(fileName, content, "");
	}

	private String getStackTraceAsString(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		return sw.toString();
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {

		File baseDir = new File("/" + System.getenv("BASEDIR"));
		logger.info("Testing temp directory: " + baseDir.getAbsolutePath());
		if (!baseDir.exists()) {
			logger.error("Temp directory doesn't exist");
		} else {
			logger.info("Temp directory does exist");
			ConvertibleProject.baseDir = baseDir.getPath();
		}
	}

}