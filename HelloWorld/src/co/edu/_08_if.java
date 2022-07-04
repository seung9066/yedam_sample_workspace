package co.edu;

import java.util.Scanner;

public class _08_if {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오.");
		int num = scan.nextInt();
		
		// && = and || = or
		if (num % 2 == 0) {
			System.out.println(num + "은(는) 짝수입니다.");
		} else if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("2와 3의 배수입니다.");
		} else {
			System.out.println(num + "은(는) 홀수입니다.");
		} 
		
		// 삼항연산자 a = (b > c) ? d : (f > g) ? h : (i > j) ? k : l ;
		String a = (num % 2 == 0) ? "짝수입니다.\n" : "홀수입니다.\n";
		System.out.printf(a);
		
		System.out.println("두 수를 입력하시오.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if (num1 == num2) {
			System.out.printf("%d은(는) %d와 같다.\n", num1, num2);
		} else if (num1 > num2) {
			System.out.printf("%d은(는) %d 보다 크다.\n", num1, num2);
		} else {
			System.out.printf("%d은(는) %d 보다 작다.\n", num1, num2);
		}
	}

}
