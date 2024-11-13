package org.farhan.runners.failsafe;

import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;

import java.io.File;

import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.service.RestServiceApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.farhan")
@EnableAutoConfiguration
@ActiveProfiles("failsafe")
@CucumberContextConfiguration
@SpringBootTest(classes = RestServiceApplication.class)
public class Config {

	@Before
	public void before() {
		Utilities.deleteDir(new File("target/src-gen/"), "");
	}
}