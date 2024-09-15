package org.farhan.mbt.parser.antlr;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.farhan.mbt.parser.antlr.internal.MyCucumberLexer;

public class MyCucumberParser extends CucumberParser {

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new MyCucumberLexer(stream);
	}
}
