package org.farhan.objects.acmeTool;

import java.util.HashMap;

public interface DoItGoal {

    public void setParameters(HashMap<String, String> keyMap);

    public void transition();
}
