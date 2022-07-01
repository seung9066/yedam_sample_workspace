package co.edu;

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
	}
}
