package ua.dp.ort.chapter9;

public class task_9_167 {
	// 9.167. Дано предложение. Напечатать все его слова, отличные от слова
	// привет.
	public static void main(String[] args) {
		String hi = "Привет";
		StringBuffer strigOfWords = new StringBuffer("Как много в этом слове Привет.И добродушие,и свет...");
		strigOfWords.delete(strigOfWords.indexOf(hi), strigOfWords.indexOf(hi) + hi.length());
		System.out.println(strigOfWords);
	}

}
