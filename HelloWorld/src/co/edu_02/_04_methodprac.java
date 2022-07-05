package co.edu_02;

public class _04_methodprac {
	// 구구단

	public static void gugudan(int a) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(a+ "단 : " + a * i);
		}
	}

	public static void gugu(int a, int b) {
		System.out.println("결과 : " + a * b);
	}
	
	public static void main(String[] args) {
		
		gugudan(3);
		gugu(3, 7);
		
	}
}
