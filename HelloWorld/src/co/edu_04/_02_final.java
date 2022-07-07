package co.edu_04;


/*
 * 상수 vs 변수
 * final 변수 = 상수
 * final 메소드 = 재정의(overriding) 불가
 * final 클래스 = 상속 불가
 */

/*
 * class 선언은 파일 하나에 하나 작성이 원칙
 */

class person {
	final String ssn; // 주민번호
	String name;
	
	public person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

public class _02_final {

	public static void main(String[] args) {
		
		// 변수 : 값을 바꿀 수 있음
		String name = "홍길동";
		name = "김민수";
		
		// 상수(final) : 한번 지정된 값을 바꿀 수 없음
		final int num = 10;
		// num = 20; = error (final)
		
		person person = new person("0000000-0000000", "홍길동");
		person.name = "홍민수";
		// person.ssn = "1111111-1111111"; = error (final)
	}

}
