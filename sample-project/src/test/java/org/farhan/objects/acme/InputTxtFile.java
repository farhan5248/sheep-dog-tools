package org.farhan.objects.acme;

import java.util.HashMap;

public interface InputTxtFile {

    public void set(HashMap<String, String> keyMap);

    public void setInvalid(HashMap<String, String> keyMap);

    public void setUploaded(HashMap<String, String> keyMap);
}
