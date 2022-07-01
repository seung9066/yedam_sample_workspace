package co.edu;

import java.util.Scanner;

public class _06_scannerprac {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		System.out.println("첫번째 값을 입력.");
		int num1 = sn.nextInt();
		
		System.out.println("두번째 값을 입력.");
		int num2 = sn.nextInt();
		
		int result = num1 + num2;
		System.out.printf("입력한 값 %d, %d의 합은 %d 입니다.\n", num1, num2, result);
		
		if (num1 >= num2) {
			int result1 = num1 - num2;
			System.out.printf("첫번째 입력값이 같거나 더 크며 %d - %d = %d 입니다.\n", num1, num2, result1);
		} else {
			int result2 = num2 - num1;
			System.out.printf("두번째 입력값이 더 크며 %d - %d = %d 입니다.\n", num2, num1, result2);
		}
		
	}

}
