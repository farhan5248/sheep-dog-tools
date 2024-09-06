package org.farhan.objects.xtext.pre;

import org.farhan.common.ActionObject;
import org.farhan.objects.xtext.GenerationAction;

public class GenerationActionImpl extends ActionObject implements GenerationAction {

    public void transition() {
    	runAction("generate");
	}
}
