/**
 * generated by Xtext 2.36.0
 */
package org.farhan.mbt.sheepDog;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.mbt.sheepDog.StepObject#getStepDefinitionList <em>Step Definition List</em>}</li>
 * </ul>
 *
 * @see org.farhan.mbt.sheepDog.SheepDogPackage#getStepObject()
 * @model
 * @generated
 */
public interface StepObject extends Model
{
  /**
   * Returns the value of the '<em><b>Step Definition List</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.mbt.sheepDog.StepDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step Definition List</em>' containment reference list.
   * @see org.farhan.mbt.sheepDog.SheepDogPackage#getStepObject_StepDefinitionList()
   * @model containment="true"
   * @generated
   */
  EList<StepDefinition> getStepDefinitionList();

} // StepObject
