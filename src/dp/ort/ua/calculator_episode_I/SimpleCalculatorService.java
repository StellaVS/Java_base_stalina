package dp.ort.ua.calculator_episode_I;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class SimpleCalculatorService implements CalculatorService {
	public static final Map<Character, Integer> OPERATIONS;
	public static final char SEPARATOR = '.';

	/**
	 * Prioryty of operations
	 */
	static {
		OPERATIONS = new HashMap<Character, Integer>();
		OPERATIONS.put('*', 1);
		OPERATIONS.put('/', 1);
		OPERATIONS.put('+', 2);
		OPERATIONS.put('-', 2);
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
		System.out.println("operator " + OPERATIONS.keySet().contains(elementFromExpression));
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

	/**
	 * 
	 * @param st
	 * @param operator
	 * @return
	 */
	static Double calculateProc(LinkedList<Double> stack, char operator) {
		Double secondOperand = stack.removeLast();
		Double firstOperand = stack.removeLast();

		System.out.println(firstOperand);
		System.out.println(secondOperand);
		if (operator == '*') {
			stack.add(firstOperand * secondOperand);
		} else if (operator == '/') {
			stack.add(firstOperand / secondOperand);
		} else if (operator == '+') {
			stack.add(firstOperand + secondOperand);
		} else if (operator == '-') {
			stack.add(firstOperand - secondOperand);
		}

		if (stack.size() != 1)
			throw new IllegalArgumentException("Expression syntax error.");
		return stack.removeFirst();

	}

	public static Double calculation(String expression) {
		prepareExp(expression);
		LinkedList<Double> operandFromExp = new LinkedList<Double>();
		LinkedList<Character> operators = new LinkedList<Character>();
		for (int i = 0; i < expression.length(); i++) {
			char elementFromExpression = expression.charAt(i);
			if (isSeparator(elementFromExpression))
				continue;
			if (isOpenBracket(elementFromExpression))
				operators.add(elementFromExpression);
			else if (isCloseBracket(elementFromExpression)) {
				while (operators.getLast() != '(')
					calculateProc(operandFromExp, operators.removeLast());
				operators.removeLast();
			} else if (isOperator(elementFromExpression)) {
				while (!operators.isEmpty()
						&& OPERATIONS.get(operators.getLast()) >= OPERATIONS.get(elementFromExpression))
					calculateProc(operandFromExp, operators.removeLast());
				operators.add(elementFromExpression);
			} else {
				String operand = "";
				while (i < expression.length() && Character.isDigit(expression.charAt(i)))
					operand += expression.charAt(i++);
				--i;
				operandFromExp.add((double) Integer.parseInt(operand));
			}
		}
		while (!operators.isEmpty())
		calculateProc(operandFromExp, operators.removeLast());
		return operandFromExp.get(0);
	}

}
