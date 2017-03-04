package dp.ort.ua.calculator_episode_I;

import java.util.Scanner;

public class ConsoleUserInterface implements UserInterface {
	public void run() throws Exception {
/*		boolean shouldRun = true;*/
		Scanner s = new Scanner(System.in);
		
			System.out.println("Add your mathexpression: ");
			String mathexpression = s.nextLine();
			System.out.println(SimpleCalculatorService.calculation(mathexpression));
		System.out.println("CLOSE");
		s.close();
	}

}
