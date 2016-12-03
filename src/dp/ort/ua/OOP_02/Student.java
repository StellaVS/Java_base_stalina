package dp.ort.ua.OOP_02;

import java.util.Arrays;

public class Student {
	private String _name;
	private String _surname;
	private String _patronymic;
	private String _groupNumber;
	private final int _sizeBook = 5;
	private int[] _examMarks = new int[_sizeBook];
	private int _marksCounter;
	private int _percentStipend;

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

	public int getPercentStipend() {
		return _percentStipend;
	}

	public void setPercentStipend(int percentStipend) {
		_percentStipend = percentStipend;
	}

	public String toStringStudent() {
		return "Student :" + _name + _surname + _groupNumber + _percentStipend;
	}

	public void sortStudent(Student[] arr) {
		Arrays.sort(arr);
	}

	public void setMarks(int newMark) {
		if (_marksCounter < _sizeBook) {
			_examMarks[_sizeBook] = newMark;
			_marksCounter++;
		} else
			System.out.println("Все оценки выставлены " + getSurname() + getPatronymic());
	}

	public void Percent(int[] Marks) {
		if (Marks.length < 3) {
			System.out.println("Оценок не достаточно для расчета стипендии");
		} else {
			for (int i = 0; i < Marks.length; ++i) {
				if (Marks[i] == SystemMarks.getExcelent()) { 
				}
				if (Marks[i] == SystemMarks.getGood()) {
				}
				if (Marks[i] == SystemMarks.getTernary()) {
				}
			}
		}

	}
}
