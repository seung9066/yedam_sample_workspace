package test;

import java.util.Scanner;

public class exam05_1 {
	/*
	 * 문제 5: 배열. Scanner 클래스를 사용하여 사용자가 입력한 값을 다음의 배열에서 찾아서 값이 있을 경우에는 해당 값의 저장위치를
	 * 값이 없을 경우에는 찾는 값이 없습니다는 메세지를 보여주도록 기능을 작성하세요.
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] fruits = { "사과", "딸기", "감", "수박", "포도", "복숭아" };

		boolean run = false;
		String a = scn.nextLine();
		for (int i = 0; i < fruits.length; i++) {
			if (a.equals(fruits[i])) {
				System.out.println(i);
				run = true;
				break;
			}
		}
			if (!run) {
				System.out.println("찾는 값이 없습니다.");

			}

		
	}

}
