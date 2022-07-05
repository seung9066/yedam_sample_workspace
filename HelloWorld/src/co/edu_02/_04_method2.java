package co.edu_02;

import java.util.Scanner;

public class _04_method2 {

	// method에는 유형을 지정
	// method 정의구문
	public static int sumary(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}

	// method 호출구문
	public static void main(String[] args) {

		// 배열합계
		int sum = 0;
		double avg = 0;

		// intary배열의 합과 평균
		int[] intary = { 34, 23, 56, 22, 99, 28 };
		sum = sumary(intary);
		avg = (double) sum / intary.length;
		System.out.printf("intary 합 : %d / 평균 : %f\n", sum, avg);

		// intarry 합과 평균
		double avg1 = 0;
		int[] intarry = new int[6];
		for (int i = 0; i < intarry.length; i++) {
			intarry[i] = (int) (Math.random() * 100) + 1;			
		}
		sum =sumary(intarry);
		avg1 = (double) sum / intarry.length;
		System.out.printf("intarry 합 : %d / 평균 : %f\n", sum, avg1);

		// scanary 합과 평균
		double avg2 = 0;
		int[] scanary = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < scanary.length; i++) {
			System.out.print("임의의 수를 입력 >> ");
			scanary[i] = scan.nextInt();
		}
		sum =sumary(scanary);
		avg2 = (double) sum / scanary.length;
		System.out.printf("scanary 합 : %d / 평균 : %f\n", sum, avg2);

	}

}
