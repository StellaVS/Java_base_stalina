package ort.dp.ua.inheritance_11;

public class MainEmployee {

	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		emp[0] = new EmployeeFixedRate("Ivan", 123);
		emp[1] = new EmployeeHourlyPayment("Vasya", 10);
		emp[2] = new EmployeeHourlyPayment("Zoya", 5);
		emp[3] = new EmployeeFixedRate("Irra", 5555);

		for (int i = 0; i < emp.length; ++i) {
			System.out.println(emp[i].getName() + " - " + emp[i].calcAvgMonthlySalary());
		}
	}

}
