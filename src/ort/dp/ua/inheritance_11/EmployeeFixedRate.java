package ort.dp.ua.inheritance_11;

public class EmployeeFixedRate extends Employee {

	public EmployeeFixedRate(String name, int rate) {
		super(name, rate);
	}

	@Override
	int calcAvgMonthlySalary() {

		return (int) getRate();
	}

}
