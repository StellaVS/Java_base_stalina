package dp.ort.ua_OOP_LinkedList_08;
/*8. Односвязным списком называют набор элементов, каждый из которых 
 * содержит собственно полезные данные, и ссылку на следующий элемент.
 *  Создать такой список и реализовать для него CRUD операции*/

public class ImplementLinkedList<O> {
	private ElementList<?> _head;
	private ElementList<?> _tail;

	// create
	public void updateList(O value) {
		ElementList node = new ElementList(value);
		if (_head == null) {
			return;
		} else if (_head == _tail) {
			_head = null;
			_tail = null;
			return;
		}

	}

	public static void readList(ElementList element) {

		while (element != null) {
			System.out.println(element._value);
			element = element._next;
		}
	}

	public void deleteElementList(O value) {
		ElementList node = new ElementList(value);
		if (_head == null) {
			_head = node;
			_tail = node;
		} else {
			_tail._next = node;
			_tail = node;
		}

	}

	public boolean isEmpty() {

		return _head._next == null;

	}
}
