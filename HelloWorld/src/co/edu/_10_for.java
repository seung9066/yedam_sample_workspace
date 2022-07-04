package co.edu;

public class _10_for {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
				System.out.println(sum);
			}
		}
		System.out.println("결과값 : " + sum);
		
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result += i;
			System.out.println(result);
		}
		System.out.println("1 ~ 10 까지 누적 합 : " + result);
		
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		
	}

}
