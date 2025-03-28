/*
 * generated by Xtext 2.38.0
 */
package org.farhan.dsl.sheepdog.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.farhan.dsl.sheepdog.SheepDogRuntimeModule;
import org.farhan.dsl.sheepdog.SheepDogStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class SheepDogIdeSetup extends SheepDogStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new SheepDogRuntimeModule(), new SheepDogIdeModule()));
	}
	
}
