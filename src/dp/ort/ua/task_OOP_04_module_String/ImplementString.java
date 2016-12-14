package dp.ort.ua.task_OOP_04_module_String;

public class ImplementString {
	private char[] _symbols;

	public ImplementString(char[] symbol) {
		_symbols = new char[symbol.length];
		copyArr(symbol);
	}

	public ImplementString(String userStr) {
		this._symbols = userStr.toCharArray();
	}

	/**
	 * return lenght string
	 * 
	 * @return
	 */

	public int lenght() {
		return _symbols.length;
	}

	/**
	 * add to the end string symbol from user
	 * 
	 * @param userSymbol
	 */
	public void appendChar(char userSymbol) {
		char[] arrSymbols = new char[this._symbols.length + 1];
		for (int i = 0; i < this._symbols.length; ++i) {
			arrSymbols[i] = this._symbols[i];
		}
		arrSymbols[this._symbols.length] = userSymbol;
		this._symbols = arrSymbols;
	}

	/**
	 * create array of char
	 * 
	 * @return
	 */

	public char[] toCharArray() {
		char copySymbols[] = new char[_symbols.length];
		System.arraycopy(_symbols, 0, copySymbols, 0, _symbols.length);
		return copySymbols;
	}

	/**
	 * bonding lines
	 * 
	 * @param str
	 * @return
	 */
	public ImplementString concat(ImplementString str) {
		char[] strArr = str.toCharArray();
		char[] copySymbols = new char[str.lenght() + _symbols.length];

		for (int i = 0; i < this._symbols.length; ++i) {
			copySymbols[i] = this._symbols[i];
		}
		for (int i = _symbols.length; i < copySymbols.length; ++i) {
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

		for (int i = 0; i < _symbols.length; ++i) {
			if (_symbols[i] == symbol)
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
		for (int i = _symbols.length - 1; i >= 0; --i) {
			if (_symbols[i] == symbol)
				return i + 1;
		}
		return -1;
	}

	private void copyArr(char[] array) {
		for (int i = 0; i < array.length; i++) {
			_symbols[i] = array[i];
		}
	}

	/**
	 * converting ImplementString to string
	 */
	@Override
	public String toString() {
		return new String(_symbols);
	}
}
