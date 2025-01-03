package org.farhan.mbt.maven;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "prepare", defaultPhase = LifecyclePhase.POST_INTEGRATION_TEST)
public class PrepareMojo extends ReleaseMojo {

	@Parameter(defaultValue = "${project}", readonly = true)
	public MavenProject project;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		try {
			if (!project.getModules().isEmpty()) {
				getLog().info("Preparing parent");
				String cv = project.getVersion().replace("-SNAPSHOT", "");
				getLog().info("current version: " + cv);
				String[] cvParts = cv.split("\\.");
				String nv = cvParts[0] + "." + String.valueOf(Integer.parseInt(cvParts[1]) + 1) + "." + cvParts[2];
				getLog().info("next version: " + nv);

				updateVersion(project.getBasedir(), "<version>", cv + "-SNAPSHOT</version>", cv + "</version>",
						"pom.xml");
				updateVersion(project.getBasedir(), "Bundle-Version: ", cv + ".qualifier", cv + "", "MANIFEST.MF");
				updateVersion(project.getBasedir(), "version=\"", cv + ".qualifier\"", cv + "\"", "feature.xml");
				gitCommit("prepare release " + project.getArtifactId() + "-" + cv);
				gitTag(project.getArtifactId() + "-" + cv);
			}
		} catch (Exception e) {
			throw new MojoExecutionException(e);
		}
	}
}
