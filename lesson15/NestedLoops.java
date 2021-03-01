package homework.lesson15;

public class NestedLoops {

	public static void timeDisplay() {
		int hour = 0;

		HOUR: while (hour < 24) {
			int minute = 0;
			MINUTE: do {
				if (hour > 1 && minute % 10 == 0) {
					break HOUR;
				}
				minute++;
				int second = -1;
				SECOND: while (second < 59) {
					if (second * hour > minute) {
						continue MINUTE;
					}
					second++;
					System.out.println(hour + ":" + minute + ":" + second);
				}
			} while (minute < 59);

			hour++;
		}
	}

	public static void main(String[] args) {

		timeDisplay();

	}

}
