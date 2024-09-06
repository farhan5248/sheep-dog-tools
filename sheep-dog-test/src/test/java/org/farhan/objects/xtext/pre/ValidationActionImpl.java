package org.farhan.objects.xtext.pre;

import org.farhan.common.ActionObject;
import org.farhan.objects.xtext.ValidationAction;

public class ValidationActionImpl extends ActionObject implements ValidationAction {

    public void transition() {
    	runAction("validate");
	}
}
