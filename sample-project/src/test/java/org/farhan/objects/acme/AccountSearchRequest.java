package org.farhan.objects.acme;

import java.util.HashMap;

public interface AccountSearchRequest {

    public void setPatient(HashMap<String, String> keyMap);

    public void transition();
}
