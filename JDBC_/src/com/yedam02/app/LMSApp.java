package com.yedam02.app;

import java.util.Scanner;

import com.yedam02.member.MemberDTO;
import com.yedam02.member.MemberService;

public class LMSApp {

	MemberService ms = new MemberService();
	Scanner sc = new Scanner(System.in);
	int menu = 0;
	
	MemberDTO MD = null; // 로그인 성공 정보 담기

	public LMSApp() {
		run();
	}

	private void run() {
		while (true) {
			menuNo();
			if (menu == 1) {
				MemberDTO member = new MemberDTO();
				
				System.out.print("ID >> ");
				String id = sc.nextLine();
				System.out.print("PW >> ");
				String pw = sc.nextLine();
				
				member.setMemberId(id);
				member.setMemberPw(pw);
				
				MD = ms.doLogin(member);
				
			} else if (menu == 2) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	private void menuNo() {
		System.out.println("1. 로그인 | 2. 종료");
		System.out.print("입력 >> ");
		menu = Integer.parseInt(sc.nextLine());
	}

}
