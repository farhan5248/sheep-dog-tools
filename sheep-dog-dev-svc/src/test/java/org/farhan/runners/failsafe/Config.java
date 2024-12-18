package org.farhan.runners.failsafe;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;

import java.io.File;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.farhan.mbt.service.RestServiceApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@ComponentScan(basePackages = "org.farhan")
@EnableAutoConfiguration
@ActiveProfiles("failsafe")
@CucumberContextConfiguration
@SpringBootTest(classes = RestServiceApplication.class)
public class Config {

	private JdbcTemplate jdbcTemplate;

	public Config(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void deleteDir(File aDir) {
		if (aDir.exists()) {
			for (String s : aDir.list()) {
				File f = new File(aDir.getAbsolutePath() + File.separator + s);
				if (f.isDirectory()) {
					deleteDir(f);
				}
				f.delete();
			}
		}
	}

	@Before
	public void before() {
		deleteDir(new File("target/src-gen/"));
		jdbcTemplate.execute(
				"CREATE TABLE IF NOT EXISTS Model_Source_Files ( file_name VARCHAR(200) NULL, file_content TEXT NULL );");
	}

	@After
	public void after() {
		jdbcTemplate.execute("DROP TABLE Model_Source_Files;");
	}

}