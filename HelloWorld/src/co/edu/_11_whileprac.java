package co.edu;

import java.util.Scanner;

public class _11_whileprac {
	public static void main(String[] args) {
		/*
		 * bank account 1 : 입금 / 2 : 출금 / 3 : 잔액조회 / 4 : 종료
		 */
		Scanner scan = new Scanner(System.in);
		int val = 0; // 잔액
		while (true) {
			System.out.println("1 : 입금, 2 : 출금, 3 : 잔액조회, 4 : 종료");
			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.println("입금액을 입력하세요.");
				int amt = scan.nextInt();
				val += amt;
				if (amt < 0) {
					val -= amt;
					System.out.printf("입금액은 0원보다 커야함. 잔액 %d 원.\n", val);
					continue;
				}
				if (val >= 100000) {
					val -= amt;
					System.out.printf("100,000 원 이상 입금 불가. 잔액 %d 원.\n", val);
				/*
				 * else 대신 continue; 가능
				 * continue;
				 * sout();
				 */
				} else {
					System.out.printf("%d 원을 입금합니다. 잔액 %d 원.\n", amt, val);
				}
			} else if (menu == 2 && val == 0) {
				System.out.println("잔액이 부족합니다.");
			} else if (menu == 2) {
				System.out.printf("출금액을 입력하세요.\n현재 잔액 %d 원\n", val);
				int amt = scan.nextInt();
				if (val >= amt) { // 잔액이 출금액보다 많아야한다.
					val -= amt;
					System.out.printf("%d 원을 출금합니다. 잔액 %d 원.\n", amt, val);
				} else {
					System.out.printf("잔액이 부족합니다. 잔액 %d 원.\n", val);
				}
			} else if (menu == 3) {
				System.out.printf("현재 잔액은 %d 원 입니다.\n", val);
			} else if (menu == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("error");
			}

		}

	}

}
