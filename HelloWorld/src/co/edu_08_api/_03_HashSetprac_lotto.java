package co.edu_08_api;

import java.util.HashSet;

public class _03_HashSetprac_lotto {
	public static void main(String[] args) {
//		int[] lotto = new int[6];
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = (int) (Math.random() * 45) + 1;
//		}
//		for (int num : lotto) {
//			System.out.println(num);
//		}
		
		HashSet<Integer> set = new HashSet<Integer>();

		while (set.size() < 6) {
			int i = (int) (Math.random()*45) +1 ;
			set.add(i);
			System.out.println(set.size()+ "번째 숫자 : " + i);
		}
	}
}
