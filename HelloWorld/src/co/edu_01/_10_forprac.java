package co.edu_01;

public class _10_forprac {
	public static void main(String[] args) {
		/*
		 * 10번 반복
		 * num <= 1 ~ 10 까지의 임의의 정수.
		 * sum <= 2, 3의 배수
		 */

		int num;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			num = (int) (Math.random() * 10) + 1;
			if (num % 2 == 0 || num % 3 == 0) {
				sum += num;
				System.out.println(num + ", " + sum);
			}
		}
		System.out.println("2 or 3의 배수 합계 : " + sum);
		
		/* 
		 * for문 안에 적지 않는 이유 
		 * for문 안에 적으면 for문을 벗어나는 순간 변수가 사라진다.
		 * 초기화 작업은 for문 밖에서 해주어야 한다.
		 */
		int sum2 = 0, sum3 = 0;
		
		for (int i = 1; i <= 10; i++) {
			num = (int) (Math.random() * 10) + 1;
			if (num %2 == 0) {
				sum2 += num;
				System.out.println("2의 배수 " + num + ", " + sum2);
			} else {
				System.out.println("임의의 수 " + num);
			}
			// esle if를 쓰지 않고 if를 두개 쓰는 이유는 6이 나왔을 경우 2의 배수에서 처리되고 3의 배수에서는 처리가 되지 못하기 때문
			if (num %3 == 0) {
				sum3 += num;
				System.out.println("3의 배수 " + num + ", " + sum3);
			} else {
				System.out.println("임의의 수 " + num);
			}
		}
		System.out.println("2의 배수 합계 : " + sum2);
		System.out.println("3의 배수 합계 : " + sum3);

	}

}
