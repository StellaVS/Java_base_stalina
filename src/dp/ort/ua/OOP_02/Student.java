package dp.ort.ua.OOP_02;

public class Student {
	private String _name;
	private String _surname;
	private String _patronymic;
	private String _groupNumber;
	private final int _sizeBook = 5;
	private int[] _examMarks;
	private int _marksCounter;
	private int _percentStipend;
	private int exCounter = 0;
	private int goodCounter = 0;
	private int ternCounter = 0;

	public Student() {
	}

	public Student(String name, String surname, String patronymic, String groupNumber, int[] examMarks) {
		setName(name);
		setSurname(surname);
		setPatronymic(patronymic);
		setGroupNumber(groupNumber);
		setMarks(examMarks);
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getSurname() {
		return _surname;
	}

	public void setSurname(String surname) {
		_surname = surname;
	}

	public String getPatronymic() {
		return _patronymic;
	}

	public void setPatronymic(String patronymic) {
		_patronymic = patronymic;
	}

	public String getGroupNumber() {
		return _groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		_groupNumber = groupNumber;
	}

	public int[] getExamMarks() {
		return _examMarks;
	}

	public void setExamMarks(int[] examMarks) {
		_examMarks = examMarks;
	}

	public int getPercentStipend() {
		return _percentStipend;
	}

	public void setPercentStipend(int percentStipend) {
		_percentStipend = percentStipend;
	}

	public void setMarks(int[] examMarks) {
		if (_marksCounter < _sizeBook) {
			setExamMarks(examMarks);
			_marksCounter++;
		} else
			System.out.println("Все оценки выставлены " + getSurname() + getPatronymic());
	}

	public int Percent(int[] Marks) {
		if (Marks.length < 3) {
			System.out.println("Оценок не достаточно для расчета стипендии");
		} else {
			for (int i = 0; i < Marks.length; ++i) {
				if (Marks[i] == SystemMarks.getExcelent()) {
					exCounter++;
				} else if (Marks[i] == SystemMarks.getGood()) {
					goodCounter++;
				} else if (Marks[i] == SystemMarks.getTernary()) {
					ternCounter++;
				}
			}

			if (exCounter == Marks.length) {
				setPercentStipend(100);
			} else if (goodCounter == Marks.length) {
				setPercentStipend(25);
			} else if (ternCounter == 0) {
				setPercentStipend(50);
			}

		}
		return getPercentStipend();

	}

}
