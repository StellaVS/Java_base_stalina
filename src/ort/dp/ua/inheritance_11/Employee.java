package ort.dp.ua.inheritance_11;

abstract class Employee implements Comparable<Employee> {
	private String _name;
	private int _rate;
	private String _persNumber;

	public Employee(String name, int rate, String persNumber) {

		_name = name;
		_rate = rate;
		_persNumber = persNumber;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public int getRate() {
		return _rate;
	}

	public String getPersNumber() {
		return _persNumber;
	}

	public void setPersNumber(String _persNumber) {
		this._persNumber = _persNumber;
	}

	public void setRate(int rate) {
		_rate = rate;
	}

	/**
	 * Abstract method for calculating the average monthly wage is implemented
	 * in each heir super class
	 * 
	 * @return
	 */
	abstract int calcAvgMonthlySalary();

	/**
	 * Arrange the entire sequence of workers descending the average monthly
	 * wage. At concurrence of salary - to organize data by name alphabetically.
	 */
	@Override
	public int compareTo(Employee obj) {
		Employee result = (Employee) obj;
		if (this.calcAvgMonthlySalary() < result.calcAvgMonthlySalary()) {
			return 1;
		} else if (this.calcAvgMonthlySalary() > result.calcAvgMonthlySalary()) {
			return -1;
		}
		return _name.compareTo(result._name);
	}

}
