package ua.dp.ort.сhapter11_OneDimensionalArrays;

import java.util.Random;

public class task_11_11 {
	public static void main(String[] args) {
		// 11.11.* Используя датчик случайных чисел, заполнить массив из
		// двадцати элемен-тов неповторяющимися числами.
		int[] dimenArray = new int[20];
		Random random = new Random(System.nanoTime());
		for (int i = 0; i < dimenArray.length; ++i) {
			int compareA = (random.nextInt(100)*(i+1));
					dimenArray[i] = compareA;
					System.out.print(dimenArray[i] + "; ");
				}
			
		}
	}
