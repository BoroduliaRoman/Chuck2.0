package lesson13;

public class Test1 {
	
	

}

class Student {
	
	int grade;
	
	Student(int grade) {
		this.grade = grade;
	}
	
	public static void main(String[] args) {
		
		Student st1 = new Student(3);
//		if (st1.grade == 2) {
//			System.out.println("Student dvoichnik");
//		} else if (st1.grade == 3) {
//			System.out.println("Student troichnik");
//		} else if (st1.grade == 4) {
//			System.out.println("Student horoshist");
//		} else if (st1.grade == 5) {
//			System.out.println("Student otlichnik");
//		} else {
//			System.out.println("ocenka ne verna");
//		}
		
		switch (1) {
			case 2: 
				System.out.println("Student dvoichnik");
				break;
			case 3: 
				System.out.println("Student troichnik"); 
				System.out.println("            ");
				break;				
			default: 
				System.out.println("!!!!!!!!!!!!!!");	
				break;
			case 4: 
				System.out.println("Student horoshist"); 
				break;
			case 5: 
				System.out.println("Student otlichnik"); 
				break;
//			default:
//				System.out.println("Ocenka ne verna");
		}
		
	}
	
}