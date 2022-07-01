package co.edu;

public class _03_string_method {
	public static void main(String[] args) {
		System.out.println(10 + 20);
		System.out.println("10" + "20");
		
		/* 특수 문자 사용시 앞에 \를 붙인다.
		 * \"
		 * \t 탭
		 * \n \r 줄바꿈
		 */
		System.out.println("내 \r이름은 \t\"홍길동\"\n입니다.");		
		System.out.println("{\"name\" : \"홍길동\", \"age\" : 20}");
		
		/* 문자열 -> 정수, 실수 변환
		 * 정수 : Integer.parseInt();
		 * 실수 : Double.parseDouble();
		 */
		String a = "100";
		String b = "127.99";
		int num1 = Integer.parseInt(a);
		double num2 = Double.parseDouble(b);
		System.out.println(num1 + num2);
		String c = "122.01";
		double num3 = Double.parseDouble(c);
		
		int result = sum(10,  12);
		double result1 = sum(num1, num2);
		double result2 = minus(num2, num3);
		System.out.println(result);
		System.out.println(result1);
		System.out.printf("두 수의 차이는 %.2f 입니다.", result2); // result2의 값이 소수점이 너무 길어서 printf( %.2f , )를 통해 소수점 2자리까지 줄임.
	}
	
	// 2개의 숫자를 합한 결과를 반환 / 반환하는게 없으면 void를 붙인다. 따라서 void를 붙이면 main method의 int result = error
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	// main method의 result1을 위한 method
	public static double sum(int n1, double n2) {
		double sum = n1 + n2;
		return sum;
		
	}
	
	// main method의 result2
	public static double minus(double n1, double n2) {
		double sum = n1 - n2;
		return sum;
		
	}

}
