package co.edu_02;

public class _02_array {
	public static void main(String[] args) {
		
		// 같은 타입의 데이터를 연속된 공간에 저장하는 자료구조
		
		/* 배열의 저장공간 선언
		* int[] a = new int[x]; = x개짜리 int객체를 저장하는 int주소 a
		*/
		int[] intary = new int[5];
		intary[0] = 10; // 첫번째 공간에 10이라는 값을 저장
		intary[4] = 50; // 다섯번째 공간에 50이라는 값을 저장
		System.out.println(intary[3]); // 세번째 공간에 아무것도 저장하지 않았기에 0으로 나옴 = int형 초기값 = 0
		System.out.println(intary.length); // 배열의 크기를 알려줌
		for (int i = 0; i < intary.length; i++) {
			System.out.println(intary[i]);
		}
		System.out.println("intary end.");
		
		double[] dbary = new double[5]; // double 형 공간 5개 선언
		for (int i = 0; i < dbary.length; i++) {
			System.out.println(dbary[i]);
		}
		
		boolean[] blary = new boolean[3];
		blary[1] = true;
		for (int i = 0; i < blary.length; i++) {
			System.out.println(blary[i]); // boolean형의 초기값은 false
		}
		System.out.println("blary end.");
		
		String[] stary = {"홍길동", "김민수", "허민기"}; // 값을 지정하여 크기를 지정
		System.out.println(stary.length);
		// stary[3] = "황경용"; -> error 크기를 늘리는 것 불가능
		stary[2] = "황경용"; // 크기 내에서의 값 변경은 가능
		for (int i = 0; i < stary.length; i++) {
			System.out.println(stary[i]);
		}
		System.out.println("stary end.");
		
	}

}
