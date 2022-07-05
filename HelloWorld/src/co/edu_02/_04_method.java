package co.edu_02;

public class _04_method {
	
	// method에는 유형을 지정
	// method 정의구문
	public static long sum(int num) {
		int result = num * 2; // parameter(매개변수)
		System.out.println(result);
		return result; // 자동형변환이 일어남 int -> long
	}
	
	public static int sumary(int num) {
		return num * 2;
	}
	
	public static int plus(int a, int b) {
		return a + b;
	}
	
	public static void plus1(int a, int b) {
		System.out.println(a + b);
	}
	
	// method 호출구문
	public static void main(String[] args) {
		
		// 실행구문
		long sum = sum(10); // arguments(매개값)
		
		int result;
		result = sumary(10);
		System.out.println(result);
		
		int plus = plus(1, 2);
		System.out.println(plus);
		
		plus1(10, 20);
		
	}

}
