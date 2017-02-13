package ort.dp.ua.calculator_episode_I;

import java.util.Scanner;

public class ConsoleUserInterface implements UserInterface {
	private String _mathExpression;

	public void setMathExpression(String mathExpression) {
		_mathExpression = mathExpression;
	}

	public ConsoleUserInterface() {
		// TODO Auto-generated constructor stub
	}

	public void run() throws Exception {
		boolean shouldRun = true;
		Scanner s = new Scanner(System.in);
		while (shouldRun) {
			System.out.println("Add your mathexpression: ");
			String command = s.nextLine();
			setMathExpression(command);
			SimpleCalculatorService.calculation(command);
		}
		System.out.println("CLOSE");
		s.close();
	}

}
