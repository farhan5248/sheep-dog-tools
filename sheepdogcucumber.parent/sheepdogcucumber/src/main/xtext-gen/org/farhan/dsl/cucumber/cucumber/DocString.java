/**
 * generated by Xtext 2.38.0
 */
package org.farhan.dsl.cucumber.cucumber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.dsl.cucumber.cucumber.DocString#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see org.farhan.dsl.cucumber.cucumber.CucumberPackage#getDocString()
 * @model
 * @generated
 */
public interface DocString extends EObject
{
  /**
   * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.dsl.cucumber.cucumber.Line}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines</em>' containment reference list.
   * @see org.farhan.dsl.cucumber.cucumber.CucumberPackage#getDocString_Lines()
   * @model containment="true"
   * @generated
   */
  EList<Line> getLines();

} // DocString
