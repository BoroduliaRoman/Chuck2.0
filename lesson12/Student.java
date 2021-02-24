package homework.lesson12;

public class Student {

	String name;
	int course;
	double grade;
	
	Student(String name, int course, double grade) {
		this.name = name;
		this.course = course;
		this.grade = grade;
	}
	
}

class StudentTest {
	
	void comparesTwoObjects(Student s1, Student s2) {
		if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade) {
			System.out.println("Обьекты равны");
		} else {
			System.out.println("Обьекты не равны");
		}
	}
	
	void comparesTwoObjectsByAttributes(Student s1, Student s2) {
		if (s1.name.equals(s2.name)) {
			if (s1.course == s2.course) {
				if (s1.grade == s2.grade) {
					System.out.println("Студенты равны");
				} else {
					System.out.println("Студенты не ровны по среднему баллу");
				}
			} else {
				System.out.println("Студенты не ровны по курсу");
			}
		} else {
			System.out.println("Студенты не ровны по именам");
		}
	}
	
	
	public static void main(String[] args) {
		
		Student st1 = new Student("Roman", 3, 4.0);
		Student st2 = new Student("Roman", 3, 4.0);
		
		StudentTest stt1 = new StudentTest();
		stt1.comparesTwoObjects(st1, st2);
		
		StudentTest stt2 = new StudentTest();
		stt2.comparesTwoObjectsByAttributes(st1, st2);
		
		
		
	}
}