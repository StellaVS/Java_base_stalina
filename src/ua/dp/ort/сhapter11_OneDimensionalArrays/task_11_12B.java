package ua.dp.ort.сhapter11_OneDimensionalArrays;

public class task_11_12B {
	public static void main(String[] args) {
		// 11.12.* Заполнить массив:
		// б) тридцатью первыми простыми числами (простым называется
		// натуральное число, большее 1, не имеющее других делителей, кроме
		// единицы и самого себя).
		int[] arrayPrimeNumber = new int[30];
		int j = 0;
		for (int i = 0; i < 500; ++i) {
			if (isPrime(i)) {
				arrayPrimeNumber[j] = i;
				j++;
			} else if (j==arrayPrimeNumber.length){
				break;
			}
		}
		PrintArray(arrayPrimeNumber);	
	}

	private static void PrintArray(int[] array) {
		for (int g = 0; g < array.length; g++) {
			System.out.println(array[g]);
		}
	}

	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}