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

	Logger logger = LoggerFactory.getLogger(ModelTransformerController.class);

	@GetMapping("/getFileContents")
	public ModelTransformerResponse getFileContents(@RequestParam(value = "tags", defaultValue = "") String tags,
			@RequestParam(value = "fileName") String fileName) {
		logger.info("Starting getFileContents");
		logger.info("fileName:" + fileName);
		String fileContents = "";
		ModelTransformerResponse mtr;
		try {
			MojoGoal mojo = new ConvertCucumberToUML(tags);
			fileContents = mojo.getFileContents(fileName);
			mtr = new ModelTransformerResponse(fileName, fileContents);
		} catch (Exception e) {
			logger.error(getStackTraceAsString(e));
			mtr = new ModelTransformerResponse("", "");
		}
		logger.debug("response: " + mtr.toString());
		logger.info("Ending getFileContents");
		return mtr;
	}

	@GetMapping("/getFileList")
	public ModelTransformerResponse getFileList(@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting getFileList");
		String fileList = "";
		ModelTransformerResponse mtr;
		try {
			MojoGoal mojo = new ConvertCucumberToUML(tags);
			for (String fileName : mojo.getFileList()) {
				// TODO append to a string list for now but later make a proper JSON object
				fileList += "\n" + fileName;
			}
			fileList = fileList.replaceFirst("\n", "");
			mtr = new ModelTransformerResponse(fileList, "");
		} catch (Exception e) {
			logger.error(getStackTraceAsString(e));
			mtr = new ModelTransformerResponse("", "");
		}
		logger.debug("response: " + mtr.toString());
		logger.info("Ending getFileList");
		return mtr;
	}

	@PostMapping("/cucumberToUMLMojo")
	public ModelTransformerResponse cucumberToUMLMojo(@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting cucumberToUMLMojo");
		logger.info("tags:" + tags);
		ModelTransformerResponse mtr = mojoGoal(new ConvertCucumberToUML(tags));
		logger.debug("response: " + mtr.toString());
		logger.info("Ending getFileContents");
		return mtr;
	}

	@PostMapping("/umlToCucumberMojo")
	public ModelTransformerResponse umlToCucumberMojo(@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting umlToCucumberMojo");
		logger.info("tags:" + tags);
		ModelTransformerResponse mtr = mojoGoal(new ConvertUMLToCucumber(tags));
		logger.debug("response: " + mtr.toString());
		logger.info("Ending umlToCucumberMojo");
		return mtr;
	}

	@PostMapping("/asciiDoctorToUMLMojo")
	public ModelTransformerResponse asciiDoctorToUMLMojo(@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting asciiDoctorToUMLMojo");
		logger.info("tags:" + tags);
		ModelTransformerResponse mtr = mojoGoal(new ConvertAsciidoctorToUML(tags));
		logger.debug("response: " + mtr.toString());
		logger.info("Ending asciiDoctorToUMLMojo");
		return mtr;
	}

	@PostMapping("/umlToAsciiDoctorMojo")
	public ModelTransformerResponse umlToAsciiDoctorMojo(@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting umlToAsciiDoctorMojo");
		logger.info("tags:" + tags);
		ModelTransformerResponse mtr = mojoGoal(new ConvertUMLToAsciidoctor(tags));
		logger.debug("response: " + mtr.toString());
		logger.info("Ending umlToAsciiDoctorMojo");
		return mtr;
	}

	private ModelTransformerResponse mojoGoal(MojoGoal mojo) {
		try {
			mojo.mojoGoal();
		} catch (Exception e) {
			logger.error(getStackTraceAsString(e));
		}
		return new ModelTransformerResponse("", "");
	}

	@PostMapping("/addFile")
	public ModelTransformerResponse addFile(@RequestParam(value = "tags", defaultValue = "") String tags,
			@RequestParam(value = "fileName") String fileName, @RequestBody String contents) {
		logger.info("Starting addFile");
		logger.info("fileName:" + fileName);
		ModelTransformerResponse mtr;
		try {
			MojoGoal mojo = new ConvertCucumberToUML(tags);
			mojo.addFile(fileName, contents);
			mtr = new ModelTransformerResponse(fileName, contents);
		} catch (Exception e) {
			logger.error(getStackTraceAsString(e));
			mtr = new ModelTransformerResponse("", "");
		}
		logger.debug("response: " + mtr.toString());
		logger.info("Ending addFile");
		return mtr;
	}

	private String getStackTraceAsString(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		return sw.toString();
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		logger.info("Starting onApplicationEvent");
		File baseDir = new File(File.separator + System.getenv("BASEDIR"));
		if (!baseDir.exists()) {
			baseDir.mkdirs();
		} else {
			ConvertibleProject.baseDir = baseDir.getPath() + File.separator;
		}
		logger.info("Ending onApplicationEvent");
	}

}