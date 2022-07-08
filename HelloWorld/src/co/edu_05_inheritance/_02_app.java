package co.edu_05_inheritance;
/*
 * 등록, 조회, 목록
 */

import java.util.Scanner;

public class _02_app {

	// 기본생성자사용
	_02_friends[] friends = new _02_friends[10];
	int friendNum;
	Scanner scan = new Scanner(System.in);

	public void start() {
		while (true) {
			timerShow("1. 등록 | 2. 조회 | 3. 목록 | 9. 종료");
			System.out.print("선택 >> ");
			int selectno = 0;
			try { // int가 아닌 문자열이 들어올 경우 error 종료가 되는 것을 막기 위해 예외처리
				selectno = Integer.parseInt(scan.nextLine()); // try 안에 int selectno 로 넣으면 밑에서 못 읽음
			} catch (Exception e) {
				System.out.println("1, 2, 3, 9번 중 선택하세요.");
			}
			if (selectno == 1) {
				add();
			} else if (selectno == 2) {
				search();
			} else if (selectno == 3) {
				list();
			} else if (selectno == 9) {
				timerShow("프로그램 종료...");
				break;
			}
		} // end of while
		System.out.println("종료");
	} // end of start

	private void add() {
		int choice = 0;

		while (true) {
			timerShow("1. 친구 | 2. 학교 | 3. 회사 | 9. 뒤로");
			System.out.print("선택 >> ");
			try { // int가 아닌 문자열이 들어올 경우 error 종료가 되는 것을 막기 위해 예외처리
				choice = Integer.parseInt(scan.nextLine()); // try 안에 int choice 로 넣으면 밑에서 못 읽음
				break;
			} catch (Exception e) {
				timerShow("1, 2, 3, 9번 중 선택하세요.");
			}
		}

		System.out.print("이름 >> ");
		String name = scan.nextLine();
		System.out.print("연락처 >> ");
		String phone = scan.nextLine();
		if (choice == 1) {
			friends[friendNum++] = new _02_friends(name, phone);
		} else if (choice == 2) {
			System.out.print("학교이름 >> ");
			String school = scan.nextLine();
			System.out.print("전공 >> ");
			String major = scan.nextLine();
			friends[friendNum++] = new _02_school(name, phone, school, major);
		} else if (choice == 3) {
			System.out.print("회사이름 >> ");
			String company = scan.nextLine();
			System.out.print("부서 >> ");
			String department = scan.nextLine();
			friends[friendNum++] = new _02_company(name, phone, company, department);
		}
	}

	private void search() {
		for (int i = 0; i < friendNum; i++) {
			System.out.print(friends[i].getName() + " ");
		}
		System.out.println();
		System.out.print("이름 입력 >> ");
		String name = scan.nextLine();
		for (int i = 0; i < friendNum; i++) {
			if (friends[i].getName().equals(name)) {
				friends[i].showInfo();
				break;
			} else if (i == friendNum - 1) {
				System.out.println("없는 이름입니다.");
			}
		}
	}

	private void list() {
		for (int i = 0; i < friendNum; i++) {
			System.out.println(friends[i].toString());
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
