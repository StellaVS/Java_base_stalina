package ua.dp.ort.сhapter11_OneDimensionalArrays;

public class Task_11_12A {
	public static void main(String[] args) {
		// 11.12.* Заполнить массив:
		// а) двадцатью первыми натуральными числами, делящимися нацело на 13
		// или на 17 и находящимися в интервале, левая граница которого равна
		// 300;
		int[] array = new int[20];
		int i = 0;
		for (int j = 13; j < 300; ++j) {
			if (j % 13 == 0 || j % 17 == 0 && i < array.length) {
				array[i] = j;
				System.out.println(array[i] + " - " + (i+1));
				i++;
			} else if (i == array.length) {
				break;
			}
		}
	}
}
