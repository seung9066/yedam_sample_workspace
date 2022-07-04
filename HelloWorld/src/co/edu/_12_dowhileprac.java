package co.edu;

import java.util.Scanner;

public class _12_dowhileprac {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean istrue = true;
		int sum = 0;
		
		do {
			System.out.print("임의의 값을 입력 >>> \n");
			int num = scan.nextInt();
			sum += num;
			if (sum > 100) {
				System.out.println("반복문 종료");
				istrue = false;
			} else {
				System.out.printf("현재 누적값 : %d\n", sum);
			}
		} while (istrue);
		System.out.println("sum의 누적값 : " + sum);
		System.out.println("end.");
	}

}
