package co.edu_07_exception;

/*
 * 인스턴스를 담고 있는 참조변수 = null 일 때 발생하는 예외
 */

public class _01_NullPointer {
	public static void main(String[] args) {
		String name = "Abc";
		name = null;
		
		try { // 1. 에러가 발생히면
		System.out.println(name.toString()); // 현재 null이라서 error 발생
		System.out.println("name 출력");
		} catch(NullPointerException e) { // 2. 이걸로 실행
			System.out.println(e.getMessage());
			e.printStackTrace(); // 프로그램은 정상 작동되며 error가 무엇인지 출력해주는 구문
		}
		System.out.println("프로그램 종료");
	}

}
