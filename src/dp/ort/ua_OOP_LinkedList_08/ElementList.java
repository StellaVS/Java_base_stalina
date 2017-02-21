package dp.ort.ua_OOP_LinkedList_08;

public class ElementList<O> {

	private ElementList _next;
	private O _value;

	public ElementList(O value) {
		_value = value;
		_next = null;
	}

	public ElementList(O value, ElementList next) {
		_next = next;
		_value = value;
	}

	public ElementList getNext() {
		return _next;
	}

	public void setNext(ElementList next) {
		_next = next;
	}

	public O getValue() {
		return _value;
	}

	public void setValue(O value) {
		_value = value;
	}

}
