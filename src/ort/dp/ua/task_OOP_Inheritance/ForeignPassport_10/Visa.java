package ort.dp.ua.task_OOP_Inheritance.ForeignPassport_10;


public class Visa {

	private String _typeVisa;
	private String _dateOpen;
	private String _dateClose;


	public Visa(String typeVisa, String dateOpen, String dateClose) {
		
		_typeVisa = typeVisa;
		_dateOpen = dateOpen;
		_dateClose = dateClose;
	}

	public String getTypeVisa() {
		return _typeVisa;
	}

	public void setTypeVisa(String typeVisa) {
		_typeVisa = typeVisa;
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
		return "\nVisa [_typeVisa=" + _typeVisa + ", _dateOpen=" + _dateOpen + ", _dateClose=" + _dateClose + "]";
	}
}
