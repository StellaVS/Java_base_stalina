package dp.ort.ua_OOP_LinkedList_08;

public class LinkedListMain {

	public static void main(String[] args) {
		ImplementLinkedList linkedL = new ImplementLinkedList();
		
		linkedL.updateList(22.3);
		linkedL.updateList(2);
		linkedL.updateList("abcdefg");
		linkedL.updateList(15.8);
		System.out.println("Read List, выводим:");
		linkedL.readList();
		System.out.println("Update List, выводим:");
		linkedL.updateList("AAA");
		linkedL.updateList("BBB");
		linkedL.updateList("BBB");
		linkedL.readList();
		System.out.println("Удаляем элемент сипска, выводим:");
		linkedL.deleteElementList("abcdefg");
		linkedL.deleteElementList("BBB");
		linkedL.readList();
	}

}
