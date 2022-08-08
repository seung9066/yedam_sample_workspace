package com.yedam03_bank.account;

import java.util.List;
import java.util.Scanner;

import com.yedam03_bank.member.MemberService;

public class AccountService {

	Scanner sc = new Scanner(System.in);

	public void makeAccount() {
		Account account = new Account();

		System.out.print("계좌 번호 >> ");
		String accountId = sc.nextLine();
		account.setAccountId(accountId);

		System.out.print("고객 ID >> ");
		String customId = sc.nextLine();
		account.setMemberId(customId);
		
		int result = AccountManage.getInstance().insertAccount(account);
		if(result == 1) {
			System.out.println("계좌 등록 완료");
		} else {
			System.out.println("등록 실패");
		}
	}

	public void money() {
		Account account = new Account();

		System.out.println("1. 입금 | 2. 출금 | 9. 종료");
		int cmd = Integer.parseInt(sc.nextLine());
		System.out.print("계좌 번호 >> ");
		String accountId = sc.nextLine();
		if (cmd == 1) {
			System.out.print("입금 금액 >> ");
			int money = Integer.parseInt(sc.nextLine());
			account.setAccountId(accountId);
			account.setBalance(money);
			int result = AccountManage.getInstance().updateMoney(account, cmd);

			if (result == 1 && cmd == 1) {
				System.out.println("입금 완료");
			} else if (result == 1 && cmd == 2) {
				System.out.println("출금 완료");
			}
		} else if (cmd == 2) {
			System.out.print("출금 금액 >> ");
			int money = Integer.parseInt(sc.nextLine());
			account.setAccountId(accountId);
			account.setBalance(money);
			int result = AccountManage.getInstance().updateMoney(account, cmd);

			if (result == 1 && cmd == 1) {
				System.out.println("입금 완료");
			} else if (result == 1 && cmd == 2) {
				System.out.println("출금 완료");
			}
		} else if (cmd == 9) {
			System.out.println("종료");
		}
	}
	
	public void deleteAccount() {
		System.out.println("======= 계좌 해지 =======");
		System.out.print("계좌 입력 >> ");
		String accountId = sc.nextLine();
		
		int result = AccountManage.getInstance().delAccount(accountId);
		if (result == 1) {
			System.out.println("정상 해지");
		} else {
			System.out.println("해지되지 않음");
		}
	}
	
	public void transfer() {
		System.out.println("======= 계좌 이체 =======");
		System.out.print("받는 사람 계좌 >> ");
		String toAccount = sc.nextLine();
		System.out.print("보내는 사람 계좌 >> ");
		String fromAccount = sc.nextLine();
		System.out.print("금액 >> ");
		int money = Integer.parseInt(sc.nextLine());		
//		System.out.print("비밀번호 >> ");
//		String pw = sc.nextLine();
		AccountManage.getInstance().transferMoney(toAccount, fromAccount, money);
		
	}
	
	public void getAccount() {
		List<Account> list = 
				AccountManage.getInstance().getAccountList(MemberService.memberInfo.getAccountId());
		System.out.println(MemberService.memberInfo.getMemberName() + "님의 계좌 정보");
		for (Account account : list) {
			System.out.println("계좌 ID : " + account.getAccountId() + " | 잔고 : " + account.getBalance() + " | 생성일 : " + account.getCredate());
		}
	}
	
}
