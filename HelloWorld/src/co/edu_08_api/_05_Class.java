package co.edu_08_api;

import java.lang.reflect.Method;

public class _05_Class {
	public static void main(String[] args) {

		// 클래스 정보 얻어오기
		try {
			Class cls = Class.forName("java.lang.String"); // 리소스를 쓰는 것은 예외처리 안하면 error
			cls = String.class;

			System.out.println(cls.getName());

			Method[] methods = cls.getMethods();
			System.out.println("=========================================");
			for (Method method : methods) {
				System.out.println(method.getName());
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
