/**
 * generated by Xtext 2.36.0
 */
package org.farhan.mbt.cucumber;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Outline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.mbt.cucumber.ScenarioOutline#getTags <em>Tags</em>}</li>
 *   <li>{@link org.farhan.mbt.cucumber.ScenarioOutline#getExamples <em>Examples</em>}</li>
 * </ul>
 *
 * @see org.farhan.mbt.cucumber.CucumberPackage#getScenarioOutline()
 * @model
 * @generated
 */
public interface ScenarioOutline extends AbstractScenario
{
  /**
   * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.mbt.cucumber.Tag}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' containment reference list.
   * @see org.farhan.mbt.cucumber.CucumberPackage#getScenarioOutline_Tags()
   * @model containment="true"
   * @generated
   */
  EList<Tag> getTags();

  /**
   * Returns the value of the '<em><b>Examples</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.mbt.cucumber.Examples}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Examples</em>' containment reference list.
   * @see org.farhan.mbt.cucumber.CucumberPackage#getScenarioOutline_Examples()
   * @model containment="true"
   * @generated
   */
  EList<Examples> getExamples();

} // ScenarioOutline