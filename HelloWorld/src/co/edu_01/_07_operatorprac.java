package co.edu_01;

import java.util.Scanner;

public class _07_operatorprac {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 임의 숫자가 3의 배수가 맞는지
		System.out.print("임의 숫자 입력 >> ");
		int num1 = scan.nextInt();
		
		if (num1 % 3 == 0) {
			System.out.printf("입력값 \"%d\" : 3의 배수이다.", num1);
		} else {
			System.out.printf("입력값 \"%d\" : 3의 배수가 아니다.", num1);
		}
		
	}
}
