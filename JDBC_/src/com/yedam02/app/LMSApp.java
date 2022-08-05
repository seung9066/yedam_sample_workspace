package com.yedam02.app;

import java.util.Scanner;

import com.yedam02.member.MemberDTO;
import com.yedam02.member.MemberService;
import com.yedam02.student.StudentDTO;
import com.yedam02.student.StudentService;

public class LMSApp {

	MemberService ms = new MemberService();
	StudentService ss = new StudentService();
	Scanner sc = new Scanner(System.in);
	int menu = 0;

	MemberDTO MD = null; // 로그인 성공 정보 담기

	public LMSApp() {
		run();
	}

	private void run() {
		boolean run = true;
		while (run) {
			menuNo();
			if (MD == null) { // 로그인 정보 X 일 떄
				if (menu == 1) {
					MemberDTO member = new MemberDTO();

					System.out.print("ID >> ");
					String id = sc.nextLine();
					System.out.print("PW >> ");
					String pw = sc.nextLine();

					member.setMemberId(id);
					member.setMemberPw(pw);

					MD = ms.doLogin(member);

				} else if (menu == 9) {
					System.out.println("프로그램 종료");
					run = false;
				}
			} else { // 로그인 O 일 때 -> 프로그램 진입
				switch (menu) {
				case 1: // 학생등록
					StudentDTO std = new StudentDTO();
					
					System.out.print("ID(학번) >> ");
					int id = Integer.parseInt(sc.nextLine());
					std.setStudentId(id);
					
					System.out.print("이름 >> ");
					String name = sc.nextLine();
					std.setStudentName(name);
					
					System.out.print("반 >> ");
					String classn = sc.nextLine();
					std.setStudentClass(classn);
					
					System.out.print("주소 >> ");
					String addr = sc.nextLine();
					std.setStudentAddr(addr);
					
					System.out.print("전화번호 >> ");
					String phone = sc.nextLine();
					std.setStudentTel(phone);
					
					ss.insertStudent(std); // 정보를 외부에서 받아서 등록
					break;
				case 2: // 학생성적입력
					std = new StudentDTO();
					System.out.print("ID >> ");
					int id1 = Integer.parseInt(sc.nextLine());
					std.setStudentId(id1);
					
					if (ss.getStudent(std) != null) {
						ss.insertSubject(std);
					} else {
						System.out.println("정보가 없습니다.");
					}
					break;
				case 3: // 학생정보수정
					ss.updateTel();
					break;
				case 4: // 학생정보조회
					std = new StudentDTO();
					System.out.print("ID >> ");
					int id2 = Integer.parseInt(sc.nextLine());
					std.setStudentId(id2);
					if (ss.getStudent(std) != null) {
						System.out.println(ss.getStudent(std).toString());
					} else {
						System.out.println("정보가 없습니다.");
					}
					break;
				case 9:
					System.out.println("프로그램 종료");
					run = false;
					break;
				}
			}
		}
	}

	private void menuNo() {
		if (MD == null) {
			System.out.println("1. 로그인 | 9. 종료");
			System.out.print("입력 >> ");
			menu = Integer.parseInt(sc.nextLine());
		} else {
			System.out.println("1. 학생 등록 | 2. 학생 성적 입력 | 3. 학생 정보 수정 | 4. 학생 정보 조회 | 9. 종료");
			System.out.print("입력 >> ");
			menu = Integer.parseInt(sc.nextLine());
		}
	}

}
