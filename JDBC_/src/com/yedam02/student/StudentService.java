package com.yedam02.student;

import java.util.Scanner;

public class StudentService {
	
	Scanner sc = new Scanner(System.in);
	
	public void insertStudent (StudentDTO std) {
		int result = StudentManage.getInstance().insertStudent(std);
		checkResult(result);
	}
	
//	public int insertStudent(StudentDTO std) {
//		return StudentManage.getInstance().insertStudent(std);
//	}
	
	public void insertSubject(StudentDTO std) {
		int menu = 0;
		System.out.println("=======================================");
		System.out.println("               성적 입력");
		System.out.println("=======================================");
		System.out.println("1. 국어 | 2. 영어 | 3. 수학");
		System.out.print("입력 >> ");
		menu = Integer.parseInt(sc.nextLine());
		System.out.print("입력 >> ");
		switch (menu) {
		case 1:
			int kor = Integer.parseInt(sc.nextLine());
			std.setStudentKor(kor);
			checkResult(StudentManage.getInstance().insertKor(std));
			break;
		case 2:
			int eng = Integer.parseInt(sc.nextLine());
			std.setStudentKor(eng);
			checkResult(StudentManage.getInstance().insertEng(std));
			break;
		case 3:
			int math = Integer.parseInt(sc.nextLine());
			std.setStudentKor(math);
			int result = StudentManage.getInstance().insertMath(std);
			checkResult(result);
			break;
		}
		
	}
	
	public void updateTel() {
		StudentDTO std = new StudentDTO();
		
		System.out.print("ID >> ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("변경할 전화번호 >> ");
		String tel = sc.nextLine();
		
		std.setStudentId(id);
		std.setStudentTel(tel);
		
		int result = StudentManage.getInstance().updateTel(std);
		checkResult(result);
		
	}
	
	public void checkResult(int value) {
		if (value == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
	
}
