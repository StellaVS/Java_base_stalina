package ort.dp.ua.inheritance_11;

public class EmployeeHourlyPayment extends Employee {

	public EmployeeHourlyPayment(String name, int rate, String persNumber) {
		super(name, rate, persNumber);
	}

	/**
	 * The calculation of the average monthly wage for pieceworker
	 */
	@Override
	int calcAvgMonthlySalary() {
		return (int) (20.8 * 8 * getRate());
	}

}