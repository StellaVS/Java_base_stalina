package dp.ort.ua.OOP_02;
//2.Составить программу для начисления стипендии студентам по результатам экзаменационной сессии. Информация о результатах сессии включает в себя:

//– фамилию;
//– имя;
//– отчество;
//– номер группы;
//– экзаменационные оценки.
//Количество экзаменационных оценок не менее 3 и не более 5. Стипендия начисляется студентам, сдавшим все экзамены в сессию, по следующим правилам. Студенты, сдавшие все экзамены на "отлично" получают надбавку равную 100%; студенты, сдавшие экзамены на "хорошо" и "отлично" – 50%; а студенты, сдавшие экзамены на "хорошо", – 25%. Стипендия не начисляется студентам, имеющим в сессию более двух удовлетворительных оценок.
//Список студентов каждой группы, получивших стипендию, вывести на экран, упорядочив его по алфавиту.

public class Student_main {

	public static void main(String[] args) {
		Student[] student = new Student[5];
		student[0] = new Student("Kuzya", "Sidorov", "Petrovich", "G12564", new int[] { 5, 5, 5, 5 });
		student[1] = new Student("Ivan", "Petrov", "Petrovich", "G12564", new int[] { 4, 5, 5, 5 });
		student[2] = new Student("Petr", "Kozlov", "Petrovich", "T12564", new int[] { 4, 4, 4, 3, 5 });
		student[3] = new Student("Yana", "Frolova", "Petrovich", "G12564", new int[] { 4, 4, 4, 4, 4 });
		student[4] = new Student("Dasha", "Ivanova", "Petrovich", "T12564", new int[] { 4, 5, 4, 4, 5 });
		sortStudent(student);
		printStudents(student);
	}

	private static void sortStudent(Student[] students) {
		for (int i = students.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (students[j].getSurname().charAt(0) > students[j + 1].getSurname().charAt(0)) {

					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
	}

	private static String toStringStudent(Student student) {
		StringBuilder sb = new StringBuilder();
		sb.append(student.getSurname()).append(" ").append(student.getName()).append(" ")
				.append(student.getPatronymic()).append(" ").append(student.getGroupNumber()).append(" - ")
				.append(student.Percent(student.getExamMarks())).append(" %");
		return sb.toString();
	}

	private static void printStudents(Student[] student) {
		for (int i = 0; i < student.length; ++i) {

			String studentList = toStringStudent(student[i]);
			System.out.println(studentList);
		}

	}
}
