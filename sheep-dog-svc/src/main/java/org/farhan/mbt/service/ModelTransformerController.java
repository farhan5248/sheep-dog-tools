package org.farhan.mbt.service;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.farhan.mbt.convert.ConvertAsciidoctorToUML;
import org.farhan.mbt.convert.ConvertCucumberToUML;
import org.farhan.mbt.convert.ConvertUMLToAsciidoctor;
import org.farhan.mbt.convert.ConvertUMLToCucumber;
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
	// TODO handle exceptions better in general

	Logger logger = LoggerFactory.getLogger(ModelTransformerController.class);

	@GetMapping("/getFileContents")
	public ModelTransformerResponse getFileContents(@RequestParam(value = "fileName") String fileName) {
		logger.info("Starting getFileContents");
		String fileContents = "";
		try {
			MojoGoal mojo = new ConvertCucumberToUML();
			fileContents = mojo.getFileContents(fileName);
		} catch (Exception e) {
			logger.error(getStackTraceAsString(e));
			return new ModelTransformerResponse("target/uml.pst", "", "");
		}
		return new ModelTransformerResponse(fileName, fileContents, "");
	}

	@GetMapping("/getFileList")
	public ModelTransformerResponse getFileList() {
		logger.info("Starting getFileList");
		String fileList = "";
		try {
			MojoGoal mojo = new ConvertCucumberToUML();
			for (String fileName : mojo.getFileList()) {
				// TODO append to a string list for now but later make a proper JSON object
				logger.info("File name: " + fileName);
				fileList += "\n" + fileName;
			}
			fileList = fileList.replaceFirst("\n", "");
		} catch (Exception e) {
			logger.error(getStackTraceAsString(e));
			return new ModelTransformerResponse("target/uml.pst", "", "");
		}
		return new ModelTransformerResponse(fileList, "", "");
	}

	@PostMapping("/cucumberToUMLMojo")
	public ModelTransformerResponse cucumberToUMLMojo(@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting cucumberToUMLMojo");
		return mojoGoal(new ConvertCucumberToUML(), tags);
	}

	@PostMapping("/umlToCucumberMojo")
	public ModelTransformerResponse umlToCucumberMojo(@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting umlToCucumberMojo");
		return mojoGoal(new ConvertUMLToCucumber(), tags);
	}

	@PostMapping("/asciiDoctorToUMLMojo")
	public ModelTransformerResponse asciiDoctorToUMLMojo(@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting asciiDoctorToUMLMojo");
		return mojoGoal(new ConvertAsciidoctorToUML(), tags);
	}

	@PostMapping("/umlToAsciiDoctorMojo")
	public ModelTransformerResponse umlToAsciiDoctorMojo(@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting umlToAsciiDoctorMojo");
		return mojoGoal(new ConvertUMLToAsciidoctor(), tags);
	}

	private ModelTransformerResponse mojoGoal(MojoGoal mojo, String tags) {
		try {
			mojo.mojoGoal(tags);
		} catch (Exception e) {
			logger.error(getStackTraceAsString(e));
			return new ModelTransformerResponse("target/uml.pst", "", "");
		}
		// TODO should probably return a model ID to later on be passed in. Perhaps use
		// the tag in the name?
		return new ModelTransformerResponse("target/uml.pst", "", "");
	}

	@PostMapping("/addFile")
	public ModelTransformerResponse addFile(@RequestParam(value = "fileName") String fileName,
			@RequestBody String contents) {
		logger.info("Starting addFile");
		try {
			MojoGoal mojo = new ConvertCucumberToUML();
			mojo.addFile(fileName, contents);
		} catch (Exception e) {
			logger.error(getStackTraceAsString(e));
			return new ModelTransformerResponse(fileName, contents, "");
		}
		return new ModelTransformerResponse(fileName, contents, "");
	}

	private String getStackTraceAsString(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		return sw.toString();
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {

		File baseDir = new File(File.separator + System.getenv("BASEDIR"));
		logger.info("Testing temp directory: " + baseDir.getAbsolutePath());
		if (!baseDir.exists()) {
			logger.warn("Temp directory doesn't exist, creating it");
			baseDir.mkdirs();
		} else {
			logger.info("Temp directory does exist");
			ConvertibleProject.baseDir = baseDir.getPath() + File.separator;
		}
	}

}