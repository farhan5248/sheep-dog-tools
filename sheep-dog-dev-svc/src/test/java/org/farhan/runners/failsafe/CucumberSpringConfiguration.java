package org.farhan.runners.failsafe;

import io.cucumber.spring.CucumberContextConfiguration;

import org.farhan.mbt.service.RestServiceApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.farhan")
@EnableAutoConfiguration
@ActiveProfiles("dev")
@CucumberContextConfiguration
@SpringBootTest(classes = RestServiceApplication.class)
public class CucumberSpringConfiguration {
}