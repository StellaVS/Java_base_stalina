package ort.dp.ua.task_OOP_Inheritance.ForeignPassport_10;

import java.util.Date;

public class ForeignPassport extends UkrainePassport {

	private Visa _visas;

	public ForeignPassport(String firstName, String lastName, String birthday, String serialNumber, Date dateOfIssue,
			Visa visa) {
		super(firstName, lastName, birthday, serialNumber, dateOfIssue);
		setVisas(visa);

	}

	public Visa getVisas() {
		return _visas;
	}

	public void setVisas(Visa visas) {
		_visas = visas;
	}
	
	@Override
	public String toString() {
		return "ForeignPassport [_visas=" + _visas + ", getVisas()=" + getVisas() + ", toString()=" + super.toString()
		+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getBirthday()="
		+ getBirthday() + ", getSerialNumber()=" + getSerialNumber() + ", getDateOfIssue()=" + getDateOfIssue()
		+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
