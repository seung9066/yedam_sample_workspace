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
				memo.toString();
			} else if (selectno == 5) {
				memo.storeToFile();
			}
		}
	}

}
