/*
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.upb.lp.isc.ide.contentassist.antlr.internal.InternalPerronixParser;
import edu.upb.lp.isc.services.PerronixGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PerronixParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PerronixGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PerronixGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getPrintExpressionAccess().getAlternatives(), "rule__PrintExpression__Alternatives");
			builder.put(grammarAccess.getArithExpressionAccess().getOpAlternatives_1_0(), "rule__ArithExpression__OpAlternatives_1_0");
			builder.put(grammarAccess.getMyRacketProgramAccess().getGroup(), "rule__MyRacketProgram__Group__0");
			builder.put(grammarAccess.getMyRacketProgramAccess().getGroup_0(), "rule__MyRacketProgram__Group_0__0");
			builder.put(grammarAccess.getDefineAccess().getGroup(), "rule__Define__Group__0");
			builder.put(grammarAccess.getPrintExpressionAccess().getGroup_0(), "rule__PrintExpression__Group_0__0");
			builder.put(grammarAccess.getPrintExpressionAccess().getGroup_2(), "rule__PrintExpression__Group_2__0");
			builder.put(grammarAccess.getDoubleExpressionAccess().getGroup(), "rule__DoubleExpression__Group__0");
			builder.put(grammarAccess.getArithExpressionAccess().getGroup(), "rule__ArithExpression__Group__0");
			builder.put(grammarAccess.getIfExpressionAccess().getGroup(), "rule__IfExpression__Group__0");
			builder.put(grammarAccess.getFunctionCallExpressionAccess().getGroup(), "rule__FunctionCallExpression__Group__0");
			builder.put(grammarAccess.getListIntAccess().getGroup(), "rule__ListInt__Group__0");
			builder.put(grammarAccess.getListDoubleAccess().getGroup(), "rule__ListDouble__Group__0");
			builder.put(grammarAccess.getListStringAccess().getGroup(), "rule__ListString__Group__0");
			builder.put(grammarAccess.getLengthListAccess().getGroup(), "rule__LengthList__Group__0");
			builder.put(grammarAccess.getListTailAccess().getGroup(), "rule__ListTail__Group__0");
			builder.put(grammarAccess.getWhileLoopAccess().getGroup(), "rule__WhileLoop__Group__0");
			builder.put(grammarAccess.getMyRacketProgramAccess().getDefinesAssignment_0_2(), "rule__MyRacketProgram__DefinesAssignment_0_2");
			builder.put(grammarAccess.getMyRacketProgramAccess().getExecutionsAssignment_3(), "rule__MyRacketProgram__ExecutionsAssignment_3");
			builder.put(grammarAccess.getDefineAccess().getNameAssignment_3(), "rule__Define__NameAssignment_3");
			builder.put(grammarAccess.getDefineAccess().getParamsAssignment_4(), "rule__Define__ParamsAssignment_4");
			builder.put(grammarAccess.getDefineAccess().getBodyAssignment_6(), "rule__Define__BodyAssignment_6");
			builder.put(grammarAccess.getPrintExpressionAccess().getValueAssignment_0_2(), "rule__PrintExpression__ValueAssignment_0_2");
			builder.put(grammarAccess.getIntExpressionAccess().getValueAssignment(), "rule__IntExpression__ValueAssignment");
			builder.put(grammarAccess.getDoubleExpressionAccess().getValueAssignment_0(), "rule__DoubleExpression__ValueAssignment_0");
			builder.put(grammarAccess.getStringExpressionAccess().getValueAssignment(), "rule__StringExpression__ValueAssignment");
			builder.put(grammarAccess.getArithExpressionAccess().getOpAssignment_1(), "rule__ArithExpression__OpAssignment_1");
			builder.put(grammarAccess.getArithExpressionAccess().getArgsAssignment_2(), "rule__ArithExpression__ArgsAssignment_2");
			builder.put(grammarAccess.getArithExpressionAccess().getArgsAssignment_3(), "rule__ArithExpression__ArgsAssignment_3");
			builder.put(grammarAccess.getIfExpressionAccess().getCondAssignment_3(), "rule__IfExpression__CondAssignment_3");
			builder.put(grammarAccess.getIfExpressionAccess().getThenAssignment_5(), "rule__IfExpression__ThenAssignment_5");
			builder.put(grammarAccess.getIfExpressionAccess().getElseAssignment_6(), "rule__IfExpression__ElseAssignment_6");
			builder.put(grammarAccess.getFunctionCallExpressionAccess().getFunctionAssignment_1(), "rule__FunctionCallExpression__FunctionAssignment_1");
			builder.put(grammarAccess.getFunctionCallExpressionAccess().getArgsAssignment_2(), "rule__FunctionCallExpression__ArgsAssignment_2");
			builder.put(grammarAccess.getListIntAccess().getSAssignment_2(), "rule__ListInt__SAssignment_2");
			builder.put(grammarAccess.getListDoubleAccess().getTAssignment_2(), "rule__ListDouble__TAssignment_2");
			builder.put(grammarAccess.getListStringAccess().getTAssignment_2(), "rule__ListString__TAssignment_2");
			builder.put(grammarAccess.getWhileLoopAccess().getFunctionAssignment_4(), "rule__WhileLoop__FunctionAssignment_4");
			builder.put(grammarAccess.getWhileLoopAccess().getArgsAssignment_5(), "rule__WhileLoop__ArgsAssignment_5");
			builder.put(grammarAccess.getWhileLoopAccess().getFunctionAssignment_7(), "rule__WhileLoop__FunctionAssignment_7");
			builder.put(grammarAccess.getWhileLoopAccess().getArgsAssignment_8(), "rule__WhileLoop__ArgsAssignment_8");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PerronixGrammarAccess grammarAccess;

	@Override
	protected InternalPerronixParser createParser() {
		InternalPerronixParser result = new InternalPerronixParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PerronixGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PerronixGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}