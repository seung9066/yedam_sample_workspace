package co.edu_04;

import java.util.Calendar;
import java.util.Scanner;

public class _03_employeeapp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		_03_employeelist app = _03_employeelist.getInstance();
		
		while(true) {
			System.out.println("1. 초기화(사원수) | 2. 사원정보입력 | 3. 리스트 | 4. 상세조회 | 5. 달력보기 | 9. 종료");
			System.out.print("선택 >> ");
			int selectno = Integer.parseInt(scan.nextLine());
			if (selectno == 1) {
				app.init();
			} else if (selectno == 2) {
				app.input();
			} else if (selectno == 3) {
				app.printlist();
			} else if (selectno == 4) {
				app.search();
			} else if (selectno == 5) {
				app.calendar();
			} else if (selectno == 9) {
				System.out.println("프로그램 종료.....");
				break;
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
