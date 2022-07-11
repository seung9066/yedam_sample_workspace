package co.edu_08_api;

import java.util.Scanner;

public class _01_Stringprac {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ssn = scan.nextLine();
		chechGender(ssn);

	}

	public static void chechGender(String ssn) {

		char sex = ssn.charAt(7);
		if (ssn.length() == 13) {
			sex = ssn.charAt(6);
		}
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
