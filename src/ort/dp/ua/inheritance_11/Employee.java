package ort.dp.ua.inheritance_11;

abstract class Employee {
	private String _name;

	public Employee(String name, int rate) {
		_name = name;
		_rate = rate;
	}

	private int _rate;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public int getRate() {
		return _rate;
	}

	public void setRate(int rate) {
		_rate = rate;
	}

	abstract int calcAvgMonthlySalary();
}
