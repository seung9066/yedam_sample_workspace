package co.edu_02;

import java.text.DecimalFormat;

public class _02_array2_DecimalFormat {
	public static void main(String[] args) {
		DecimalFormat form = new DecimalFormat("#.##"); // 소수점자리를 원하는 만큼만 표시하는 import
		
		int[] intary = { 22, 33 };
		intary = new int[] { 24, 56, 77, 43, 99 }; // 변수에 배열 재할당
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < intary.length; i++) {
			System.out.println("재배열 된 변수 : " + intary[i]);
			sum += intary[i];
			avg = (double)sum / intary.length;
		}
		System.out.print("총합 : " + sum + " ");
		System.out.println("평균 : " + form.format(avg));

	}

}
