package co.edu_02;

import java.util.Scanner;

public class _02_arrayprac {
	public static void main(String[] args) {
		
		// 배열합계
		int sum = 0;
		double avg = 0;
		
		// intary배열의 합과 평균
		int[] intary = { 34, 23, 56, 22, 99, 28 };
		for (int i=0; i<intary.length; i++) {
			sum += intary[i];
			avg = (double)sum / intary.length;
		}
		System.out.printf("intary 합 : %d / 평균 : %f\n", sum, avg);
		
		// intarry 합과 평균
		int sum1 =0;
		double avg1=0;
		int[] intarry = new int[6];
		for (int i = 0; i < intarry.length; i++) {
			intarry[i] = (int) (Math.random() * 100) + 1;
			sum1 += intarry[i];
			avg1 = (double)sum1 / intarry.length;
		}
		System.out.printf("intarry 합 : %d / 평균 : %f\n", sum1, avg1);
		
		// scanary 합과 평균
		int sum2=0;
		double avg2=0;
		int[] scanary = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<scanary.length; i++) {
			System.out.print("임의의 수를 입력 >> ");
			scanary[i]=scan.nextInt();
			sum2 += scanary[i];
			avg2 = (double)sum2 / scanary.length;
		}
		System.out.printf("scanary 합 : %d / 평균 : %f\n", sum2, avg2);

	}

}
