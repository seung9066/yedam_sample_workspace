package co.edu_11_IO.prac;

import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
		
		MemoManager memo = MemoManager.getInstance();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 등록 | 2. 조회 | 3. 삭제 | 4. 목록 | 5. 종료");
			System.out.print("선택 >> ");
			int selectno = Integer.parseInt(scan.nextLine());
			if (selectno == 1) {
				memo.inputData();
			} else if (selectno == 2) {
				memo.search();
			} else if (selectno == 3) {
				memo.deleteData();
			} else if (selectno == 4) {
				memo.list();
			} else if (selectno == 5) {
				memo.storeToFile();
				System.out.println("종료 중....");
				break;
			}
		}
		System.out.println("종료");
		
		/*
		 * boolean run = true;
		 * switch 문을 사용해도 가능
		 * while (true) {
		 * swtich(selectno)	{
		 * sout("1. 등록 ....");
		 * case 1:
		 * memo.inputData(); break;
		 * case 2:
		 * .....
		 * case 5:
		 * run = false;
		 * }
		 */
	}

}
