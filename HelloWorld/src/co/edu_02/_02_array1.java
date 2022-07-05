package co.edu_02;

import java.util.Iterator;

public class _02_array1 {
	public static void main(String[] args) {
		int[] intary = { 20, 27, 15, 33, 29 };
		System.out.println("배열의 크기 : " + intary.length);
		for (int i = 0; i < intary.length; i++) {
			System.out.println(intary[i]);
			if (intary[i] > 25) {
				System.out.println("25보다 큰 수 : " + intary[i]);
			}
			if (intary[i] % 2 == 0) {
				System.out.println("짝수 : " + intary[i]);
			}
			if (i % 2 == 0) {
				System.out.println("짝수번째 수 : " + intary[i]);
			}
		}
		System.out.println("for문 end.");

		int sum = 0;
		for (int i = 0; i < intary.length; i++) {
			sum += intary[i];
		}
		System.out.println("변수 총합 : " + sum);

		intary[2] = 30;
		System.out.println("세번째 값 바꾸기 : " + intary[2]);

		int temp = intary[0];
		intary[0] = intary[1];
		intary[1] = temp;
		System.out.println("값 순서(위치) 바꾸기/복사하기 : " + intary[0] + ", " + intary[1]);

	}

}
