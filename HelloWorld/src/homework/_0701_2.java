package homework;

import java.util.Scanner;

public class _0701_2 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		String name = sn.nextLine();
		String id = sn.nextLine();
		String phone = sn.nextLine();
		
		System.out.println("1. 이름:" + name + "\n2. 주민번호 앞 6자리:" + id + "\n3. 전화번호:" + phone);
	}

}
