package co.edu_01;

public class _09_switch1 {
	public static void main(String[] args) {
		// 월 -> 30일, 31일, 28일 ...
		int month = (int) (Math.random() * 12) + 1; // random 수는 12보다 작은 수 이기에 + 1을 해서 12까지 만들어준다.
		System.out.println(month);

		int lastdate = -1;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			lastdate = 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			lastdate = 30;
		} else {
			lastdate = 28;
		}
		System.out.println(lastdate);

		System.out.print(month + "월은 ");
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastdate = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastdate = 30;
			break;
		default:
			lastdate = 28;
		}
		System.out.println(lastdate + "일 까지 있습니다.");
	}

}
