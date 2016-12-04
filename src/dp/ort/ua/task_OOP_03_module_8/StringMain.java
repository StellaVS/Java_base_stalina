package dp.ort.ua.task_OOP_03_module_8;

/*4. 
Создать свой собственный класс строки, базирующийся на массиве символов.
Реализовать для него простейшие операции: 
создание, возврат длины, сложение строк, далее на ваш выбор.
*/
public class StringMain {
	public static void main(String[] args) {
		ImplementString stringOne = new ImplementString("123456");
		ImplementString stringTwo = new ImplementString("asassa0");
		
		System.out.println(stringTwo.toString());
		System.out.println(stringOne.toString());
		System.out.println(stringOne.lenght());
		stringOne.appendChar('A');
		System.out.println(stringOne.toString());
		System.out.println(stringOne.firstIndexOf('3'));
		System.out.println(stringOne.lastIndexOf('5'));
		System.out.println(stringOne.concat(stringTwo));

	}
}
