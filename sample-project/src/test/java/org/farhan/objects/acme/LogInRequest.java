package org.farhan.objects.acme;

import java.util.HashMap;

public interface LogInRequest {

    public void setPassword(HashMap<String, String> keyMap);

    public void setUser(HashMap<String, String> keyMap);

    public void transition();
}
