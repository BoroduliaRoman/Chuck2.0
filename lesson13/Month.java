package homework.lesson13;

public class Month {
	
	static void displaysNumberOfDaysInAMonth(int a) {
		switch(a) {
			case 1:
				System.out.println("������, ���-�� ����: 31");
				break;
			case 2:
				System.out.println("�������, ���-�� ����: 28");
				break;
			case 3:
				System.out.println("����, ���-�� ����: 31");
				break;
			case 4:
				System.out.println("������, ���-�� ����: 30");
				break;
			case 5:
				System.out.println("���, ���-�� ����: 31");
				break;
			case 6:
				System.out.println("����, ���-�� ����: 30");
				break;
			case 7:
				System.out.println("����, ���-�� ����: 31");
				break;
			case 8:
				System.out.println("������, ���-�� ����: 31");
				break;
			case 9:
				System.out.println("��������, ���-�� ����: 30");
				break;
			case 10:
				System.out.println("�������, ���-�� ����: 31");
				break;
			case 11:
				System.out.println("������, ���-�� ����: 30");
				break;
			case 12:
				System.out.println("�������, ���-�� ����: 31");
				break;
			default:
				System.out.println("������ ������ �� ����������");				
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
