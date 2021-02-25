package lesson13;

public class Employee {
	
	public static void main(String[] args) {
		
		byte denNedeli = 1;
		final int a = 1;
		final int b = 2;
		
		switch (denNedeli * 3) {
			case 1:
//				System.out.println("Rabota do 18:00");
//				break;
			case a * b:
//				System.out.println("Rabota do 18:00");
//				break;
			case 3:
//				System.out.println("Rabota do 18:00");
//				break;
			case 4:
//				System.out.println("Rabota do 18:00");
//				break;
			case 5:
				System.out.println("Rabota do 18:00");
				break;
			case 6:
				System.out.println("Rabota do 14:00");
				break;
			case 7:
				System.out.println("Vihodnoi");
				break;
			default:
				System.out.println("Takogo dnya ne sushestvuet");
		}
		
	}

}
