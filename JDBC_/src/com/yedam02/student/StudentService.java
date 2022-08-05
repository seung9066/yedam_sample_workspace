package com.yedam02.student;

import java.util.Scanner;

public class StudentService {
	
	Scanner sc = new Scanner(System.in);
	
	public void insertStudent (StudentDTO std) {
		int result = StudentManage.getInstance().insertStudent(std);
		if (result == 1) {
			System.out.println("입력 성공");
		} else {
			System.out.println("입력 실패");
		}
	}
	
//	public int insertStudent(StudentDTO std) {
//		return StudentManage.getInstance().insertStudent(std);
//	}
	
	public void insertSubject(StudentDTO std) {
		int menu = 0;
		System.out.println("===========================================");
		System.out.println("                  성적 입력");
		System.out.println("===========================================");
		System.out.println("1. 국어 | 2. 영어 | 3. 수학");
		System.out.print("입력 >> ");
		menu = Integer.parseInt(sc.nextLine());
		switch (menu) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		}
		
	}
	
}
