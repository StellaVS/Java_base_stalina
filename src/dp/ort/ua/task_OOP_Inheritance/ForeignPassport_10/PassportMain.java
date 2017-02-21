package ort.dp.ua.task_OOP_Inheritance.ForeignPassport_10;

public class PassportMain {

	public static void main(String[] args) {
		Visa[] v = new Visa[3];
		v[0] = new Visa("Tourist", "16/08/2010", "16/10/2010");
		v[1] = new Visa("Diplomatic", "10/03/2011", "16/10/2015");
		v[2] = new Visa("Schengen", "16/01/2017", "16/10/2020");
		ForeignPassport passFor = new ForeignPassport("Ivan", "Petrov", "16/08/1964", " AZX 123 487", "16/08/2010");
		passFor.addVisa(v[0]);
		passFor.addVisa(v[2]);
		passFor.addVisa(v[1]);
		//System.err.printf("У гражданина %s %s " + "нет места для визы %n", getFirstName(), getLastName());
		System.out.println(passFor.toString());
	}

}
