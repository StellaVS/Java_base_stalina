package ort.dp.ua.calculator_episode_I;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class SimpleCalculatorService implements CalculatorService {
	public static final Map<String, Integer> OPERATIONS;
	public static final char SEPARATOR = ',';

	public SimpleCalculatorService() {

	}
/**
 * Prioryty of operations
 */
	static {
		OPERATIONS = new HashMap<String, Integer>();
		OPERATIONS.put("*", 1);
		OPERATIONS.put("/", 1);
		OPERATIONS.put("+", 2);
		OPERATIONS.put("-", 2);
	}

	private boolean isNumber(String elementFromExpression) {
		Double.parseDouble(elementFromExpression);
		return true;
	}

	private Integer isFunction(String elementFromExpression) {
		for (Map.Entry<String, Integer> entry : OPERATIONS.entrySet()) {
			if (elementFromExpression.equals(OPERATIONS))
				return OPERATIONS.get(elementFromExpression);

		}
		return null;
	}

	private static boolean isSeparator(char elementFromExpression) {
		return elementFromExpression == SEPARATOR;
	}

	private static boolean isOpenBracket(char elementFromExpression) {
		return elementFromExpression == '(';
	}

	private static boolean isCloseBracket(char elementFromExpression) {
		return elementFromExpression == ')';
	}

	private static boolean isOperator(char elementFromExpression) {
		return OPERATIONS.keySet().contains(elementFromExpression);
	}

	/**
	 * method delete all surplus element from string
	 */
	public static String prepareExp(String expression) {
		expression = expression.replace(" ", "").replace("(-", "(0-").replace(",-", ",0-");
		if (expression.charAt(0) == '-') {
			expression = "0" + expression;
		}
		return expression;
	}

	static BigDecimal processOperator(LinkedList<BigDecimal> st, char op) {
		Stack<BigDecimal> stack = new Stack<BigDecimal>();
		BigDecimal operand2 = stack.pop();
		BigDecimal operand1 = stack.empty() ? BigDecimal.ZERO : stack.pop();
		if (op == '*') {
			stack.push(operand1.multiply(operand2));
		} else if (op == '/') {
			stack.push(operand1.divide(operand2));
		} else if (op == '+') {
			stack.push(operand1.add(operand2));
		} else if (op == '-') {
			stack.push(operand1.subtract(operand2));
		}

		if (stack.size() != 1)
			throw new IllegalArgumentException("Expression syntax error.");
		return stack.pop();

	}

	public static BigDecimal calculation(String expression) {
		prepareExp(expression);
		LinkedList<BigDecimal> st = new LinkedList<BigDecimal>();
		LinkedList<Character> operators = new LinkedList<Character>();
		for (int i = 0; i < expression.length(); i++) {
			char elementFromExpression = expression.charAt(i);
			if (isSeparator(elementFromExpression))
				continue;
			if (isOpenBracket(elementFromExpression))
				operators.add(elementFromExpression);
			else if (isCloseBracket(elementFromExpression)) {
				while (operators.getLast() != '(')
					processOperator(st, operators.removeLast());
				operators.removeLast();
			} else if (isOperator(elementFromExpression)) {
				while (!operators.isEmpty()
						&& OPERATIONS.get(operators.getLast()) >= OPERATIONS.get(elementFromExpression))
					;
				processOperator(st, operators.removeLast());
				operators.add(elementFromExpression);
			} else {
				String operand = "";
				while (i < expression.length() && Character.isDigit(expression.charAt(i)))
					operand += expression.charAt(i++);
				--i;
				st.add(Integer.parseInt(operand), null);
			}
		}
		while (!operators.isEmpty())
			processOperator(st, operators.removeLast());
		return st.get(0);
	}

}
