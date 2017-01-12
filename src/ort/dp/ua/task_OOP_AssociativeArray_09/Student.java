package ort.dp.ua.task_OOP_AssociativeArray_09;

public class Student {

	private String _name;
	private String _groupNumber;

	public Student(String name, String groupNumber) {
		super();
		_name = name;
		_groupNumber = groupNumber;
	}
	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getGroupNumber() {
		return _groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		_groupNumber = groupNumber;
	}

}
