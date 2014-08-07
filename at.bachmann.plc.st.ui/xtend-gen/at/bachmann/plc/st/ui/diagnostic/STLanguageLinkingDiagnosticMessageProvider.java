package at.bachmann.plc.st.ui.diagnostic;

import at.bachmann.plc.st.stLanguage.Variable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class STLanguageLinkingDiagnosticMessageProvider extends LinkingDiagnosticMessageProvider {
  public DiagnosticMessage getUnresolvedProxyMessage(final ILinkingDiagnosticMessageProvider.ILinkingDiagnosticContext context) {
    DiagnosticMessage _xblockexpression = null;
    {
      EReference _reference = context.getReference();
      final EClass referenceType = _reference.getEReferenceType();
      DiagnosticMessage _xifexpression = null;
      Class<?> _instanceClass = referenceType.getInstanceClass();
      String _name = _instanceClass.getName();
      String _name_1 = Variable.class.getName();
      boolean _equals = _name.equals(_name_1);
      if (_equals) {
        DiagnosticMessage _xblockexpression_1 = null;
        {
          String linkText = "";
          try {
            String _linkText = context.getLinkText();
            linkText = _linkText;
          } catch (final Throwable _t) {
            if (_t instanceof IllegalNodeException) {
              final IllegalNodeException e = (IllegalNodeException)_t;
              INode _node = e.getNode();
              String _text = _node.getText();
              linkText = _text;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          final String msg = (("The variable \'" + linkText) + "\' is not declared.");
          _xblockexpression_1 = new DiagnosticMessage(msg, Severity.ERROR, Diagnostic.LINKING_DIAGNOSTIC);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = super.getUnresolvedProxyMessage(context);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
