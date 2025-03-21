/**
 * generated by Xtext 2.36.0
 */
package org.farhan.mbt.sheepDog.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.farhan.mbt.sheepDog.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.farhan.mbt.sheepDog.SheepDogPackage
 * @generated
 */
public class SheepDogAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SheepDogPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SheepDogAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SheepDogPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SheepDogSwitch<Adapter> modelSwitch =
    new SheepDogSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseStepObject(StepObject object)
      {
        return createStepObjectAdapter();
      }
      @Override
      public Adapter caseStepDefinition(StepDefinition object)
      {
        return createStepDefinitionAdapter();
      }
      @Override
      public Adapter caseStepParameters(StepParameters object)
      {
        return createStepParametersAdapter();
      }
      @Override
      public Adapter caseTestSuite(TestSuite object)
      {
        return createTestSuiteAdapter();
      }
      @Override
      public Adapter caseTestStepContainer(TestStepContainer object)
      {
        return createTestStepContainerAdapter();
      }
      @Override
      public Adapter caseTestSetup(TestSetup object)
      {
        return createTestSetupAdapter();
      }
      @Override
      public Adapter caseTestCase(TestCase object)
      {
        return createTestCaseAdapter();
      }
      @Override
      public Adapter caseTestData(TestData object)
      {
        return createTestDataAdapter();
      }
      @Override
      public Adapter caseTestStep(TestStep object)
      {
        return createTestStepAdapter();
      }
      @Override
      public Adapter caseGiven(Given object)
      {
        return createGivenAdapter();
      }
      @Override
      public Adapter caseWhen(When object)
      {
        return createWhenAdapter();
      }
      @Override
      public Adapter caseThen(Then object)
      {
        return createThenAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter caseTable(Table object)
      {
        return createTableAdapter();
      }
      @Override
      public Adapter caseRow(Row object)
      {
        return createRowAdapter();
      }
      @Override
      public Adapter caseTags(Tags object)
      {
        return createTagsAdapter();
      }
      @Override
      public Adapter caseCell(Cell object)
      {
        return createCellAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.StepObject <em>Step Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.StepObject
   * @generated
   */
  public Adapter createStepObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.StepDefinition <em>Step Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.StepDefinition
   * @generated
   */
  public Adapter createStepDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.StepParameters <em>Step Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.StepParameters
   * @generated
   */
  public Adapter createStepParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.TestSuite <em>Test Suite</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.TestSuite
   * @generated
   */
  public Adapter createTestSuiteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.TestStepContainer <em>Test Step Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.TestStepContainer
   * @generated
   */
  public Adapter createTestStepContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.TestSetup <em>Test Setup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.TestSetup
   * @generated
   */
  public Adapter createTestSetupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.TestCase <em>Test Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.TestCase
   * @generated
   */
  public Adapter createTestCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.TestData <em>Test Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.TestData
   * @generated
   */
  public Adapter createTestDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.TestStep <em>Test Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.TestStep
   * @generated
   */
  public Adapter createTestStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.Given <em>Given</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.Given
   * @generated
   */
  public Adapter createGivenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.When <em>When</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.When
   * @generated
   */
  public Adapter createWhenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.Then <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.Then
   * @generated
   */
  public Adapter createThenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.Text
   * @generated
   */
  public Adapter createTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.Table
   * @generated
   */
  public Adapter createTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.Row <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.Row
   * @generated
   */
  public Adapter createRowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.Tags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.Tags
   * @generated
   */
  public Adapter createTagsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.Cell <em>Cell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.Cell
   * @generated
   */
  public Adapter createCellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.farhan.mbt.sheepDog.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.farhan.mbt.sheepDog.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SheepDogAdapterFactory
