package co.edu_02;

import java.util.Scanner;

public class _02_arrayprac2school {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int studentnum = 0;
		int[] scores = null;
		int top = 0;
		double max = 0;

		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택 > ");

			int selectno = Integer.parseInt(scan.nextLine());

			if (selectno == 1) {
				System.out.print("학생 수 > ");
				studentnum = Integer.parseInt(scan.nextLine());
				scores = new int[studentnum];
				System.out.println("정상적으로 처리되었습니다.");
			} else if (selectno == 2) {
				for (int i = 0; i < studentnum; i++) {
					System.out.print("scores[" + i + "] : ");
					scores[i] = Integer.parseInt(scan.nextLine());
					System.out.println("정상적으로 처리되었습니다.");
				}
			} else if (selectno == 3) {
				for (int i = 0; i < studentnum; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if (selectno == 4) {
				for (int i = 0; i < studentnum; i++) {
					if (top < scores[i]) {
						top = scores[i];
					}
				}
				System.out.println("최고 점수 : " + top);
				for (int i = 0; i < studentnum; i++) {
					max += scores[i];
				}
				System.out.println("평균 점수 : " + max / studentnum);
			} else if (selectno > 5) {
				System.out.println("잘못된 접근입니다.");
			} else if (selectno == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

}
