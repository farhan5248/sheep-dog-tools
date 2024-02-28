package org.farhan.objects.pharmacy;

import java.util.HashMap;

public interface ClaimRequest {

    public void setDrugCost(HashMap<String, String> keyMap);

    public void setFamily(HashMap<String, String> keyMap);

    public void transition();
}
