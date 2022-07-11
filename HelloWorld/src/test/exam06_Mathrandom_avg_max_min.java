package test;

public class exam06_Mathrandom_avg_max_min {
	public static void main(String[] args) {
		int[] intarry = new int[6];
		int max = intarry[0];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < intarry.length; i++) {
			intarry[i] = (int) (Math.random() * 100) + 1; // 1~100사이의 랜덤한 수
			sum += intarry[i]; // 총합
		}

		avg = (double) sum / intarry.length; // 평균
		System.out.printf("평균 : %.1f\n", avg);
		int min = intarry[0];
		for (int i = 0; i < intarry.length; i++) {
			if (max < intarry[i]) { // 최대값
				max = intarry[i];
			}
			if (min > intarry[i]) { // 최소값
				min = intarry[i];
			}
		}
		System.out.println("최대 : "+max);
		System.out.println("최소 : " + min);

		for (int num : intarry) {
			System.out.println(num);
		}

	}

}
