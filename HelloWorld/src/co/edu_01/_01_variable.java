package co.edu_01;

	/* 변수
	 * 선언하면서 값을 할당 = 초기화
	 * 변수를 사용하기 위해서는 값이 정해져야 한다.
	 * 
	 * int : 양의 정수, 4byte
	 * double : 실수, 8byte
	 * boolean : 논리(true, false)
	 * String : 문자열
	 * 
	 * 정수 : byte(1byte) < short(2byte) < int(4byte) < long(8byte)
	 * 실수 : float(4byte) < double
	 * 
	 * 정수는 정확한 값을 가지고 오지만 실수는 근사치를 가져온다.
	 */

public class _01_variable {
	public static void main(String[] args) {
		String name = "최승현";
		int myAge = 28;
		int yourAge;
		yourAge = 22;
		double height = 180.1;
		boolean isMarried = true;
		String myAddress = "대구";
		char a = ' ';
		
		System.out.println(name + a + myAge + a + myAddress + a + height);
		
		myAge = 30; // 변수 값 변경 됨
		height = 181.1;
		
		int result = myAge + yourAge;
		double result1 = myAge + height; // myAge는 자동으로 정수를 실수로 바꿔주지만 result는 자동으로 바뀌지 않기에 double result1으로 변경
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println("안녕하세요 " + name + "입니다.");
		
		float f1 = 23.4f; // float형 변수는 뒤에 지정값에 f를 붙여야한다.
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		double d1 = 23.4; // double형 변수 뒤에 지정값에는 f 필요 없다.
		double result2 = 1.1 + 2.2;
		System.out.println(result2); // 정수는 정확한 값을 가지고 오지만 실수는 근사치를 가져온다. 따라서 3.300003으로 나옴
		
		float sum = 2345L + 22.3F; // long sum = error / long형의 용량이 훨씬 크지만 float는 long형으로 읽지 못하기에 float로 해야한다.
	}
}
