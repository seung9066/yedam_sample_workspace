package com.yedam03_bank.app;

import java.util.Scanner;

import com.yedam03_bank.member.MemberService;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	
	MemberService ms = new MemberService();
	
	int menuNo = 0;
	
	
	public Application() {
		run();
	}

	private void run() {
		System.out.println("1. 로그인 | 9. 종료");
		menuNo = Integer.parseInt(sc.nextLine());
		switch (menuNo) {
		case 1: // 로그인
			ms.doLogin();
			System.out.println(MemberService.memberInfo.getMemberName());
			break;
		case 9:
			
			break;
		}
	}
	
	
}
