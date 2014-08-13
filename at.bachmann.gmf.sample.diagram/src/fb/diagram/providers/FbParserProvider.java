package fb.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import fb.FbPackage;
import fb.diagram.edit.parts.FBNameEditPart;
import fb.diagram.edit.parts.INVariableNameEditPart;
import fb.diagram.edit.parts.OUTVariableNameEditPart;
import fb.diagram.parsers.MessageFormatParser;
import fb.diagram.part.FbVisualIDRegistry;

/**
 * @generated
 */
public class FbParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser fBName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getFBName_5001Parser() {
		if (fBName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { FbPackage.eINSTANCE
					.getFB_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { FbPackage.eINSTANCE
					.getFB_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			fBName_5001Parser = parser;
		}
		return fBName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser oUTVariableName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getOUTVariableName_5004Parser() {
		if (oUTVariableName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { FbPackage.eINSTANCE
					.getVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { FbPackage.eINSTANCE
					.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			oUTVariableName_5004Parser = parser;
		}
		return oUTVariableName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser iNVariableName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getINVariableName_5003Parser() {
		if (iNVariableName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { FbPackage.eINSTANCE
					.getVariable_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { FbPackage.eINSTANCE
					.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			iNVariableName_5003Parser = parser;
		}
		return iNVariableName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case FBNameEditPart.VISUAL_ID:
			return getFBName_5001Parser();
		case OUTVariableNameEditPart.VISUAL_ID:
			return getOUTVariableName_5004Parser();
		case INVariableNameEditPart.VISUAL_ID:
			return getINVariableName_5003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(FbVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(FbVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (FbElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
