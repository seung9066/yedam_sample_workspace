package co.edu_07_exception;

import java.util.Iterator;

/*
 * 배열의 크기를 벗어난 값 저장, 읽어오기
 */

public class _02_ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		int[] intary = new int[5];

		intary[0] = 20;
		intary[1] = 20;

		for (int i = 0; i <= intary.length; i++) {
			try {
				intary[i] = (int) (Math.random() * 100) + 1;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과");
			}
		}
		System.out.println("프로그램 종료");
	}
}
