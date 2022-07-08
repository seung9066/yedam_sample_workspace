package co.edu_04_static;

public class _01_main {
	public static void main(String[] args) {
		
		/*
		 * static : 정적메소드, 정적필드에 필요
		 */
		
		
		/* error는 아니지만 메모리를 많이 잡아 먹는다.
		 * Calculator cal = new Calculator();
		 * System.out.println(cal.pi);
		 */
		
		System.out.println(_01_calculator.pi);
		int result = _01_calculator.sum(10, 20);
		System.out.println(result);
		
		// Singleton sing1 = new Singleton(); = error : 생성자가 private
		_01_singleton sing1 = _01_singleton.getinstance();
		_01_singleton sing2 = _01_singleton.getinstance();
		System.out.println(sing1 == sing2);
	}

}
