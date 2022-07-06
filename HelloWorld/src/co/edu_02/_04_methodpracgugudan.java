package co.edu_02;

public class _04_methodpracgugudan {
	// 구구단

	public static void gugudan(int a) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", a, i, (a * i));
		}
		System.out.println();
	}

	public static void gugu(int a, int b) {
		System.out.printf("%d * %d = %d\n", a, b, (a * b));
		System.out.println();
	}

	public static void main(String[] args) {
		
		System.out.println("gugudan");
		gugudan(3);
		System.out.println("gugu");
		gugu(2, 7);
		System.out.println("응용");
		for (int i=2; i<=5; i++) // method를 응용한 2~5단 출력
			gugudan(i);

	}
}
