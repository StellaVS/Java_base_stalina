package ort.dp.ua.task_OOP_Inharitance.ForeignPassport_10;

import java.util.Date;

/**
 * @author Stalina
 *
 */
public class UkrainePassport {
	private String _firstName;
	private String _lastName;
	private String _birthday;
	private String _serialNumber;
	private Date _dateOfIssue;

	public UkrainePassport(String firstName, String lastName, String birthday, String serialNumber, Date dateOfIssue) {
		super();
		_firstName = firstName;
		_lastName = lastName;
		_birthday = birthday;
		_serialNumber = serialNumber;
		_dateOfIssue = dateOfIssue;
	}

	@Override
	public String toString() {
		return "UkrainePassport [_firstName=" + _firstName + ", _lastName=" + _lastName + ", _birthday=" + _birthday
				+ ", _serialNumber=" + _serialNumber + ", _dateOfIssue=" + _dateOfIssue + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getFirstName() {
		return _firstName;
	}
	
	public void setFirstName(String firstName) {
		_firstName = firstName;
	}
	
	public String getLastName() {
		return _lastName;
	}
	
	public void setLastName(String lastName) {
		_lastName = lastName;
	}
	
	public String getBirthday() {
		return _birthday;
	}
	
	public void setBirthday(String birthday) {
		_birthday = birthday;
	}
	
	public String getSerialNumber() {
		return _serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		_serialNumber = serialNumber;
	}
	
	public Date getDateOfIssue() {
		return _dateOfIssue;
	}
	
	public void setDateOfIssue(Date dateOfIssue) {
		_dateOfIssue = dateOfIssue;
	}
	
}
