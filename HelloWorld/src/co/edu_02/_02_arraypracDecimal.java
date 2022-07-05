package co.edu_02;

import java.text.DecimalFormat;

public class _02_arraypracDecimal {
	public static void main(String[] args) {
		// a반 80, 85, 83
		// b반 79, 84, 90
		DecimalFormat form = new DecimalFormat("#.##"); // 소수점자리를 원하는 만큼만 표시하는 impor

		int[][] classary = new int[2][3];
		classary[0][0] = 80;
		classary[0][1] = 85;
		classary[0][2] = 83;
		classary[1][0] = 79;
		classary[1][1] = 84;
		classary[1][2] = 90;
		int sum_a = 0;
		int sum_b = 0;
		double sum_aa = 0;
		double sum_bb = 0;

		for (int i = 0; i < classary[0].length; i++) {
			sum_a += classary[0][i];
			sum_aa = (double) sum_a / classary[0].length;
		}
		System.out.println("A반 평균 점수 : " + form.format(sum_aa));

		for (int i = 0; i < classary[1].length; i++) {
			sum_b += classary[1][i];
			sum_bb = (double) sum_b / classary[1].length;
		}
		System.out.println("B반 평균 점수 : " + form.format(sum_bb));

	}

}
