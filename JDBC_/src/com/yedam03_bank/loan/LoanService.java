package com.yedam03_bank.loan;

import java.util.List;
import java.util.Scanner;

import com.yedam02.member.MemberService;

public class LoanService {
	Scanner sc = new Scanner(System.in);

	public Loan loaninfo = null;

	// 대출 승인
	public void insertLoan() {
		Loan loan = new Loan();

		System.out.print("대출 ID >> ");
		String id = sc.nextLine();
		System.out.print("회원 ID >> ");
		String mid = sc.nextLine();
		System.out.print("대출 상태 >> ");
		String state = sc.nextLine();
//		System.out.print("대출 날짜 >> ");
		System.out.print("대출 금액 >> ");
		int money = Integer.parseInt(sc.nextLine());

		loan.setLoanId(id);
		loan.setMemberId(mid);
		loan.setState(state);
		loan.setLoanMoney(money);

		int result = LoanManage.getInstance().insertLoan(loan);
		if (result == 1) {
			System.out.println("대출 완료");
		} else {
			System.out.println("대출 실패");
		}

	}

	// 대출 정보 변경
	public void updateLoan() {
		Loan loan = new Loan();
		System.out.print("대출 ID >> ");
		String id = sc.nextLine();
		System.out.print("상태 변경 >> ");
		String state = sc.nextLine();

		loan.setLoanId(id);
		loan.setState(state);

		int result = LoanManage.getInstance().insertLoan(loan);
		if (result == 1) {
			System.out.println("변경 완료");
		} else {
			System.out.println("변경 실패");
		}
	}
	
	// 상환
	public void updateMoney() {
		Loan loan = new Loan();
		System.out.print("대출 ID >> ");
		String id = sc.nextLine();
		System.out.print("상환 금액 >> ");
		int money = Integer.parseInt(sc.nextLine());
		
		loan.setLoanId(id);
		loan.setLoanMoney(money);
		
		int result = LoanManage.getInstance().insertLoan(loan);
		if (result == 1) {
			System.out.println("상환 완료");
		} else {
			System.out.println("상환 실패");
		}	
	}
	
	// 대출 정보 조회
	public void loanInfo() {
		List <Loan> list = LoanManage.getInstance().getLoanInfo(com.yedam03_bank.member.MemberService.memberInfo.getMemberId());
		System.out.println(com.yedam03_bank.member.MemberService.memberInfo.getMemberName()+"님의 대출 정보");
		for (Loan loan : list) {
			System.out.println("ID : " + loan.getLoanId() + " | 대출 금액 : " + loan.getLoanMoney() + " | 대출 날짜 : " + loan.getLoanDate());
		}
	}
}
