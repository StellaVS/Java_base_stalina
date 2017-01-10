package ort.dp.ua.task_OOP_Inheritance.ForeignPassport_10;

import java.util.Date;

public class Visa {
	private String _typeVisa;
	private Date _dateOpen;
	private Date _dateClose;

	public String getTypeVisa() {
		return _typeVisa;
	}

	public void setTypeVisa(String typeVisa) {
		_typeVisa = typeVisa;
	}

	public Date getDateOpen() {
		return _dateOpen;
	}

	public void setDateOpen(Date dateOpen) {
		_dateOpen = dateOpen;
	}

	public Date getDateClose() {
		return _dateClose;
	}

	public void setDateClose(Date dateClose) {
		_dateClose = dateClose;
	}

}
