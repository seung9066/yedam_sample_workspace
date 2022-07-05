package co.edu_02;

public class _04_methodprac1 {

	public static void gugudan(int a) {
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d * %d = %d\t", i, a, (i * a));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		for (int i=1; i<=9; i++)
			gugudan(i);
	}
}
