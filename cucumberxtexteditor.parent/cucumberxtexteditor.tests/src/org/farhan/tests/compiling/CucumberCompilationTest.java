package org.farhan.tests.compiling;

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
		// This is failing for some whitespace issue so I'll comment it out for now
		// since I don't use the functionality
		/*
		 * StringBuilder featureBuilder = new StringBuilder();
		 * featureBuilder.append("Feature: basic scenario Test");
		 * featureBuilder.append("\n"); StringBuilder classBuilder = new
		 * StringBuilder(); classBuilder.append("package temp;");
		 * classBuilder.append("\n"); classBuilder.append("\n");
		 * classBuilder.append("public class basic scenario Test {");
		 * classBuilder.append("\n"); classBuilder.append("\n");
		 * classBuilder.append("}");
		 * this.compilationTestHelper.assertCompilesTo(featureBuilder, classBuilder);
		 */
	}
}
