package co.edu_04;

public class _01_calculator {
	
	// 정적 필드 (static = 고정된) : student처럼 여러 학생의 값을 지정하지 않아도 되기에 사용
	public static double pi = 3.1415; // static을 붙여주면 생성자 없이 바로 실행가능(인스턴스를 만들 필요가 없다.)
	
	// 생성자 = 인스턴스를 만들겠다.
	
	
	// 정적 메소드 (static)
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
}
