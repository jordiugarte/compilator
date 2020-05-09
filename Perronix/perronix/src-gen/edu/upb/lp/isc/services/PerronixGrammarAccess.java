/*
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PerronixGrammarAccess extends AbstractGrammarElementFinder {
	
	public class MyRacketProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.MyRacketProgram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cDefinitionsKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cDefinesAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cDefinesDefineParserRuleCall_0_2_0 = (RuleCall)cDefinesAssignment_0_2.eContents().get(0);
		private final Keyword cExecutionsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExecutionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExecutionsExpressionParserRuleCall_3_0 = (RuleCall)cExecutionsAssignment_3.eContents().get(0);
		
		//MyRacketProgram:
		//	("Definitions" ":"
		//	defines+=Define+)?
		//	"Executions" ":"
		//	executions+=Expression+;
		@Override public ParserRule getRule() { return rule; }
		
		//("Definitions" ":" defines+=Define+)? "Executions" ":" executions+=Expression+
		public Group getGroup() { return cGroup; }
		
		//("Definitions" ":" defines+=Define+)?
		public Group getGroup_0() { return cGroup_0; }
		
		//"Definitions"
		public Keyword getDefinitionsKeyword_0_0() { return cDefinitionsKeyword_0_0; }
		
		//":"
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//defines+=Define+
		public Assignment getDefinesAssignment_0_2() { return cDefinesAssignment_0_2; }
		
		//Define
		public RuleCall getDefinesDefineParserRuleCall_0_2_0() { return cDefinesDefineParserRuleCall_0_2_0; }
		
		//"Executions"
		public Keyword getExecutionsKeyword_1() { return cExecutionsKeyword_1; }
		
		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//executions+=Expression+
		public Assignment getExecutionsAssignment_3() { return cExecutionsAssignment_3; }
		
		//Expression
		public RuleCall getExecutionsExpressionParserRuleCall_3_0() { return cExecutionsExpressionParserRuleCall_3_0; }
	}
	public class DefineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.Define");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cDefineKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Assignment cParamsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParamsIDTerminalRuleCall_4_0 = (RuleCall)cParamsAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBodyAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBodyExpressionParserRuleCall_6_0 = (RuleCall)cBodyAssignment_6.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Define:
		//	"(" "define" "(" name=ID params+=ID* ")" body=Expression ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" "define" "(" name=ID params+=ID* ")" body=Expression ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//"define"
		public Keyword getDefineKeyword_1() { return cDefineKeyword_1; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//params+=ID*
		public Assignment getParamsAssignment_4() { return cParamsAssignment_4; }
		
		//ID
		public RuleCall getParamsIDTerminalRuleCall_4_0() { return cParamsIDTerminalRuleCall_4_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
		
		//body=Expression
		public Assignment getBodyAssignment_6() { return cBodyAssignment_6; }
		
		//Expression
		public RuleCall getBodyExpressionParserRuleCall_6_0() { return cBodyExpressionParserRuleCall_6_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSimpleExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cArithExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cIfExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cFunctionCallExpressionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cListIntParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cListDoubleParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cListStringParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cPrintExpressionParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cLengthListParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cListTailParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		
		//Expression:
		//	SimpleExpression | ArithExpression | IfExpression | FunctionCallExpression | ListInt | ListDouble | ListString |
		//	PrintExpression | LengthList | ListTail;
		@Override public ParserRule getRule() { return rule; }
		
		//SimpleExpression | ArithExpression | IfExpression | FunctionCallExpression | ListInt | ListDouble | ListString |
		//PrintExpression | LengthList | ListTail
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SimpleExpression
		public RuleCall getSimpleExpressionParserRuleCall_0() { return cSimpleExpressionParserRuleCall_0; }
		
		//ArithExpression
		public RuleCall getArithExpressionParserRuleCall_1() { return cArithExpressionParserRuleCall_1; }
		
		//IfExpression
		public RuleCall getIfExpressionParserRuleCall_2() { return cIfExpressionParserRuleCall_2; }
		
		//FunctionCallExpression
		public RuleCall getFunctionCallExpressionParserRuleCall_3() { return cFunctionCallExpressionParserRuleCall_3; }
		
		//ListInt
		public RuleCall getListIntParserRuleCall_4() { return cListIntParserRuleCall_4; }
		
		//ListDouble
		public RuleCall getListDoubleParserRuleCall_5() { return cListDoubleParserRuleCall_5; }
		
		//ListString
		public RuleCall getListStringParserRuleCall_6() { return cListStringParserRuleCall_6; }
		
		//PrintExpression
		public RuleCall getPrintExpressionParserRuleCall_7() { return cPrintExpressionParserRuleCall_7; }
		
		//LengthList
		public RuleCall getLengthListParserRuleCall_8() { return cLengthListParserRuleCall_8; }
		
		//ListTail
		public RuleCall getListTailParserRuleCall_9() { return cListTailParserRuleCall_9; }
	}
	public class SimpleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.SimpleExpression");
		private final RuleCall cIntExpressionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//SimpleExpression:
		//	IntExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//IntExpression
		public RuleCall getIntExpressionParserRuleCall() { return cIntExpressionParserRuleCall; }
	}
	public class PrintExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.PrintExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cPrintKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cValueAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cValueINTTerminalRuleCall_0_2_0 = (RuleCall)cValueAssignment_0_2.eContents().get(0);
		private final RuleCall cDoubleExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final RuleCall cSTRINGTerminalRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		
		//PrintExpression:
		//	"(" "print" value=INT | DoubleExpression | STRING ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" "print" value=INT | DoubleExpression | STRING ")"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"(" "print" value=INT
		public Group getGroup_0() { return cGroup_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//"print"
		public Keyword getPrintKeyword_0_1() { return cPrintKeyword_0_1; }
		
		//value=INT
		public Assignment getValueAssignment_0_2() { return cValueAssignment_0_2; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0_2_0() { return cValueINTTerminalRuleCall_0_2_0; }
		
		//DoubleExpression
		public RuleCall getDoubleExpressionParserRuleCall_1() { return cDoubleExpressionParserRuleCall_1; }
		
		//STRING ")"
		public Group getGroup_2() { return cGroup_2; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_2_0() { return cSTRINGTerminalRuleCall_2_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_2_1() { return cRightParenthesisKeyword_2_1; }
	}
	public class IntExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.IntExpression");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//IntExpression:
		//	value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}
	public class DoubleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.DoubleExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValueINTTerminalRuleCall_0_0 = (RuleCall)cValueAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//DoubleExpression:
		//	value=INT "." INT+;
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT "." INT+
		public Group getGroup() { return cGroup; }
		
		//value=INT
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0_0() { return cValueINTTerminalRuleCall_0_0; }
		
		//"."
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//INT+
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	public class StringExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.StringExpression");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//StringExpression:
		//	value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//value=STRING
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}
	public class ArithExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.ArithExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cOpAlternatives_1_0 = (Alternatives)cOpAssignment_1.eContents().get(0);
		private final Keyword cOpPlusSignKeyword_1_0_0 = (Keyword)cOpAlternatives_1_0.eContents().get(0);
		private final Keyword cOpHyphenMinusKeyword_1_0_1 = (Keyword)cOpAlternatives_1_0.eContents().get(1);
		private final Keyword cOpAsteriskKeyword_1_0_2 = (Keyword)cOpAlternatives_1_0.eContents().get(2);
		private final Keyword cOpSolidusKeyword_1_0_3 = (Keyword)cOpAlternatives_1_0.eContents().get(3);
		private final Assignment cArgsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cArgsExpressionParserRuleCall_2_0 = (RuleCall)cArgsAssignment_2.eContents().get(0);
		private final Assignment cArgsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cArgsExpressionParserRuleCall_3_0 = (RuleCall)cArgsAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		///* 
		//BooleanExpression:
		//	value = #t | #f
		//;
		//ListBoolean:
		//	"(" "list" t+=BooleanExpression+ ")"
		//;
		//*/ ArithExpression:
		//	"(" op=("+" | "-" | "*" | "/") args+=Expression args+=Expression+ ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" op=("+" | "-" | "*" | "/") args+=Expression args+=Expression+ ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//op=("+" | "-" | "*" | "/")
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//("+" | "-" | "*" | "/")
		public Alternatives getOpAlternatives_1_0() { return cOpAlternatives_1_0; }
		
		//"+"
		public Keyword getOpPlusSignKeyword_1_0_0() { return cOpPlusSignKeyword_1_0_0; }
		
		//"-"
		public Keyword getOpHyphenMinusKeyword_1_0_1() { return cOpHyphenMinusKeyword_1_0_1; }
		
		//"*"
		public Keyword getOpAsteriskKeyword_1_0_2() { return cOpAsteriskKeyword_1_0_2; }
		
		//"/"
		public Keyword getOpSolidusKeyword_1_0_3() { return cOpSolidusKeyword_1_0_3; }
		
		//args+=Expression
		public Assignment getArgsAssignment_2() { return cArgsAssignment_2; }
		
		//Expression
		public RuleCall getArgsExpressionParserRuleCall_2_0() { return cArgsExpressionParserRuleCall_2_0; }
		
		//args+=Expression+
		public Assignment getArgsAssignment_3() { return cArgsAssignment_3; }
		
		//Expression
		public RuleCall getArgsExpressionParserRuleCall_3_0() { return cArgsExpressionParserRuleCall_3_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class IfExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.IfExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIfKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCondAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCondExpressionParserRuleCall_3_0 = (RuleCall)cCondAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cThenAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cThenExpressionParserRuleCall_5_0 = (RuleCall)cThenAssignment_5.eContents().get(0);
		private final Assignment cElseAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cElseExpressionParserRuleCall_6_0 = (RuleCall)cElseAssignment_6.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//IfExpression:
		//	"(" "if" "(" cond=Expression ")" then=Expression else=Expression ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" "if" "(" cond=Expression ")" then=Expression else=Expression ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//"if"
		public Keyword getIfKeyword_1() { return cIfKeyword_1; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//cond=Expression
		public Assignment getCondAssignment_3() { return cCondAssignment_3; }
		
		//Expression
		public RuleCall getCondExpressionParserRuleCall_3_0() { return cCondExpressionParserRuleCall_3_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//then=Expression
		public Assignment getThenAssignment_5() { return cThenAssignment_5; }
		
		//Expression
		public RuleCall getThenExpressionParserRuleCall_5_0() { return cThenExpressionParserRuleCall_5_0; }
		
		//else=Expression
		public Assignment getElseAssignment_6() { return cElseAssignment_6; }
		
		//Expression
		public RuleCall getElseExpressionParserRuleCall_6_0() { return cElseExpressionParserRuleCall_6_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
	}
	public class FunctionCallExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.FunctionCallExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFunctionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cFunctionDefineCrossReference_1_0 = (CrossReference)cFunctionAssignment_1.eContents().get(0);
		private final RuleCall cFunctionDefineIDTerminalRuleCall_1_0_1 = (RuleCall)cFunctionDefineCrossReference_1_0.eContents().get(1);
		private final Assignment cArgsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cArgsExpressionParserRuleCall_2_0 = (RuleCall)cArgsAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		////LINKING
		//FunctionCallExpression:
		//	"(" function=[Define] args=Expression* ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" function=[Define] args=Expression* ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//function=[Define]
		public Assignment getFunctionAssignment_1() { return cFunctionAssignment_1; }
		
		//[Define]
		public CrossReference getFunctionDefineCrossReference_1_0() { return cFunctionDefineCrossReference_1_0; }
		
		//ID
		public RuleCall getFunctionDefineIDTerminalRuleCall_1_0_1() { return cFunctionDefineIDTerminalRuleCall_1_0_1; }
		
		//args=Expression*
		public Assignment getArgsAssignment_2() { return cArgsAssignment_2; }
		
		//Expression
		public RuleCall getArgsExpressionParserRuleCall_2_0() { return cArgsExpressionParserRuleCall_2_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ListIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.ListInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cListKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSIntExpressionParserRuleCall_2_0 = (RuleCall)cSAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ListInt:
		//	"(" "list" s+=IntExpression+ ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" "list" s+=IntExpression+ ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//"list"
		public Keyword getListKeyword_1() { return cListKeyword_1; }
		
		//s+=IntExpression+
		public Assignment getSAssignment_2() { return cSAssignment_2; }
		
		//IntExpression
		public RuleCall getSIntExpressionParserRuleCall_2_0() { return cSIntExpressionParserRuleCall_2_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ListDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.ListDouble");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cListKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTDoubleExpressionParserRuleCall_2_0 = (RuleCall)cTAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ListDouble:
		//	"(" "list" t+=DoubleExpression+ ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" "list" t+=DoubleExpression+ ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//"list"
		public Keyword getListKeyword_1() { return cListKeyword_1; }
		
		//t+=DoubleExpression+
		public Assignment getTAssignment_2() { return cTAssignment_2; }
		
		//DoubleExpression
		public RuleCall getTDoubleExpressionParserRuleCall_2_0() { return cTDoubleExpressionParserRuleCall_2_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ListStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.ListString");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cListKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTStringExpressionParserRuleCall_2_0 = (RuleCall)cTAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ListString:
		//	"(" "list" t+=StringExpression ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" "list" t+=StringExpression ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//"list"
		public Keyword getListKeyword_1() { return cListKeyword_1; }
		
		//t+=StringExpression
		public Assignment getTAssignment_2() { return cTAssignment_2; }
		
		//StringExpression
		public RuleCall getTStringExpressionParserRuleCall_2_0() { return cTStringExpressionParserRuleCall_2_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class LengthListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.LengthList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLengthKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cListIntParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//LengthList:
		//	"(" "length" ListInt ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" "length" ListInt ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//"length"
		public Keyword getLengthKeyword_1() { return cLengthKeyword_1; }
		
		//ListInt
		public RuleCall getListIntParserRuleCall_2() { return cListIntParserRuleCall_2; }
		
		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ListTailElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.upb.lp.isc.Perronix.ListTail");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cListTailKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cListIntParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ListTail:
		//	"(" "list-tail" ListInt INT ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"(" "list-tail" ListInt INT ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//"list-tail"
		public Keyword getListTailKeyword_1() { return cListTailKeyword_1; }
		
		//ListInt
		public RuleCall getListIntParserRuleCall_2() { return cListIntParserRuleCall_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
		
		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	
	
	private final MyRacketProgramElements pMyRacketProgram;
	private final DefineElements pDefine;
	private final ExpressionElements pExpression;
	private final SimpleExpressionElements pSimpleExpression;
	private final PrintExpressionElements pPrintExpression;
	private final IntExpressionElements pIntExpression;
	private final DoubleExpressionElements pDoubleExpression;
	private final StringExpressionElements pStringExpression;
	private final ArithExpressionElements pArithExpression;
	private final IfExpressionElements pIfExpression;
	private final FunctionCallExpressionElements pFunctionCallExpression;
	private final ListIntElements pListInt;
	private final ListDoubleElements pListDouble;
	private final ListStringElements pListString;
	private final LengthListElements pLengthList;
	private final ListTailElements pListTail;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PerronixGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMyRacketProgram = new MyRacketProgramElements();
		this.pDefine = new DefineElements();
		this.pExpression = new ExpressionElements();
		this.pSimpleExpression = new SimpleExpressionElements();
		this.pPrintExpression = new PrintExpressionElements();
		this.pIntExpression = new IntExpressionElements();
		this.pDoubleExpression = new DoubleExpressionElements();
		this.pStringExpression = new StringExpressionElements();
		this.pArithExpression = new ArithExpressionElements();
		this.pIfExpression = new IfExpressionElements();
		this.pFunctionCallExpression = new FunctionCallExpressionElements();
		this.pListInt = new ListIntElements();
		this.pListDouble = new ListDoubleElements();
		this.pListString = new ListStringElements();
		this.pLengthList = new LengthListElements();
		this.pListTail = new ListTailElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("edu.upb.lp.isc.Perronix".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MyRacketProgram:
	//	("Definitions" ":"
	//	defines+=Define+)?
	//	"Executions" ":"
	//	executions+=Expression+;
	public MyRacketProgramElements getMyRacketProgramAccess() {
		return pMyRacketProgram;
	}
	
	public ParserRule getMyRacketProgramRule() {
		return getMyRacketProgramAccess().getRule();
	}
	
	//Define:
	//	"(" "define" "(" name=ID params+=ID* ")" body=Expression ")";
	public DefineElements getDefineAccess() {
		return pDefine;
	}
	
	public ParserRule getDefineRule() {
		return getDefineAccess().getRule();
	}
	
	//Expression:
	//	SimpleExpression | ArithExpression | IfExpression | FunctionCallExpression | ListInt | ListDouble | ListString |
	//	PrintExpression | LengthList | ListTail;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//SimpleExpression:
	//	IntExpression;
	public SimpleExpressionElements getSimpleExpressionAccess() {
		return pSimpleExpression;
	}
	
	public ParserRule getSimpleExpressionRule() {
		return getSimpleExpressionAccess().getRule();
	}
	
	//PrintExpression:
	//	"(" "print" value=INT | DoubleExpression | STRING ")";
	public PrintExpressionElements getPrintExpressionAccess() {
		return pPrintExpression;
	}
	
	public ParserRule getPrintExpressionRule() {
		return getPrintExpressionAccess().getRule();
	}
	
	//IntExpression:
	//	value=INT;
	public IntExpressionElements getIntExpressionAccess() {
		return pIntExpression;
	}
	
	public ParserRule getIntExpressionRule() {
		return getIntExpressionAccess().getRule();
	}
	
	//DoubleExpression:
	//	value=INT "." INT+;
	public DoubleExpressionElements getDoubleExpressionAccess() {
		return pDoubleExpression;
	}
	
	public ParserRule getDoubleExpressionRule() {
		return getDoubleExpressionAccess().getRule();
	}
	
	//StringExpression:
	//	value=STRING;
	public StringExpressionElements getStringExpressionAccess() {
		return pStringExpression;
	}
	
	public ParserRule getStringExpressionRule() {
		return getStringExpressionAccess().getRule();
	}
	
	///* 
	//BooleanExpression:
	//	value = #t | #f
	//;
	//ListBoolean:
	//	"(" "list" t+=BooleanExpression+ ")"
	//;
	//*/ ArithExpression:
	//	"(" op=("+" | "-" | "*" | "/") args+=Expression args+=Expression+ ")";
	public ArithExpressionElements getArithExpressionAccess() {
		return pArithExpression;
	}
	
	public ParserRule getArithExpressionRule() {
		return getArithExpressionAccess().getRule();
	}
	
	//IfExpression:
	//	"(" "if" "(" cond=Expression ")" then=Expression else=Expression ")";
	public IfExpressionElements getIfExpressionAccess() {
		return pIfExpression;
	}
	
	public ParserRule getIfExpressionRule() {
		return getIfExpressionAccess().getRule();
	}
	
	////LINKING
	//FunctionCallExpression:
	//	"(" function=[Define] args=Expression* ")";
	public FunctionCallExpressionElements getFunctionCallExpressionAccess() {
		return pFunctionCallExpression;
	}
	
	public ParserRule getFunctionCallExpressionRule() {
		return getFunctionCallExpressionAccess().getRule();
	}
	
	//ListInt:
	//	"(" "list" s+=IntExpression+ ")";
	public ListIntElements getListIntAccess() {
		return pListInt;
	}
	
	public ParserRule getListIntRule() {
		return getListIntAccess().getRule();
	}
	
	//ListDouble:
	//	"(" "list" t+=DoubleExpression+ ")";
	public ListDoubleElements getListDoubleAccess() {
		return pListDouble;
	}
	
	public ParserRule getListDoubleRule() {
		return getListDoubleAccess().getRule();
	}
	
	//ListString:
	//	"(" "list" t+=StringExpression ")";
	public ListStringElements getListStringAccess() {
		return pListString;
	}
	
	public ParserRule getListStringRule() {
		return getListStringAccess().getRule();
	}
	
	//LengthList:
	//	"(" "length" ListInt ")";
	public LengthListElements getLengthListAccess() {
		return pLengthList;
	}
	
	public ParserRule getLengthListRule() {
		return getLengthListAccess().getRule();
	}
	
	//ListTail:
	//	"(" "list-tail" ListInt INT ")";
	public ListTailElements getListTailAccess() {
		return pListTail;
	}
	
	public ParserRule getListTailRule() {
		return getListTailAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
