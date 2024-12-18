package org.farhan.mbt.parser.antlr;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.farhan.mbt.parser.antlr.internal.MySheepDogLexer;

public class MySheepDogParser extends SheepDogParser {

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new MySheepDogLexer(stream);
	}
}
