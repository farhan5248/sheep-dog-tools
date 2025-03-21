/**
 * generated by Xtext 2.36.0
 */
package org.farhan.mbt.sheepDog;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.mbt.sheepDog.TestCase#getTestDataList <em>Test Data List</em>}</li>
 * </ul>
 *
 * @see org.farhan.mbt.sheepDog.SheepDogPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends TestStepContainer
{
  /**
   * Returns the value of the '<em><b>Test Data List</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.mbt.sheepDog.TestData}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Data List</em>' containment reference list.
   * @see org.farhan.mbt.sheepDog.SheepDogPackage#getTestCase_TestDataList()
   * @model containment="true"
   * @generated
   */
  EList<TestData> getTestDataList();

} // TestCase
