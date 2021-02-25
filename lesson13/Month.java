package homework.lesson13;

public class Month {
	
	static void displaysNumberOfDaysInAMonth(int a) {
		switch(a) {
			case 1:
				System.out.println("январь, кол-во дней: 31");
				break;
			case 2:
				System.out.println("‘евраль, кол-во дней: 28");
				break;
			case 3:
				System.out.println("ћарт, кол-во дней: 31");
				break;
			case 4:
				System.out.println("јпрель, кол-во дней: 30");
				break;
			case 5:
				System.out.println("ћай, кол-во дней: 31");
				break;
			case 6:
				System.out.println("»юнь, кол-во дней: 30");
				break;
			case 7:
				System.out.println("»юль, кол-во дней: 31");
				break;
			case 8:
				System.out.println("јвгуст, кол-во дней: 31");
				break;
			case 9:
				System.out.println("—ент€брь, кол-во дней: 30");
				break;
			case 10:
				System.out.println("ќкт€брь, кол-во дней: 31");
				break;
			case 11:
				System.out.println("Ќо€брь, кол-во дней: 30");
				break;
			case 12:
				System.out.println("ƒекабрь, кол-во дней: 31");
				break;
			default:
				System.out.println("“акого мес€ца не существует");				
		}
		
	}

	public static void main(String[] args) {
		displaysNumberOfDaysInAMonth(1);
		displaysNumberOfDaysInAMonth(2);
		displaysNumberOfDaysInAMonth(3);
		displaysNumberOfDaysInAMonth(4);
		displaysNumberOfDaysInAMonth(5);
		displaysNumberOfDaysInAMonth(6);
		displaysNumberOfDaysInAMonth(7);
		displaysNumberOfDaysInAMonth(8);
		displaysNumberOfDaysInAMonth(9);
		displaysNumberOfDaysInAMonth(10);
		displaysNumberOfDaysInAMonth(11);
		displaysNumberOfDaysInAMonth(12);
		displaysNumberOfDaysInAMonth(13);

	}

}
