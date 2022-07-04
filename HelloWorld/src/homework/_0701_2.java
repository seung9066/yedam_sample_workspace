package homework;

import java.util.Scanner;

public class _0701_2 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름 : ");
		String name = sn.nextLine();
		System.out.print("2. 주민번호 앞 6자 : ");
		String id = sn.nextLine();
		System.out.print("3. 전화번호 : ");
		String phone = sn.nextLine();
		
		System.out.println("[입력한 정보]\n"+ name + "\n" + id + "\n" + phone);
	}

}
