package co.edu_02;

public class _01_datatype1 {
	public static void main(String[] args) {
		// 기본데이터타입 (byte, short, long, int, float, double, boolean)
		int num1 = 100;
		int num2 = 100;
		System.out.println(num1 == num2);
		
		// 참조데이터타입
		String str1 = new String("홍길동"); // 홍길동 객체 주소값
		String str2 = new String("홍길동"); // 홍길동 객체 주소값
		System.out.println(str1 == str2); // 변수의 주소 비교
		System.out.println(str1.equals(str2)); // 문자열 값을 비교
		
		// 값 초기화
		int result = 0;
		String str3 = null; // 변수가 참조하는 값이 없을 때 지정
		
	}

}
