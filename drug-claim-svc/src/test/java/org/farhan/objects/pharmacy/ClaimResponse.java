package org.farhan.objects.pharmacy;

import java.util.HashMap;

public interface ClaimResponse {

    public void assertOutOfPocket(HashMap<String, String> keyMap);

    public void assertPayProvider(HashMap<String, String> keyMap);

    public void assertPlanPays(HashMap<String, String> keyMap);
}
