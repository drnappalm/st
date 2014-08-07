package at.bachmann.plc.st.serializer;

import at.bachmann.plc.st.services.STLanguageGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class STLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected STLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Ref_Deref_CircumflexAccentKeyword_1_p;
	protected AbstractElementAlias match_Stmt_List_SemicolonKeyword_1_1_a;
	protected AbstractElementAlias match_Stmt_List_SemicolonKeyword_1_1_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (STLanguageGrammarAccess) access;
		match_Ref_Deref_CircumflexAccentKeyword_1_p = new TokenAlias(true, false, grammarAccess.getRef_DerefAccess().getCircumflexAccentKeyword_1());
		match_Stmt_List_SemicolonKeyword_1_1_a = new TokenAlias(true, true, grammarAccess.getStmt_ListAccess().getSemicolonKeyword_1_1());
		match_Stmt_List_SemicolonKeyword_1_1_p = new TokenAlias(true, false, grammarAccess.getStmt_ListAccess().getSemicolonKeyword_1_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getASSIGNMENTRule())
			return getASSIGNMENTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ASSIGNMENT:
	 * 	':=';
	 */
	protected String getASSIGNMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Ref_Deref_CircumflexAccentKeyword_1_p.equals(syntax))
				emit_Ref_Deref_CircumflexAccentKeyword_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Stmt_List_SemicolonKeyword_1_1_a.equals(syntax))
				emit_Stmt_List_SemicolonKeyword_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Stmt_List_SemicolonKeyword_1_1_p.equals(syntax))
				emit_Stmt_List_SemicolonKeyword_1_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '^'+
	 */
	protected void emit_Ref_Deref_CircumflexAccentKeyword_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'*
	 */
	protected void emit_Stmt_List_SemicolonKeyword_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'+
	 */
	protected void emit_Stmt_List_SemicolonKeyword_1_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
