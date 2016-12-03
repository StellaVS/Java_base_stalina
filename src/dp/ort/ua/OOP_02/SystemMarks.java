package dp.ort.ua.OOP_02;

public class SystemMarks {
	public static int getExcelent() {
		return EXCELENT;
	}

	public static int getGood() {
		return GOOD;
	}

	public static int getTernary() {
		return TERNARY;
	}
	public void setExCounter(int exCounter) {
		this.exCounter = exCounter;
	}

	public void setGoodCounter(int goodCounter) {
		this.goodCounter = goodCounter;
	}

	public void setTernCounter(int ternCounter) {
		this.ternCounter = ternCounter;
	}

	private static final int EXCELENT = 5;
	private static final int GOOD = 4;
	private static final int TERNARY = 3;

	private int exCounter;
	private int goodCounter;
	private int ternCounter;
}
