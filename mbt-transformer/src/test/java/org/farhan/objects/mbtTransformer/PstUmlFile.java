package org.farhan.objects.mbtTransformer;

import java.util.HashMap;

public interface PstUmlFile {

    public void assertClassCommentsSectionClassName(HashMap<String, String> keyMap);

    public void assertClassCommentsSectionComment(HashMap<String, String> keyMap);

    public void assertClassElementImportsSectionClassName(HashMap<String, String> keyMap);

    public void assertClassElementImportsSectionImportedElement(HashMap<String, String> keyMap);

    public void assertClassInteractionsSectionClassName(HashMap<String, String> keyMap);

    public void assertClassInteractionsSectionInteractionName(HashMap<String, String> keyMap);

    public void assertClassPropertiesSectionClassName(HashMap<String, String> keyMap);

    public void assertClassPropertiesSectionPropertyName(HashMap<String, String> keyMap);

    public void assertClassPropertiesSectionPropertyType(HashMap<String, String> keyMap);

    public void assertClassSectionClassName(HashMap<String, String> keyMap);

    public void assertInteractionAnnotationsSectionAnnotationDetail(HashMap<String, String> keyMap);

    public void assertInteractionAnnotationsSectionAnnotationName(HashMap<String, String> keyMap);

    public void assertInteractionAnnotationsSectionInteractionName(HashMap<String, String> keyMap);

    public void assertInteractionCommentsSectionComment(HashMap<String, String> keyMap);

    public void assertInteractionCommentsSectionInteractionName(HashMap<String, String> keyMap);

    public void assertInteractionLifelinesSectionInteractionName(HashMap<String, String> keyMap);

    public void assertInteractionLifelinesSectionLifelineName(HashMap<String, String> keyMap);

    public void assertInteractionLifelinesSectionLifelineRepresents(HashMap<String, String> keyMap);

    public void assertInteractionMessageOccurencesSectionInteractionName(HashMap<String, String> keyMap);

    public void assertInteractionMessageOccurencesSectionLifelineCovered(HashMap<String, String> keyMap);

    public void assertInteractionMessageOccurencesSectionMessageOccurence(HashMap<String, String> keyMap);

    public void assertInteractionMessagesSectionAnnotationDetail(HashMap<String, String> keyMap);

    public void assertInteractionMessagesSectionArgumentName(HashMap<String, String> keyMap);

    public void assertInteractionMessagesSectionInteractionName(HashMap<String, String> keyMap);

    public void assertInteractionMessagesSectionMessage(HashMap<String, String> keyMap);

    public void assertInteractionParametersSectionInteractionName(HashMap<String, String> keyMap);

    public void assertInteractionParametersSectionParameterName(HashMap<String, String> keyMap);

    public void assertPresent(HashMap<String, String> keyMap);
}
