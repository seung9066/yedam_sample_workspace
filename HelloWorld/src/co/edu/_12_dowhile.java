package co.edu;

import java.util.Scanner;

public class _12_dowhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean istrue = true;
		while (istrue) {
			System.out.print("입력 >> ");
			int input = scan.nextInt();
			System.out.println("입력값은 " + input);
			
			if (input == 9) {
				System.out.println("반복분 종료.");
				istrue = false;
			}
		}
		System.out.println("end.");
		
		/* 
		 * do while 구문시 while(); 세미콜론 필요.
		 * while 문을 한번만 하는 방식
		 */
		do {
			System.out.print("입력 >> ");
			int input = scan.nextInt();
			System.out.println("입력값은 " + input);
			if (input == 9) {
				System.out.println("반복분 종료.");
				istrue = false;
			} /* else {
			*		istrue = true;
			*	} 이걸 적지 않으면 do문은 9가 아닌 수를 입력해도 한번에 종료된다.
			*/
		} while(istrue);
			System.out.println("end.");
		
	}
}
