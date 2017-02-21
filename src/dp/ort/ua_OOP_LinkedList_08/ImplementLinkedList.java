package dp.ort.ua_OOP_LinkedList_08;
/*8. Односвязным списком называют набор элементов, каждый из которых 
 * содержит собственно полезные данные, и ссылку на следующий элемент.
 *  Создать такой список и реализовать для него CRUD операции
 **/

public class ImplementLinkedList<O> {
	private ElementList _head;
	private ElementList _tail;

	// create
	public ImplementLinkedList() {
		System.out.println("Create List");
	}

	/**
	 * Выводит весь список на консоль
	 */
	public void readList() {
		ElementList node = _head;
		while (node != null) {
			System.out.println(node.getValue());
			node = node.getNext();
		}
	}

	/**
	 * Вставляем значение в конец списка addLast()
	 * 
	 * @param value
	 */

	public void updateList(O value) {
		ElementList node = new ElementList(value);
		if (_head == null) {
			_head = node;
			_tail = node;
		} else {
			_tail.setNext(node);
			_tail = node;
		}
	}

	/**
	 * удаляет из списка переданное значение, первое найденное
	 * 
	 * @param value
	 */
	public void deleteElementList(O value) {
		ElementList node = _head;
		if (_head == null) {
			return;
		} else if (_head == _tail) {
			_head = null;
			_tail = null;
		} else
			while (node.getNext() != null) {
				if (node.getNext().getValue() == value) {
					if (_tail == node.getNext()) {
						_tail = node;
					}
					node.setNext(node.getNext().getNext());
					return;
				}
				node = node.getNext();
			}
	}

	public boolean isEmptyList() {
		return _head.getNext() == null;

	}
}
