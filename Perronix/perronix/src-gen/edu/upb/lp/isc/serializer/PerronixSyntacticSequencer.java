/*
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.serializer;

import com.google.inject.Inject;
import edu.upb.lp.isc.services.PerronixGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class PerronixSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PerronixGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DoubleExpression_INTTerminalRuleCall_2_p;
	protected AbstractElementAlias match_LengthList_ListTail_____LeftParenthesisKeyword_0_LengthKeyword_1___or___LeftParenthesisKeyword_0_ListTailKeyword_1____q;
	protected AbstractElementAlias match_WhileLoop_NotKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PerronixGrammarAccess) access;
		match_DoubleExpression_INTTerminalRuleCall_2_p = new TokenAlias(true, false, grammarAccess.getDoubleExpressionAccess().getINTTerminalRuleCall_2());
		match_LengthList_ListTail_____LeftParenthesisKeyword_0_LengthKeyword_1___or___LeftParenthesisKeyword_0_ListTailKeyword_1____q = new AlternativeAlias(false, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLengthListAccess().getLeftParenthesisKeyword_0()), new TokenAlias(false, false, grammarAccess.getLengthListAccess().getLengthKeyword_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getListTailAccess().getLeftParenthesisKeyword_0()), new TokenAlias(false, false, grammarAccess.getListTailAccess().getListTailKeyword_1())));
		match_WhileLoop_NotKeyword_2_q = new TokenAlias(false, true, grammarAccess.getWhileLoopAccess().getNotKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING:
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_DoubleExpression_INTTerminalRuleCall_2_p.equals(syntax))
				emit_DoubleExpression_INTTerminalRuleCall_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LengthList_ListTail_____LeftParenthesisKeyword_0_LengthKeyword_1___or___LeftParenthesisKeyword_0_ListTailKeyword_1____q.equals(syntax))
				emit_LengthList_ListTail_____LeftParenthesisKeyword_0_LengthKeyword_1___or___LeftParenthesisKeyword_0_ListTailKeyword_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_WhileLoop_NotKeyword_2_q.equals(syntax))
				emit_WhileLoop_NotKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     INT+
	 *
	 * This ambiguous syntax occurs at:
	 *     value=INT '.' (ambiguity) (rule end)
	 */
	protected void emit_DoubleExpression_INTTerminalRuleCall_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (('(' 'length') | ('(' 'list-tail'))?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' 'list' s+=IntExpression
	 */
	protected void emit_LengthList_ListTail_____LeftParenthesisKeyword_0_LengthKeyword_1___or___LeftParenthesisKeyword_0_ListTailKeyword_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'not'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '(' 'while' (ambiguity) '(' function=[Define|ID]
	 */
	protected void emit_WhileLoop_NotKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}