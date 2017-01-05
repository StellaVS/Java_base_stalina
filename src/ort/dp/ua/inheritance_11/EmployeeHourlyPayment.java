package ort.dp.ua.inheritance_11;

public class EmployeeHourlyPayment extends Employee {

	public EmployeeHourlyPayment(String name, int rate, String persNumber) {
		super(name, rate, persNumber);
	}

	@Override
	int calcAvgMonthlySalary() {
		return (int) (20.8 * 8 * getRate());
	}

}
