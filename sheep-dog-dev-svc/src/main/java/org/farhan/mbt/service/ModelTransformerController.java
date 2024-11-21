package org.farhan.mbt.service;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.farhan.mbt.core.Converter;
import org.farhan.mbt.convert.ConvertAsciidoctorToUML;
import org.farhan.mbt.convert.ConvertCucumberToUML;
import org.farhan.mbt.convert.ConvertUMLToAsciidoctor;
import org.farhan.mbt.convert.ConvertUMLToCucumber;
import org.farhan.mbt.convert.ConvertUMLToCucumberGuice;
import org.farhan.mbt.convert.ConvertUMLToCucumberSpring;
import org.farhan.mbt.core.ObjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties(prefix = "sheepdog")
@RestController
public class ModelTransformerController implements ApplicationListener<ApplicationReadyEvent> {

	Logger logger = LoggerFactory.getLogger(ModelTransformerController.class);
	private final ObjectRepository fa;

	@Value("${spring.datasource.url}")
	private String url;

	@Autowired
	public ModelTransformerController(ObjectRepository fa) {
		this.fa = fa;
	}

	@PostMapping("/addFile")
	public ModelTransformerResponse addFile(@RequestParam(value = "tags", defaultValue = "") String tags,
			@RequestParam(value = "fileName") String fileName, @RequestBody String contents) {
		logger.info("Starting addFile");
		logger.info("fileName:" + fileName);
		ModelTransformerResponse mtr;
		try {
			fa.put(tags, fileName, contents);
			mtr = new ModelTransformerResponse(fileName, contents);
		} catch (Exception e) {
			logger.error(getStackTraceAsString(e));
			mtr = new ModelTransformerResponse("", "");
		}
		logger.debug("response: " + mtr.toString());
		logger.info("Ending addFile");
		return mtr;
	}

	@GetMapping("/getFileContents")
	public ModelTransformerResponse getFileContents(@RequestParam(value = "tags", defaultValue = "") String tags,
			@RequestParam(value = "fileName") String fileName) {
		logger.info("Starting getFileContents");
		logger.info("fileName:" + fileName);
		String fileContents = "";
		ModelTransformerResponse mtr;
		try {
			fileContents = fa.get(tags, fileName);
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
	public ModelTransformerResponse getFileList(@RequestParam(value = "tags", defaultValue = "") String tags,
			@RequestParam(value = "dir", defaultValue = "") String dir) {
		logger.info("Starting getFileList");
		String fileList = "";
		ModelTransformerResponse mtr;
		try {
			for (String fileName : fa.list(tags, dir, "")) {
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

	@PostMapping("/cucumberToUML")
	public ModelTransformerResponse cucumberToUML(@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting cucumberToUML");
		logger.info("tags:" + tags);
		ModelTransformerResponse mtr = Converter(new ConvertCucumberToUML(tags, fa));
		logger.debug("response: " + mtr.toString());
		logger.info("Ending cucumberToUML");
		return mtr;
	}

	@PostMapping("/umlToCucumber")
	public ModelTransformerResponse umlToCucumber(@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting umlToCucumber");
		logger.info("tags:" + tags);
		ModelTransformerResponse mtr = Converter(new ConvertUMLToCucumber(tags, fa));
		logger.debug("response: " + mtr.toString());
		logger.info("Ending umlToCucumber");
		return mtr;
	}

	@PostMapping("/umlToCucumberSpring")
	public ModelTransformerResponse umlToCucumberSpring(
			@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting umlToCucumberSpring");
		logger.info("tags:" + tags);
		ModelTransformerResponse mtr = Converter(new ConvertUMLToCucumberSpring(tags, fa));
		logger.debug("response: " + mtr.toString());
		logger.info("Ending umlToCucumberSpring");
		return mtr;
	}

	@PostMapping("/umlToCucumberGuice")
	public ModelTransformerResponse umlToCucumberGuice(
			@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting umlToCucumberGuice");
		logger.info("tags:" + tags);
		ModelTransformerResponse mtr = Converter(new ConvertUMLToCucumberGuice(tags, fa));
		logger.debug("response: " + mtr.toString());
		logger.info("Ending umlToCucumberGuice");
		return mtr;
	}

	@PostMapping("/asciiDoctorToUML")
	public ModelTransformerResponse asciiDoctorToUML(@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting asciiDoctorToUML");
		logger.info("tags:" + tags);
		ModelTransformerResponse mtr = Converter(new ConvertAsciidoctorToUML(tags, fa));
		logger.debug("response: " + mtr.toString());
		logger.info("Ending asciiDoctorToUML");
		return mtr;
	}

	@PostMapping("/umlToAsciiDoctor")
	public ModelTransformerResponse umlToAsciiDoctor(@RequestParam(value = "tags", defaultValue = "") String tags) {
		logger.info("Starting umlToAsciiDoctor");
		logger.info("tags:" + tags);
		ModelTransformerResponse mtr = Converter(new ConvertUMLToAsciidoctor(tags, fa));
		logger.debug("response: " + mtr.toString());
		logger.info("Ending umlToAsciiDoctor");
		return mtr;
	}

	private ModelTransformerResponse Converter(Converter mojo) {
		try {
			mojo.mojoGoal();
		} catch (Exception e) {
			logger.error(getStackTraceAsString(e));
		}
		return new ModelTransformerResponse("", "");
	}

	private String getStackTraceAsString(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		return sw.toString();
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		logger.info("Starting onApplicationEvent");
		logger.info("spring.datasource.url:" + url);
		logger.info("Ending onApplicationEvent");
	}

}