package org.farhan.objects.mbttransformer;

import java.util.HashMap;

public interface PstUmlFile {

    public void assertClassAnnotationsSectionAnnotationDetail(HashMap<String, String> keyMap);

    public void assertClassAnnotationsSectionAnnotationName(HashMap<String, String> keyMap);

    public void assertClassAnnotationsSectionClassName(HashMap<String, String> keyMap);

    public void assertClassCommentsSectionClassName(HashMap<String, String> keyMap);

    public void assertClassCommentsSectionComment(HashMap<String, String> keyMap);

    public void assertClassInteractionsSectionClassName(HashMap<String, String> keyMap);

    public void assertClassInteractionsSectionInteractionName(HashMap<String, String> keyMap);

    public void assertClassSectionClassName(HashMap<String, String> keyMap);

    public void assertInteractionAnnotationsSectionAnnotationName(HashMap<String, String> keyMap);

    public void assertInteractionAnnotationsSectionInteractionName(HashMap<String, String> keyMap);

    public void assertInteractionCommentsSectionComment(HashMap<String, String> keyMap);

    public void assertInteractionCommentsSectionInteractionName(HashMap<String, String> keyMap);

    public void assertInteractionMessagesSectionAnnotationDetail(HashMap<String, String> keyMap);

    public void assertInteractionMessagesSectionArgumentName(HashMap<String, String> keyMap);

    public void assertInteractionMessagesSectionInteractionName(HashMap<String, String> keyMap);

    public void assertInteractionMessagesSectionMessage(HashMap<String, String> keyMap);

    public void assertInteractionParametersSectionInteractionName(HashMap<String, String> keyMap);

    public void assertInteractionParametersSectionParameterName(HashMap<String, String> keyMap);

    public void assertPresent(HashMap<String, String> keyMap);
}
