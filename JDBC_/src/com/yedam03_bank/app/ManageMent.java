package com.yedam03_bank.app;

import java.util.Scanner;

import com.yedam03_bank.account.AccountService;
import com.yedam03_bank.member.MemberService;

public class ManageMent {

	Scanner sc = new Scanner(System.in);
	int menu = 0;
	MemberService ms = new MemberService();
	AccountService as = new AccountService();

	public ManageMent() {
		bankjob();
	}

	private void bankjob() {
		menuInfo();
		while (true) {
			if (MemberService.memberInfo.getRole().equals("1")) {
				if (menu == 1) {
					ms.registerCustomer();
				} else if (menu == 2) {
					as.makeAccount();
				} else if (menu == 3) {
					as.money();
				} else if (menu == 4) {
					as.transfer();
				} else if (menu == 5) {
					as.deleteAccount();
				} else if (menu == 6) {

				} else if (menu == 9) {
					System.out.println("종료");
					break;
				}
			} else if (MemberService.memberInfo.getRole().equals("0")) {
				if (menu == 1) {

				} else if (menu == 2) {
					as.money();
				} else if (menu == 3) {
					as.transfer();
				} else if (menu == 4) {

				} else if (menu == 9) {
					System.out.println("종료");
					break;
				}
			}
		}
	}

	private void menuInfo() { // 권한 부여 (은행원, 고객)
		if (MemberService.memberInfo.getRole().equals("1")) {
			System.out.println("1. 고객 등록 | 2. 계좌 개설 | 3. 입출금 | 4. 계좌 이체 | 5. 계좌 해지 | 6. 대출 | 9. 종료");
		} else if (MemberService.memberInfo.getRole().equals("0")) {
			System.out.println("1. 계좌 조회 | 2. 입출금 | 3. 계좌 이체 | 4. 대출 | 9. 종료");

		}
		System.out.print("입력 >> ");
		menu = Integer.parseInt(sc.nextLine());
	}

}
