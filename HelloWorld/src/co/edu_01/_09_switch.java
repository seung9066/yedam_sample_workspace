package co.edu_01;

public class _09_switch {
	public static void main(String[] args) {
		double result = Math.random(); // 0 <= temp < 1 의 실수값을 랜덤으로 지정. (임의의 실수)
		System.out.println(result);

		double result1 = Math.random() * 10; // 0 <= temp < 10
		System.out.println(result1);

		int result2 = (int) (Math.random() * 10);
		/* 형변환을 통해 double -> int / (int) Math.random()*10;은 0.xxx의 int 변환은 
		* 0이므로 (Math.random()*10)으로 우선 작업하게 만듬 
		* result2 < 10이다. 따라서 result2는 9까지만 나온다.
		*/
		
		System.out.println(result2);

		if (result2 == 1) {
			System.out.println("1번");
		} else if (result2 == 2) {
			System.out.println("2번");
		} else if (result2 == 3) {
			System.out.println("3번");
		} else if (result2 == 4) {
			System.out.println("4번");
		} else if (result2 == 5) {
			System.out.println("5번");
		} else if (result2 == 6) {
			System.out.println("6번");
		} else if (result2 == 7) {
			System.out.println("7번");
		} else if (result2 == 8) {
			System.out.println("8번");
		} else if (result2 == 9) {
			System.out.println("9번");
		}

		/*
		 * switch case가 하나 시작되면 그뒤의 case까지 계속 진행한다. ex) 3번이 실행되면 case 3, 4, 5 ... 따라서
		 * break; 구문을 통해 멈춰주어야 한다.
		 */
		switch (result2) {
		case 1:
			System.out.println("1번 출력");
			break;
		case 2:
			System.out.println("2번 출력");
			break;
		case 3:
			System.out.println("3번 출력");
			break;
		case 4:
			System.out.println("4번 출력");
			break;
		case 5:
			System.out.println("5번 출력");
			break;
		case 6:
			System.out.println("6번 출력");
			break;
		case 7:
			System.out.println("7번 출력");
			break;
		case 8:
			System.out.println("8번 출력");
			break;
		case 9:
			System.out.println("9번 출력");
			break;

		}

	}

}
