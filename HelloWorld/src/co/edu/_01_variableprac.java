package co.edu;

public class _01_variableprac {
	public static void main(String[] args) {
		int r = 1;
		int b = 3;
		int sum_r = 1;
		int sum_b = 3;
		while (sum_b != sum_r + 24) {
			r = r + 4;
			b = b + 4;
			sum_r += r + 4;
			sum_b += b + 4;
		}
		System.out.println(sum_r);
		System.out.println(sum_b);
		System.out.println(sum_r + sum_b);
	}

}
