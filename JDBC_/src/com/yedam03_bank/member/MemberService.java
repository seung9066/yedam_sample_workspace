package com.yedam03_bank.member;

import java.util.Scanner;

public class MemberService {

	Scanner sc = new Scanner(System.in);

	public static Member memberInfo = null;

	// 로그인
	public void doLogin() {
		Member member = new Member();
		System.out.print("ID >> ");
		String id = sc.nextLine();
		System.out.print("PW >> ");
		String pw = sc.nextLine();

		member = MemberManage.getInstance().loginInfo(id); // member는 id값이 일치하는 한개의 row

		if (member.getMemberPw().equals(pw)) { // id는 p.k.이기에 1개의 row만 반환 그 row와 일치하는 pw값이면
			memberInfo = member; // memberInfo에 로그인 정보를 담아주어 어디서든(static) 이 로그인 정보를 이용할 수 있게 하기 위해
		} else {
			System.out.println("로그인 실패");
		}
	}

	// 로그아웃
	public void logout() {
		if (memberInfo != null)
			memberInfo = null;
	}
	
	// 고객 등록
	public void registerCustomer() {
		Member member = new Member();
		System.out.print("고객 ID >> ");
		String id = sc.nextLine();
		
		System.out.print("고객 PW >> ");
		String pw = sc.nextLine();
		
		System.out.print("고객 이름 >> ");
		String name = sc.nextLine();
		
		member.setMemberId(id);
		member.setMemberPw(pw);
		member.setMemberName(name);
		member.setRole("0");
		
		int result = MemberManage.getInstance().registCustomer(member);
		if(result ==1 ) {
			System.out.println("등록 완료");
		} else {
			System.out.println("등록 실패");
		}
	}
	
	
	
}
