package ua.dp.ort.chapter9_characterString;

/*9.185.*Строка содержит арифметическое выражение, в котором используются круглые скобки, в том числе вложенные. Проверить, правильно ли в нем расставлены скобки.
а) Ответом должны служить слова да или нет.
*/
public class task_9_185 {
	public static void main(String[] args) {
		int counter1 = 0, counter2 = 0;
		String lineWithStaple = "((((((((()))))))))(((())));";
	
		for (int i = 0; i < lineWithStaple.length(); ++i) {
			if (lineWithStaple.indexOf('(') < lineWithStaple.indexOf(')') && lineWithStaple.indexOf('(', i) == i) {
				counter1++;
			} else if (lineWithStaple.indexOf(')', i) == i) {
				counter2++;
			}
		}
		if (counter1 == counter2) {
			System.out.println(counter1 + "=" + counter2 + " YES!");
		} else {
			System.out.println("NO");
		}
	}
}
