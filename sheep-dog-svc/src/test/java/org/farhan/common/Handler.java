package org.farhan.common;

import org.farhan.mbt.service.RestServiceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Handler {

	private ConfigurableApplicationContext cac = null;

	@Before
	public void before() {
		TestObjectFactory.setup();
		if (System.getenv("START_APP") == null) {
			cac = SpringApplication.run(RestServiceApplication.class, new String[0]);
		}
	}

	@After
	public void after() {
		if (cac != null) {
			cac.close();
		}
	}
}
