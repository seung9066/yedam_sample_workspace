package co.edu_08_api1;

public class Autoboxing_autoUnBoxing {
	public static void main(String[] args) {

		// auto boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());

		// 대입 시 자동 언박싱
		int value = obj;
		System.out.println("value : " + value);

		// 연산 시 자동 언박싱
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
