package co.edu_02;

public class _04_method {
	
	// method에는 유형을 지정
	// method 정의구문
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
		
		int result;
		result = sumary(10);
		System.out.println(result);
		
		int plus = plus(1, 2);
		System.out.println(plus);
		
		plus1(10, 20);
		
	}

}
