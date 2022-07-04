package co.edu;

import java.util.Scanner;

public class _07_operator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 10;
		int num2 = 20;
		
		int result = num1 + num2;
		result = num1 - num2;
		System.out.println(result);
		result = num1 * num2;
		System.out.println(result);
		result = num1 / num2;
		System.out.println(result);
		result = num1 % num2; // 나눈 것의 나머지
		System.out.println(result);
		result = 20 + 2 * 3; // 연산자의 우선순위 / 대입의 경우 오른쪽부터. a=b=c=5+1 일 경우 5+1 > c=5+1 > b=c > a=b 순으로.
		System.out.println(result);
		result = (20 +2) * 3;
		System.out.println(result);
		num1++;
		System.out.println(num1);
		System.out.println(++num1); // num1++로 sout 적으면 현재의 num1값을 출력해주고 1을 추가하기 때문에 ++num1로 적어야 1추가 이후 출력값으로 나타낸다.
		System.out.println(num1++); // num1값을 콘솔에 출력 후 1추가
		System.out.println(num1); // 위의 상황으로 인해 1이 추가된 수가 나옴.
		num2--;
		System.out.println(num2);
		result = num1++ + num2++;
		System.out.println(result);
		result = ++num1 + ++num2;
		System.out.println(result);
		
		result = num1 % 2; // "나머지가 0이면 짝수, 나머지가 있으면 홀수"로 응용가능
		System.out.print("임의의 값을 입력 : ");
		int num3 = scan.nextInt();
		
		if (num3 % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		// 논리부정연산자
		if (!(num3 % 2 == 0)) {
			System.out.println("결과값이 홀수입니다.");
		} else {
			System.out.println("결과값이 짝수입니다.");
		}
		
	}

}
