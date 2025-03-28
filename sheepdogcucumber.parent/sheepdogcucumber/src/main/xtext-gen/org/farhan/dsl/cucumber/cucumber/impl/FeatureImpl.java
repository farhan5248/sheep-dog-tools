/**
 * generated by Xtext 2.38.0
 */
package org.farhan.dsl.cucumber.cucumber.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.farhan.dsl.cucumber.cucumber.AbstractScenario;
import org.farhan.dsl.cucumber.cucumber.CucumberPackage;
import org.farhan.dsl.cucumber.cucumber.Feature;
import org.farhan.dsl.cucumber.cucumber.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.dsl.cucumber.cucumber.impl.FeatureImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.farhan.dsl.cucumber.cucumber.impl.FeatureImpl#getAbstractScenarios <em>Abstract Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends ModelImpl implements Feature
{
  /**
   * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTags()
   * @generated
   * @ordered
   */
  protected EList<Tag> tags;

  /**
   * The cached value of the '{@link #getAbstractScenarios() <em>Abstract Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractScenarios()
   * @generated
   * @ordered
   */
  protected EList<AbstractScenario> abstractScenarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CucumberPackage.Literals.FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Tag> getTags()
  {
    if (tags == null)
    {
      tags = new EObjectContainmentEList<Tag>(Tag.class, this, CucumberPackage.FEATURE__TAGS);
    }
    return tags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AbstractScenario> getAbstractScenarios()
  {
    if (abstractScenarios == null)
    {
      abstractScenarios = new EObjectContainmentEList<AbstractScenario>(AbstractScenario.class, this, CucumberPackage.FEATURE__ABSTRACT_SCENARIOS);
    }
    return abstractScenarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CucumberPackage.FEATURE__TAGS:
        return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
      case CucumberPackage.FEATURE__ABSTRACT_SCENARIOS:
        return ((InternalEList<?>)getAbstractScenarios()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CucumberPackage.FEATURE__TAGS:
        return getTags();
      case CucumberPackage.FEATURE__ABSTRACT_SCENARIOS:
        return getAbstractScenarios();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CucumberPackage.FEATURE__TAGS:
        getTags().clear();
        getTags().addAll((Collection<? extends Tag>)newValue);
        return;
      case CucumberPackage.FEATURE__ABSTRACT_SCENARIOS:
        getAbstractScenarios().clear();
        getAbstractScenarios().addAll((Collection<? extends AbstractScenario>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CucumberPackage.FEATURE__TAGS:
        getTags().clear();
        return;
      case CucumberPackage.FEATURE__ABSTRACT_SCENARIOS:
        getAbstractScenarios().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CucumberPackage.FEATURE__TAGS:
        return tags != null && !tags.isEmpty();
      case CucumberPackage.FEATURE__ABSTRACT_SCENARIOS:
        return abstractScenarios != null && !abstractScenarios.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FeatureImpl
