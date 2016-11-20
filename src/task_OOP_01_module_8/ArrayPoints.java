package task_OOP_01_module_8;

/**
 * 1.Дан массив точек. Каждая точка характеризуется координатами х, у и
 * названием точки. Сортировать точки в массиве по возрастанию удаления
 * расстояния точки от начала координат и вывести их на экран
 * 
 * @author Stalina
 */
public class ArrayPoints {

	public static void main(String[] args) {
		final int g = 1;
		final int f = 10;
		Point[] point = new Point[4];

		point[0] = new Point("One", coordinateGenerator(g, f), coordinateGenerator(g, f));
		point[1] = new Point("Two", coordinateGenerator(g, f), coordinateGenerator(g, f));
		point[2] = new Point("Three", coordinateGenerator(g, f), coordinateGenerator(g, f));
		point[3] = new Point("Four", coordinateGenerator(g, f), coordinateGenerator(g, f));

		bubbleSortCoordinate(point);
		printArrayPoints(point);
	}

	private static String pointsToString(Point point) {
		StringBuilder sBPoint = new StringBuilder();
		sBPoint.append(point.pointName).append(": x=").append(point.xCoordinate).append(" y=")
				.append(point.yCoordinate).append(" расстояние от 0: ").append(lenghtPointsSegment(point));
		return sBPoint.toString();
	}

	/**
	 * Генератор случайных координат в заданном диапазоне
	 * 
	 * @param min
	 * @param max
	 * @return
	 */

	private static int coordinateGenerator(int min, int max) {
		int randCoordinate = min + (int) (Math.random() * ((max - min) + 1));
		return randCoordinate;
	}
/**
 * Сортирока пузырьком
 * @param points
 */
	private static void bubbleSortCoordinate(Point[] points) {
		for (int i = points.length - 1; i >0 ; --i) {
			for (int j = 0; j < i; ++j) {
				if (lenghtPointsSegment(points[j]) > lenghtPointsSegment(points[j + 1])) {
					Point temp = points[j];
					points[j] = points[j + 1];
					points[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * Вычисление приближеенности точки к началу координат
	 * 
	 * @param point
	 * @return
	 */
	private static double lenghtPointsSegment(Point point) {
		double segment = Math.sqrt(Math.pow(point.xCoordinate, 2) + Math.pow(point.yCoordinate, 2));
		return segment;
	}

	/**
	 * Метод вывода массива на экран
	 * 
	 * @param points
	 */
	private static void printArrayPoints(Point[] points) {
		for (int i = 0; i < points.length; i++) {
			Point point = points[i];
			String pointInfoString = pointsToString(point);
			System.out.println(pointInfoString);
		}
	}
}
