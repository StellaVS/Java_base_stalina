package dp.ort.ua.task_OOP_03_module_8;

public class ImplementString {
	private char[] symbols;

	public ImplementString(char[] symbol) {
		symbols = symbol;
	}

	public ImplementString(String userStr) {
		this.symbols = userStr.toCharArray();
	}

	/**
	 * return lenght string
	 * 
	 * @return
	 */

	public int lenght() {
		return symbols.length;
	}

	/**
	 * add to the end string symbol from user
	 * 
	 * @param userSymbols
	 */
	public void appendChar(char userSymbols) {
		char[] arrSymbols = new char[this.symbols.length + 1];
		for (int i = 0; i < this.symbols.length; ++i) {
			arrSymbols[i] = this.symbols[i];
		}
		arrSymbols[this.symbols.length] = userSymbols;
		this.symbols = arrSymbols;
	}

	/**
	 * create array of char
	 * 
	 * @return
	 */
	public char[] toCharArray() {
		return symbols;
	}

	/**
	 * bonding lines
	 * 
	 * @param str
	 * @return
	 */
	public ImplementString concat(ImplementString str) {
		char[] strArr = str.toCharArray();
		char[] copySymbols = new char[str.lenght() + symbols.length];

		for (int i = 0; i < this.symbols.length; ++i) {
			copySymbols[i] = this.symbols[i];
		}
		for (int i = symbols.length; i < copySymbols.length; ++i) {
			copySymbols[i] = strArr[i - strArr.length];
		}
		return new ImplementString(copySymbols);

	}

	/**
	 * search first index of symbol in line
	 * 
	 * @param symbol
	 * @return
	 */
	public int firstIndexOf(char symbol) {

		for (int i = 0; i < symbols.length; ++i) {
			if (symbols[i] == symbol)
				return i + 1;
		}
		return -1;
	}

	/**
	 * search last index of symbol in line
	 * 
	 * @param symbol
	 * @return
	 */
	public int lastIndexOf(char symbol) {
		for (int i = symbols.length - 1; i >= 0; --i) {
			if (symbols[i] == symbol)
				return i + 1;
		}
		return -1;
	}

	/**
	 * converting ImplementString to string
	 */
	@Override
	public String toString() {
		return new String(symbols);
	}
}
