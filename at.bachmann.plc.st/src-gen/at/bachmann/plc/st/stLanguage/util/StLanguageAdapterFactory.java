/**
 */
package at.bachmann.plc.st.stLanguage.util;

import at.bachmann.plc.st.stLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bachmann.plc.st.stLanguage.StLanguagePackage
 * @generated
 */
public class StLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = StLanguagePackage.eINSTANCE;
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
  protected StLanguageSwitch<Adapter> modelSwitch =
    new StLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter casetest(test object)
      {
        return createtestAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseNumeric_Literal(Numeric_Literal object)
      {
        return createNumeric_LiteralAdapter();
      }
      @Override
      public Adapter caseInt_Literal(Int_Literal object)
      {
        return createInt_LiteralAdapter();
      }
      @Override
      public Adapter caseUnsigned_Int(Unsigned_Int object)
      {
        return createUnsigned_IntAdapter();
      }
      @Override
      public Adapter caseSigned_Int(Signed_Int object)
      {
        return createSigned_IntAdapter();
      }
      @Override
      public Adapter caseReal_Literal(Real_Literal object)
      {
        return createReal_LiteralAdapter();
      }
      @Override
      public Adapter caseBit_Str_Literal(Bit_Str_Literal object)
      {
        return createBit_Str_LiteralAdapter();
      }
      @Override
      public Adapter caseBool_Literal(Bool_Literal object)
      {
        return createBool_LiteralAdapter();
      }
      @Override
      public Adapter caseChar_Literal(Char_Literal object)
      {
        return createChar_LiteralAdapter();
      }
      @Override
      public Adapter caseTime_Literal(Time_Literal object)
      {
        return createTime_LiteralAdapter();
      }
      @Override
      public Adapter caseDuration(Duration object)
      {
        return createDurationAdapter();
      }
      @Override
      public Adapter caseTime_Of_Day(Time_Of_Day object)
      {
        return createTime_Of_DayAdapter();
      }
      @Override
      public Adapter caseDaytime(Daytime object)
      {
        return createDaytimeAdapter();
      }
      @Override
      public Adapter caseDate(Date object)
      {
        return createDateAdapter();
      }
      @Override
      public Adapter caseDate_And_Time(Date_And_Time object)
      {
        return createDate_And_TimeAdapter();
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
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.test <em>test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.test
   * @generated
   */
  public Adapter createtestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Numeric_Literal <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Numeric_Literal
   * @generated
   */
  public Adapter createNumeric_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Int_Literal <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Int_Literal
   * @generated
   */
  public Adapter createInt_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Unsigned_Int <em>Unsigned Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Unsigned_Int
   * @generated
   */
  public Adapter createUnsigned_IntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Signed_Int <em>Signed Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Signed_Int
   * @generated
   */
  public Adapter createSigned_IntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Real_Literal <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Real_Literal
   * @generated
   */
  public Adapter createReal_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Bit_Str_Literal <em>Bit Str Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Bit_Str_Literal
   * @generated
   */
  public Adapter createBit_Str_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Bool_Literal <em>Bool Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Bool_Literal
   * @generated
   */
  public Adapter createBool_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Char_Literal <em>Char Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Char_Literal
   * @generated
   */
  public Adapter createChar_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Time_Literal <em>Time Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Time_Literal
   * @generated
   */
  public Adapter createTime_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Duration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Duration
   * @generated
   */
  public Adapter createDurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Time_Of_Day <em>Time Of Day</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Time_Of_Day
   * @generated
   */
  public Adapter createTime_Of_DayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Daytime <em>Daytime</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Daytime
   * @generated
   */
  public Adapter createDaytimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Date
   * @generated
   */
  public Adapter createDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bachmann.plc.st.stLanguage.Date_And_Time <em>Date And Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bachmann.plc.st.stLanguage.Date_And_Time
   * @generated
   */
  public Adapter createDate_And_TimeAdapter()
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

} //StLanguageAdapterFactory
