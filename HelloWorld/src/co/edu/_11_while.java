package co.edu;

public class _11_while {
	public static void main(String[] args) {

		int i = 0;

		// while 값이 참이면 그동안 반복된다.
		while (i < 5) {
			i++; // 증감식. 증감식이 없으면 i는 1로 고정되어 무한루프에 빠진다. 따라서 i를 증감시켜 5가 만들어지면 while문이 끝난다.
			System.out.println(i);
		}
		System.out.println("end.1");

		boolean istrue = true;
		while (istrue) {
			int num = (int) (Math.random() * 10);
			System.out.println("num : " + num);
			if (num == 5) {
				istrue = false;
			}
		}
		System.out.println("end.2");

		while (true) {
			int sum = (int) (Math.random() * 10);
			System.out.println("sum : " + sum);
			if (sum==6) { // 특정 조건 sum == 6이 완성되면 break;(빠져나온다)
				break;
			}
		}
		System.out.println("end.3");

	}
}
