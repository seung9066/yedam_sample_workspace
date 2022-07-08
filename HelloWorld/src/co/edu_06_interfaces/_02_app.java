package co.edu_06_interfaces;

import java.util.Scanner;

public class _02_app {


	public void start() {
		Scanner scan = new Scanner(System.in);
		_02_Dao db = new _02_Oracle(); // new _02_Mysql();
		while (true) {
			timerShow("1. 입력 | 2. 수정 | 3. 삭제 | 4. 종료");
			System.out.print("선택 >> ");

			int menu = scan.nextInt();
			if (menu == 1) {
				db.insert();
			} else if (menu == 2) {
				db.update();
			} else if (menu == 3) {
				db.delete();
			} else if (menu == 4) {
				timerShow("종료합니다.");
				break;
			}
		}
	}

	private void timerShow(String msg) {
		String[] message = msg.split(""); // 문자열을 문자하나하나 잘라서 배열에 담는다.
		for (int i = 0; i < message.length; i++) {
			System.out.print(message[i]);
			try {
				Thread.sleep(10); // (100) = 0.1초마다 문장을 하나씩 찍어준다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}
