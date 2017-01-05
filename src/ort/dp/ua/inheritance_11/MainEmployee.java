package ort.dp.ua.inheritance_11;

import java.util.Arrays;

public class MainEmployee {
/*	11. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой (один из потомков) и фиксированной оплатой (второй потомок). Описать в базовом классе абстрактный метод для расчета среднемесячной заработной платы. Для «повременщиков» формула для расчета такова: «среднемесячная заработная плата = 20.8 * 8 * почасовую ставку», для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированной месячной оплате».
			a) Упорядочить всю последовательность работников по убыванию среднемесячного заработка. При совпадении зарплаты – упорядочивать данные по алфавиту по имени. Вывести идентификатор работника, имя и среднемесячный заработок для всех элементов списка.
			b) Вывести первые 5 имен работников из полученного в пункте а) списка.
			c) Вывести последние 3 идентификатора работников из полученного в пункте а) списка.
*/
	public static void main(String[] args) {
		int index = 0;
		Employee[] employeeM = new Employee[6];
		employeeM[0] = new EmployeeFixedRate("Ivan", 5555, "01257866");
		employeeM[1] = new EmployeeHourlyPayment("Vasya", 10, "01257863");
		employeeM[2] = new EmployeeHourlyPayment("Zoya", 5, "01257869");
		employeeM[3] = new EmployeeFixedRate("Cifra", 5555, "01257868");
		employeeM[4] = new EmployeeFixedRate("Andy", 5555, "01257877");
		employeeM[5] = new EmployeeFixedRate("Fedor", 5555, "01257958");

		Arrays.sort(employeeM);
		System.out
				.println("a) Упорядочить всю последовательность работников по убыванию среднемесячного заработка. "
						+ "При совпадении зарплаты – упорядочивать данные по алфавиту по имени. Вывести идентификатор работника, "
						+ "имя и среднемесячный заработок для всех элементов списка.");

		for (Employee i : employeeM) {
			System.out.println(i.getPersNumber() + " - " + i.getName() + " - "
					+ i.calcAvgMonthlySalary());
		}
		System.out
				.println("b) Вывести первые 5 имен работников из полученного в пункте а) списка.");
		for (Employee i : employeeM) {
			index++;
			System.out.println(i.getName());
			if (index == 5)
				break;
		}
	
		System.out
		.println("c) Вывести последние 3 идентификатора работников из полученного в пункте а) списка.");
	for (int i = employeeM.length-3; i < employeeM.length; ++i) {
		System.out
				.println(employeeM[i].getPersNumber());
	}

}}



