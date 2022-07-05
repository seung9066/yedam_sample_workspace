package co.edu_01;

public class _10_forprac2 {
	public static void main(String[] args) {
		// 1 ~ 100 수를 출력
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			// 짝수만 출력
			if (i % 2 == 0) {
				System.out.println(i);
				// sum(짝수) 누적
				sum += i;
				System.out.println(sum);
			}
		}

		// 구구단 3단 출력
		for (int i = 1; i < 9; i++) {
			int a = 3;
			a = 3 * i;
			System.out.println(a);
		}
	}

}
