package co.edu_08_api;

import java.io.UnsupportedEncodingException;

public class _01_String_charAt_Unsupported {
	public static void main(String[] args) {
		String name = "홍길동";

		// .charAt();
		System.out.println(name.charAt(0));
		char fname = name.charAt(1);
		System.out.println(fname);

		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String name1 = "";
		name1 = new String(bytes);
		System.out.println(name1);

		String name2 = "";
		name2 = new String(bytes, 0, 5); // 0번째부터 5번째까지
		System.out.println(name2);

		String name3 = "";
		try {
			name3 = new String(bytes, 0, 5, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(name3);
		System.out.println("종료");

	}
}