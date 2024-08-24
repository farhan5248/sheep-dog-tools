package org.farhan.tests.formatting;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.farhan.tests.CucumberInjectorProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;

@ExtendWith(InjectionExtension.class)
@InjectWith(CucumberInjectorProvider.class)
public class CucumberCompilationTest {
	@Inject
	@Extension
	private CompilationTestHelper compilationTestHelper;

	@Test
	public void testCompiler() throws Exception {
		StringBuilder featureBuilder = new StringBuilder();
		featureBuilder.append("Feature: basic scenario Test");
		featureBuilder.append("\r\n");
		StringBuilder classBuilder = new StringBuilder();
		classBuilder.append("package temp;");
		classBuilder.append("\r\n");
		classBuilder.append("\r\n");
		classBuilder.append("public class basic scenario Test {");
		classBuilder.append("\r\n");
		classBuilder.append("\r\n");
		classBuilder.append("}");
		classBuilder.append("\r\n");
		this.compilationTestHelper.assertCompilesTo(featureBuilder, classBuilder);
	}
}
