package co.edu_08_api.prac;

public class IndexOf {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if (subject.indexOf("자바") != -1) { // -1 : 특정 문자열이 포함되어 있지 않다.
			System.out.println("자바와 관련된 책");
		} else {
			System.out.println("자바와 관련 없는 책");
		}
		
		String name = "java.util.abcd";
		int a = name.lastIndexOf(".");
		System.out.println(name.substring(a+1));
	}
}
