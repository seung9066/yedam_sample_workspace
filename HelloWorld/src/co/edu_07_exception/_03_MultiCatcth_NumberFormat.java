package co.edu_07_exception;

import java.util.Scanner;

public class _03_MultiCatcth_NumberFormat {
	public static void main(String[] args) {
		int[] intary = new int[2];
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력 >> ");

		try {
			intary[0] = (int) (Math.random() * 100) + 1;
			intary[2] = (int) (Math.random() * 100) + 1;

			intary[2] = Integer.parseInt(scan.nextLine()); // 문자열 숫자 -> 숫자
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
		} catch (NumberFormatException e1) {
			System.out.println("숫자를 입력하세요");
		} catch (Exception e2) {
			System.out.println("알수 없는 예외");
		}
		System.out.println("종료");
	}

}
