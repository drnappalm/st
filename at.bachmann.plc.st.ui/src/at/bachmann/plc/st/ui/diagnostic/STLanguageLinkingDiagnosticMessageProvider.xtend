package at.bachmann.plc.st.ui.diagnostic

import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider.ILinkingDiagnosticContext
import at.bachmann.plc.st.stLanguage.Variable
import org.eclipse.xtext.linking.impl.IllegalNodeException
import org.eclipse.xtext.diagnostics.DiagnosticMessage
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.diagnostics.Diagnostic

class STLanguageLinkingDiagnosticMessageProvider extends LinkingDiagnosticMessageProvider {
	
	override getUnresolvedProxyMessage(ILinkingDiagnosticContext context) {
		val referenceType = context.reference.EReferenceType
		if(referenceType.instanceClass.name.equals(Variable.name)) {
			var linkText = ""
			try {
				linkText = context.linkText
			} catch (IllegalNodeException e){
				linkText = e.node.text
			}
			val msg = "The variable '" + linkText + "' is not declared."
			
			new DiagnosticMessage(msg, Severity.ERROR, Diagnostic.LINKING_DIAGNOSTIC)
		} else {
			super.getUnresolvedProxyMessage(context)		
		}
	}	
}