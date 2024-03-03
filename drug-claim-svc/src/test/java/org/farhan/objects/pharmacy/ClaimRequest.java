package org.farhan.objects.pharmacy;

import java.util.HashMap;

public interface ClaimRequest {

    public void setCertificate(HashMap<String, String> keyMap);

    public void setCoInsurance(HashMap<String, String> keyMap);

    public void setCoPayment(HashMap<String, String> keyMap);

    public void setDIN(HashMap<String, String> keyMap);

    public void setDeductible(HashMap<String, String> keyMap);

    public void setDispenseFee(HashMap<String, String> keyMap);

    public void setDrugCost(HashMap<String, String> keyMap);

    public void setMaximum(HashMap<String, String> keyMap);

    public void setProvider(HashMap<String, String> keyMap);

    public void transition();
}
