package org.farhan.objects.mbttransformer;

import java.util.HashMap;

public interface CucumberToUmlGoal {

    public void setTags(HashMap<String, String> keyMap);

    public void transition();
}
