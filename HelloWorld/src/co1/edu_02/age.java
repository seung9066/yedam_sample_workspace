package co1.edu_02;

import java.util.Scanner;

public class age {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = a.substring(0,2);
		String c = a.substring(0,6);
		System.out.println(b);
		int age1 = Integer.parseInt(b);
		int age = 0;
		if (age1 > a.charAt(0)) {
			age = 2022 - Integer.parseInt(b) - 1900;
		} else {
			age = 2022 - Integer.parseInt(b) - 2000;
		}
		System.out.println("입력한 생년월일 : " + c + " 나이 : " + (age+1));
		
				
	}

}
