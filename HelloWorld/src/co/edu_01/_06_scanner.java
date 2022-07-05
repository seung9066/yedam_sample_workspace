package co.edu_01;

import java.util.Scanner;

public class _06_scanner {
	public static void main(String[] args) {
		
		System.out.println("값을 입력하세요.");
		Scanner sn = new Scanner(System.in);
		
		String input = sn.nextLine(); // 문자열
		int input1 = sn.nextInt(); // 정수
		System.out.printf("입력값은 %s, %d 입니다.\n", input, input1);
	}

}
