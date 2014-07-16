package at.bachmann.plc.st.validation

import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider.IParserErrorContext
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider.IValueConverterErrorContext

class STLanguageSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider {
	
	override getSyntaxErrorMessage(IParserErrorContext context) {
		val error = super.getSyntaxErrorMessage(context)
		return new SyntaxErrorMessage("ST Developer: " + error.message, error.issueCode, error.issueData)
	}
	
	override getSyntaxErrorMessage(IValueConverterErrorContext context) {
		val error = super.getSyntaxErrorMessage(context)
		return new SyntaxErrorMessage("ST Developer: " + error.message, error.issueCode, error.issueData)
	}	
}