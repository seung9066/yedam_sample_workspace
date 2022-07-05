package co.edu_02;

public class _02_arrayprac1 {
	public static void main(String[] args) {
		// a반 80, 85, 83
		// b반 79, 84, 90
		
		
		int[][] classary = new int[2][3];
		classary[0][0] = 80;
		classary[0][1] = 85;
		classary[0][2] = 83;
		classary[1][0] = 79;
		classary[1][1] = 84;
		classary[1][2] = 90;
		int sum_a = 0;
		int sum_b = 0;

		for (int i = 0; i < classary[0].length; i++) {
			sum_a += classary[0][i];
		}
		System.out.println("A반 평균 점수 : " + (double)sum_a / classary[0].length);
		for (int i = 0; i < classary[1].length; i++) {
			sum_b += classary[1][i];
		}
		System.out.println("B반 평균 점수 : " + (double)sum_b / classary[1].length);


	}

}
