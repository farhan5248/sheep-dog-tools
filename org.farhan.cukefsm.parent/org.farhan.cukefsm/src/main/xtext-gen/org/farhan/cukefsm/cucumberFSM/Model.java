/**
 * generated by Xtext 2.32.0
 */
package org.farhan.cukefsm.cucumberFSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.cukefsm.cucumberFSM.Model#getGreetings <em>Greetings</em>}</li>
 * </ul>
 *
 * @see org.farhan.cukefsm.cucumberFSM.CucumberFSMPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Greetings</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cukefsm.cucumberFSM.Greeting}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greetings</em>' containment reference list.
   * @see org.farhan.cukefsm.cucumberFSM.CucumberFSMPackage#getModel_Greetings()
   * @model containment="true"
   * @generated
   */
  EList<Greeting> getGreetings();

} // Model