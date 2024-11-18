package org.farhan.runners.failsafe;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.io.File;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@ComponentScan(basePackages = "org.farhan")
@EnableAutoConfiguration
@ActiveProfiles("failsafe")
@CucumberContextConfiguration
@SpringBootTest(classes = Config.class)
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
		// TODO this shouldn't be known to this project. It should be handled by docker
		// compose. However in that case, the plug-in should refresh the table contents
		// by deleting anything extra. After doing that delete the properties file as
		// well as the references to the db
		jdbcTemplate.execute(
				"CREATE TABLE IF NOT EXISTS Model_Source_Files ( file_name VARCHAR(200) NULL, file_content TEXT NULL );");
	}

	@After
	public void after() {
		jdbcTemplate.execute("DROP TABLE Model_Source_Files;");
	}
}