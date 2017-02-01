package ort.dp.ua.calculator_episode_I;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class SimpleCalculatorService implements CalculatorService {
	public static final Map<String, Integer> OPERATIONS;
	public static final String SEPARATOR = ",";

	public SimpleCalculatorService() {

	}

	static {
		OPERATIONS = new HashMap<String, Integer>();
		OPERATIONS.put("*", 1);
		OPERATIONS.put("/", 1);
		OPERATIONS.put("+", 2);
		OPERATIONS.put("-", 2);
	}
	
	private boolean isNumber(String token) {
				Double.parseDouble(token);

				return true;
	}

	private Integer isFunction(String token) {
		for (Map.Entry<String, Integer> entry : OPERATIONS.entrySet()) {
		if (token.equals(OPERATIONS))
			return OPERATIONS.get(token);	
		
	}return null;
		}
	private boolean isSeparator(String token) {
		return token.equals(SEPARATOR);
	}

	private boolean isOpenBracket(String token) {
		return token.equals("(");
	}

	private boolean isCloseBracket(String token) {
		return token.equals(")");
	}

	private boolean isOperator(String token) {
		return OPERATIONS.keySet().contains(token);
	}

	private byte getPrecedence(String token) {
		if (token.equals("+") || token.equals("-")) {
			return 1;
		}
		return 2;
	}
	public void parserExp(String expression) {

		/**
		 * prepeare expression, delete surplus
		 */
		expression = expression.replace(" ", "").replace("(-", "(0-").replace(",-", ",0-");
		if (expression.charAt(0) == '-') {
			expression = "0" + expression;
		}
		// splitting input string into tokens
		StringTokenizer stringTokenizer = new StringTokenizer(expression, OPERATIONS + SEPARATOR + "()",
				true);
		
		
	}

}
