package co.edu_02;

import java.util.Arrays;

public class _03_nestloopprac2 {
	public static void main(String[] args) {
		int[] tempary = new int[5];
		for (int i = 0; i < tempary.length; i++) {
			tempary[i] = (int) (Math.random() * 50);
		}

		for (int num : tempary) {
			System.out.println(num);
		}
		System.out.println("end.");

		// 제일 큰값 max를 찾기
		int max = 0;
		for (int num : tempary) {
			if (tempary[0] > tempary[1] && tempary[0] > tempary[2] && tempary[0] > tempary[3]
					&& tempary[0] > tempary[4]) {
				max = tempary[0];
			} else if (tempary[1] > tempary[0] && tempary[1] > tempary[2] && tempary[1] > tempary[3]
					&& tempary[1] > tempary[4]) {
				max = tempary[1];
			} else if (tempary[2] > tempary[0] && tempary[2] > tempary[1] && tempary[2] > tempary[3]
					&& tempary[2] > tempary[4]) {
				max = tempary[2];
			} else if (tempary[3] > tempary[0] && tempary[3] > tempary[1] && tempary[3] > tempary[2]
					&& tempary[3] > tempary[4]) {
				max = tempary[3];
			} else if (tempary[4] > tempary[0] && tempary[4] > tempary[1] && tempary[4] > tempary[2]
					&& tempary[4] > tempary[3]) {
				max = tempary[4];
			}
		}
		System.out.println("가장 큰 값 a : " + max);

		int max1 = 0;
		for (int i = 0; i < tempary.length; i++) {
			if (max1 < tempary[i]) {
				max1 = tempary[i];
			}
		}
		System.out.println("가장 큰 값 b : " + max1);

	}

}
