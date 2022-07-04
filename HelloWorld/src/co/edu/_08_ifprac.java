package co.edu;

import java.util.Scanner;

public class _08_ifprac {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하시오.");
		int score = scan.nextInt();
		String grade = "";
		if (score > 100) {
			System.out.println("범위를 벗어난 점수입니다.");
		} else if (score >= 90 && score <= 100) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else {
			if (score >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}
		}
		System.out.printf("점수 %d은(는) %s 등급입니다!\n", score, grade);

		int score1 = scan.nextInt();
		String grade1 = "";
		grade1 = (score1 > 100) ? "범위를 벗어난 점수"
				: (score1 >= 90) ? "A" : (score1 >= 80) ? "B" : (score1 >= 70) ? "C" : "D";
		System.out.printf("%s 입니다!", grade1);
	}

}
