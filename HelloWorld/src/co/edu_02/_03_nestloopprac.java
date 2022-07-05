package co.edu_02;

public class _03_nestloopprac {
	public static void main(String[] args) {
		// 구구단
		for (int i = 2; i <= 9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n",i, j, (i*j));
			}
		}
		System.out.println("구구단 end.");
		
		for(int i=0; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", 2, i, (2*i));
		}
		System.out.println("구구단1 end.");

	}

}
