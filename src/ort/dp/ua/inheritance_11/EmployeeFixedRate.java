package ort.dp.ua.inheritance_11;

public class EmployeeFixedRate extends Employee {

	public EmployeeFixedRate(String name, int rate, String persNumber) {
		super(name, rate, persNumber);
	}

	/**
	 * The calculation of the average monthly wage for salaried worker
	 */
	@Override
	int calcAvgMonthlySalary() {

		return (int) getRate();
	}

}
