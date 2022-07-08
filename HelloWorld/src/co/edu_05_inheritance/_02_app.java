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
			System.out.println("1. 등록 | 2. 조회 | 3. 목록 | 9. 종료");
			System.out.print("선택 >> ");
			int selectno = Integer.parseInt(scan.nextLine());
			if (selectno == 1) {
				add();
			} else if (selectno == 2) {
				search();
			} else if (selectno == 3) {
				list();
			} else if (selectno == 9) {
				System.out.println("프로그램 종료...");
				break;
			}
		} // end of while
		System.out.println("종료");
	} // end of start

	private void add() {
		System.out.println("1. 친구 | 2. 학교 | 3. 회사");
		System.out.print("선택 >> ");
		int choice = Integer.parseInt(scan.nextLine());
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
		System.out.print("이름 입력 >> ");
		String name = scan.nextLine();
		for (int i = 0; i < friendNum; i++) {
			if (name.equals(friends[i].getName())) {
				friends[i].showInfo();
				break;
			} else if(i == friendNum - 1) {
				System.out.println("없는 이름입니다.");
			}
		}
	}

	private void list() {
		for (int i = 0; i < friendNum; i++) {
			System.out.println(friends[i].toString());
		}
	}
}
