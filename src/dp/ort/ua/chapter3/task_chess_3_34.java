package dp.ort.ua.chapter3;

public class task_chess_3_34 {

		public final static int MIN = 1;
		public final static int MAX = 8;
		public final static int startPosBlackPawns = 7;
		public final static int startPosWhitePawns = 2;

		/*
		 * Поле шахматной доски определяется парой натуральных чисел, каждое из
		 * ко-торых не превосходит 8: первое число — номер вертикали (при счете
		 * слева направо), второе — номер горизонтали (при счете снизу вверх). Даны
		 * нату-ральные числа a, b, c, d, каждое из которых не превосходит 8.
		 */
		public static void main(String[] args) {
			int a = MIN + (int) (Math.random() * (MAX - MIN));
			int b = MIN + (int) (Math.random() * (MAX - MIN));
			int c = MIN + (int) (Math.random() * (MAX - MIN));
			int d = MIN + (int) (Math.random() * (MAX - MIN));
			int positionFigure = a - c;
			int positionMotion = b - d;
			int pawVarCourse = b - d;

			if (positionFigure < 0) {
				positionFigure *= -1;
			}
			if (positionMotion < 0) {
				positionMotion *= -1;
			}
			if (a == c || b == d) {
				System.out.println(
						"а) Если на поле (" + a + " " + b + ") расположена ладья, угрожает полю " + "(" + c + " " + d + ")");
			}
			if (positionFigure == positionMotion) {
				System.out.println(
						"б) Если на поле (" + a + " " + b + ") расположен слон, угрожает полю " + "(" + c + " " + d + ")");
			}
			if ((positionFigure + positionMotion == 1)
					|| (positionFigure + positionMotion == 2 && positionFigure == 1 && positionMotion == 1)) {
				System.out.println("в) Если на поле (" + a + " " + b
						+ ") расположен король он может одним ходом попасть на поле " + "(" + c + " " + d + ")");
			}
			if (a == c || b == d || positionFigure == positionMotion) {
				System.out.println(
						"г) Если на поле (" + a + " " + b + ") расположен ферзь, угрожает полю " + "(" + c + " " + d + ")");
			}
			if (b == startPosWhitePawns && a == c) {
				System.out.println("д.1) Если на поле (" + a + " " + b
						+ ") расположена белая пешка, она может одним ходом попасть на поле " + "(" + c + " " + d + ")");
			}
			if (pawVarCourse == 1) {
				System.out.println("д.2) Если на поле (" + a + " " + b
						+ ") расположена белая пешка, она бьет фигуру или пешку соперника " + "(" + c + " " + d + ")");
			}
			if (b == startPosBlackPawns && a == c) {
				System.out.println("е.1) Если на поле (" + a + " " + b
						+ ") расположена черная пешка, она может одним ходом попасть на поле " + "(" + c + " " + d + ")");
			}
			if (pawVarCourse == -1) {
				System.out.println("е.2) Если на поле (" + a + " " + b
						+ ") расположена черная пешка, она бьет фигуру или пешку соперника " + "(" + c + " " + d + ")");
			}

			if (positionFigure != 0 && positionMotion != 0 && positionFigure + positionMotion == 3) {
				System.out.println(
						"ж) Если на поле (" + a + " " + b + ") расположен конь, угрожает полю " + "(" + c + " " + d + ")");
			}
	}

}
