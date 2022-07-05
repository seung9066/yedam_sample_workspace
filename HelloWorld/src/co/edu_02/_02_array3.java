package co.edu_02;

import java.util.Iterator;

public class _02_array3 {
	public static void main(String[] args) {

		int[][] intary = new int[2][3]; // y축(2개) x축(3개)의 배열 (표 같은 모습)
		intary[0][0] = 10; // 0번째 y축, 0번째 x축에 10을 담음
		intary[0][2] = 30;
		intary[1][1] = 40;

		for (int i = 0; i < intary[0].length; i++) {
			System.out.println("첫번째 배열 : " + intary[0][i]);
			System.out.println("두번째 배열 : " + intary[1][i]);
		}

		for (int i = 0; i < intary.length; i++) { // y축 구하기
			for (int j = 0; j < intary[i].length; j++) { // x축 구하기
				System.out.println("(" + i + ", " + j + ") -> " + intary[i][j]);
			}
		}
		System.out.println("end.");

		intary = new int[][] { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		for (int i = 0; i < intary.length; i++) { // y축 구하기
			for (int j = 0; j < intary[i].length; j++) { // x축 구하기
				System.out.println("(" + i + ", " + j + ") -> " + intary[i][j]);
			}
		}

	}

}
