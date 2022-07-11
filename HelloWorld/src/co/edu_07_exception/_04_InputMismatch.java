package co.edu_07_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_InputMismatch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		try {
			int num = scan.nextInt(); // int 타입인데 문자열을 쳐보자
			System.out.println("입력값 : " + num);
		} catch (InputMismatchException e) { // 잘못된 타입의 변수가 들어올 때
			System.out.println("정수를 입력하시오");
		}
		
		System.out.println("프로그램 종료");
		
	}
}
