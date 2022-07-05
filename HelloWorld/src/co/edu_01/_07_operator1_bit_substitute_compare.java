package co.edu_01;

import java.util.Scanner;

public class _07_operator1_bit_substitute_compare {
	public static void main(String[] args) {
		
		// ~ : bit 반전 연산자 
		int num = 10;
		int result = ~num; // 2진법(bit)으로 인해 -10 이 아닌 -11이 나온다. ~00001010 == -11110101 = -11
		System.out.println(result);
		result ++;
		System.out.println(result);
		
		// 대입연산자 : =, +=, -=, *=, /= ...
		String name = "홍길동";
		name = name + " 김민수";
		name += " 박철수";
		System.out.println(name);
		result -= 2; // == result = result - 2;
		System.out.println(result);
		
		// 비교연산자 : ==, !=, >, >=, <, <=
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력히시오");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if (num1 == num2) {
			System.out.println("같다.");
		} else if (num1 > num2) {
			System.out.println("크거나 같다.");
		} else {
			System.out.println("작거나 같다.");
		}
		
		// 클래스 값 비교. String
		String name1 = scan.next();
		String name2 = scan.next();
		System.out.println(name1 + ", " + name2);
		// 문자열 비교시 .equals() 사용 / 비교연산자(==) 불가능
		if (name1.equals(name2)) {
			System.out.println("동일");
		} else {
			System.out.println("다름");
		}
		
		// 삼항연산자 a ? b : c a b가 true면 a b값으로, false면 a c값으로 진행한다. 즉 if else문의 대체재와 같다.
		String result1 = (name1.equals(name2)) ? "두 값이 동일" : "두 값이 다름";
		System.out.println(result1);
		
		boolean istrue = false;
		/* 
		 * if (num1 > num2) {
		 *	istrue = true;
		 * } else {
		 *	istrue = false;
		 * }
		 */
		istrue = (num1 > num2) ? true : false;
		System.out.println(istrue);
		result1 = (num1 > num2) ? "true" : "false";
		System.out.println(result1);
		
	}

}
