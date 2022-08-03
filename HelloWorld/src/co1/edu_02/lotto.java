package co1.edu_02;

import java.util.Scanner;

public class lotto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] lotto = null;
		boolean run = true;
		int money = 0;

		while (run) {
			System.out.println("1. 로또 생성 | 2. 로또 조회 | 3. 종료");
			int selectn = Integer.parseInt(scan.nextLine());
			switch (selectn) {
			case 1:
				System.out.print("금액 >> ");
				money = Integer.parseInt(scan.nextLine());
				lotto = new int[money / 1000][6];
				for (int i = 0; i < money / 1000; i++) {
					for (int j = 0; j < 6; j++) {
						lotto[i][j] = (int) (Math.random() * 45) + 1;
						for (int k = 1; k < 6; k++) {
							if (lotto[i][j] == lotto[i][k]) {
								lotto[i][j] = (int) (Math.random() * 45) + 1;
								break;
							}
						}
					}
				}
				break;
			case 2:
				System.out.println("로또 번호");
				for (int i = 0; i < lotto.length; i++) {
					System.out.println(((i % 5) + 1) + "번 : " + lotto[i][0] + " " + lotto[i][1] + " " + lotto[i][2]
							+ " " + lotto[i][3] + " " + lotto[i][4] + " " + lotto[i][5]);
					if ((i + 1) % 5 == 0) {

						System.out.println("=======================");
					}
				}
				break;
			case 3:
				System.out.println("프로그램 종료...");
				run = false;
			}
		}

	}

}
