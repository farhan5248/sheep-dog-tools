package org.farhan.mbt.maven;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "perform", defaultPhase = LifecyclePhase.POST_INTEGRATION_TEST)
public class PerformMojo extends ReleaseMojo {

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

				updateVersion(project.getBasedir(), "<version>", cv + "</version>", nv + "-SNAPSHOT</version>",
						"pom.xml");
				updateVersion(project.getBasedir(), "Bundle-Version: ", cv + "", nv + ".qualifier", "MANIFEST.MF");
				updateVersion(project.getBasedir(), "version=\"", cv + "\"", nv + ".qualifier\"", "feature.xml");
				gitCommit("prepare for next development iteration");
			}
		} catch (Exception e) {
			throw new MojoExecutionException(e);
		}
	}

}