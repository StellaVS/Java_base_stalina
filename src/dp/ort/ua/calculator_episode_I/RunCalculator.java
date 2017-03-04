package dp.ort.ua.calculator_episode_I;

public class RunCalculator {

	public static void main(String[] args) {

		ConsoleUserInterface calc = new ConsoleUserInterface();
		try {
			calc.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fiasco");
	}
}
