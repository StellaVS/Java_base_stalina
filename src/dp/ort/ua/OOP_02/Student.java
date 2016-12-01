package dp.ort.ua.OOP_02;

public class Student {
	private String _name;
	private String _surname;
	private String _patronymic;
	private String _groupNumber;
	private int[] _examMarks;
	private final int _sizeBook = 5;

	public Student() {
	}

	public Student(String name, String surname, String patronymic, String groupNumber, int[] examMarks) {

	}

	public void setStudent(String name, String surname, String patronymic, String groupNumber) {
		_name = name;
		_surname = surname;
		_patronymic = patronymic;
		_groupNumber = groupNumber;
	}

	public void setMarks(int Mark) {
		if (Mark == 0) {
			return;
		}
		_examMarks[_sizeBook] = Mark;
		_sizeBook++;
	}

}
