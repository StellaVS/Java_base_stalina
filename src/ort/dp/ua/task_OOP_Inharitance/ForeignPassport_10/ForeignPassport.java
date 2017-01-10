package ort.dp.ua.task_OOP_Inharitance.ForeignPassport_10;

import java.util.Date;

public class ForeignPassport extends UkrainePassport {
	private Visa _visas;

	public ForeignPassport(String firstName, String lastName, String birthday, String serialNumber, Date dateOfIssue,
			Visa visa) {
		super(firstName, lastName, birthday, serialNumber, dateOfIssue);
		_visas = visa;

	}
}
