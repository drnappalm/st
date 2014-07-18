package at.bachmann.plc.st.serializer;

import at.bachmann.plc.st.services.STLanguageGrammarAccess;
import at.bachmann.plc.st.stLanguage.Bit_Str_Literal;
import at.bachmann.plc.st.stLanguage.Bool_Literal;
import at.bachmann.plc.st.stLanguage.Char_Literal;
import at.bachmann.plc.st.stLanguage.Date;
import at.bachmann.plc.st.stLanguage.Date_And_Time;
import at.bachmann.plc.st.stLanguage.Daytime;
import at.bachmann.plc.st.stLanguage.Duration;
import at.bachmann.plc.st.stLanguage.Real_Literal;
import at.bachmann.plc.st.stLanguage.Signed_Int;
import at.bachmann.plc.st.stLanguage.StLanguagePackage;
import at.bachmann.plc.st.stLanguage.Time_Of_Day;
import at.bachmann.plc.st.stLanguage.Unsigned_Int;
import at.bachmann.plc.st.stLanguage.test;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class STLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private STLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == StLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StLanguagePackage.BIT_STR_LITERAL:
				if(context == grammarAccess.getBit_Str_LiteralRule() ||
				   context == grammarAccess.getConstantRule()) {
					sequence_Bit_Str_Literal(context, (Bit_Str_Literal) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.BOOL_LITERAL:
				if(context == grammarAccess.getBool_LiteralRule() ||
				   context == grammarAccess.getConstantRule()) {
					sequence_Bool_Literal(context, (Bool_Literal) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.CHAR_LITERAL:
				if(context == grammarAccess.getChar_LiteralRule() ||
				   context == grammarAccess.getConstantRule()) {
					sequence_Char_Literal(context, (Char_Literal) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.DATE:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getDateRule() ||
				   context == grammarAccess.getTime_LiteralRule()) {
					sequence_Date(context, (Date) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.DATE_AND_TIME:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getDate_And_TimeRule() ||
				   context == grammarAccess.getTime_LiteralRule()) {
					sequence_Date_And_Time(context, (Date_And_Time) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.DAYTIME:
				if(context == grammarAccess.getDaytimeRule()) {
					sequence_Daytime(context, (Daytime) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.DURATION:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getDurationRule() ||
				   context == grammarAccess.getTime_LiteralRule()) {
					sequence_Duration(context, (Duration) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.REAL_LITERAL:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getNumeric_LiteralRule() ||
				   context == grammarAccess.getReal_LiteralRule()) {
					sequence_Real_Literal(context, (Real_Literal) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.SIGNED_INT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getInt_LiteralRule() ||
				   context == grammarAccess.getNumeric_LiteralRule() ||
				   context == grammarAccess.getSigned_IntRule()) {
					sequence_Signed_Int(context, (Signed_Int) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.TIME_OF_DAY:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getTime_LiteralRule() ||
				   context == grammarAccess.getTime_Of_DayRule()) {
					sequence_Time_Of_Day(context, (Time_Of_Day) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.UNSIGNED_INT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getInt_LiteralRule() ||
				   context == grammarAccess.getNumeric_LiteralRule() ||
				   context == grammarAccess.getUnsigned_IntRule()) {
					sequence_Unsigned_Int(context, (Unsigned_Int) semanticObject); 
					return; 
				}
				else break;
			case StLanguagePackage.TEST:
				if(context == grammarAccess.getTestRule()) {
					sequence_test(context, (test) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=Bit_Str_Value
	 */
	protected void sequence_Bit_Str_Literal(EObject context, Bit_Str_Literal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBit_Str_LiteralAccess().getValueBit_Str_ValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Bool_Value
	 */
	protected void sequence_Bool_Literal(EObject context, Bool_Literal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBool_LiteralAccess().getValueBool_ValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Char_Value
	 */
	protected void sequence_Char_Literal(EObject context, Char_Literal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChar_LiteralAccess().getValueChar_ValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Date_And_Time_Value
	 */
	protected void sequence_Date_And_Time(EObject context, Date_And_Time semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDate_And_TimeAccess().getValueDate_And_Time_ValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=DATE_VALUE
	 */
	protected void sequence_Date(EObject context, Date semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDateAccess().getValueDATE_VALUETerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=DAYTIME_VALUE
	 */
	protected void sequence_Daytime(EObject context, Daytime semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.DAYTIME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.DAYTIME__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDaytimeAccess().getValueDAYTIME_VALUETerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Duration_Value
	 */
	protected void sequence_Duration(EObject context, Duration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDurationAccess().getValueDuration_ValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Real_Value
	 */
	protected void sequence_Real_Literal(EObject context, Real_Literal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReal_LiteralAccess().getValueReal_ValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Signed_Int_Value
	 */
	protected void sequence_Signed_Int(EObject context, Signed_Int semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSigned_IntAccess().getValueSigned_Int_ValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Time_Of_Day_Value
	 */
	protected void sequence_Time_Of_Day(EObject context, Time_Of_Day semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTime_Of_DayAccess().getValueTime_Of_Day_ValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Unsigned_Int_Value
	 */
	protected void sequence_Unsigned_Int(EObject context, Unsigned_Int semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnsigned_IntAccess().getValueUnsigned_Int_ValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     test='t'
	 */
	protected void sequence_test(EObject context, test semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StLanguagePackage.Literals.TEST__TEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StLanguagePackage.Literals.TEST__TEST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTestAccess().getTestTKeyword_0(), semanticObject.getTest());
		feeder.finish();
	}
}
