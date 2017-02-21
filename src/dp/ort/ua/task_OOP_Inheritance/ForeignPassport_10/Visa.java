package ort.dp.ua.task_OOP_Inheritance.ForeignPassport_10;

public class Visa {

	private String _type;
	private String _dateOpen;
	private String _dateClose;

	public Visa(String type, String dateOpen, String dateClose) {

		setTypeVisa(type);
		setDateOpen(dateOpen);
		setDateClose(dateClose);
	}

	public String getTypeVisa() {
		return _type;
	}

	public void setTypeVisa(String type) {
		_type = type;
	}

	public String getDateOpen() {
		return _dateOpen;
	}

	public void setDateOpen(String dateOpen) {
		_dateOpen = dateOpen;
	}

	public String getDateClose() {
		return _dateClose;
	}

	public void setDateClose(String dateClose) {
		_dateClose = dateClose;
	}

	@Override
	public String toString() {
		return "\nVisa [_type=" + _type + ", _dateOpen=" + _dateOpen + ", _dateClose=" + _dateClose + "]";
	}
}
