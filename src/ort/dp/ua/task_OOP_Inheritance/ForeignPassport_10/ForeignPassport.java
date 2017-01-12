package ort.dp.ua.task_OOP_Inheritance.ForeignPassport_10;

import java.util.Arrays;

public class ForeignPassport extends UkrainePassport {

	private Visa[] _visas = new Visa[20];
	private int _visaCounter = 0;

	public ForeignPassport(String firstName, String lastName, String birthday, String serialNumber,
			String dateOfIssue) {
		super(firstName, lastName, birthday, serialNumber, dateOfIssue);

	}

	public void addVisa(Visa visa) {
		if (_visaCounter < _visas.length) {
			_visas[_visaCounter++] = visa;
		} else {
			System.err.printf("У гражданина %s %s " + "нет места для визы %n", getFirstName(), getLastName());
		}
	}

	public Visa[] getVisas() {
		Visa[] result = new Visa[_visaCounter];
		System.arraycopy(_visas, 0, result, 0, _visaCounter);
		return result;
	}

	@Override
	public String toString() {
		return "ForeignPassport [getVisas()="+ Arrays.toString(getVisas()) + ", \ngetFirstName()=" + getFirstName()
				+ ", \ngetLastName()=" + getLastName() + ", \ngetBirthday()=" + getBirthday() + ", \ngetSerialNumber()="
				+ getSerialNumber() + ", \ngetDateOfIssue()=" + getDateOfIssue() + "]";
	}

}
