package co.edu_10_collect;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

// 이름, 점수 => map저장
// 김민수 80 / 황현익 75 / 이현승 88
// Scanner 클래스 입력 > 학생이름 입력 -> 점수 반환

public class _03_Mapprac {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김민수", 80);
		map.put("황현익", 75);
		map.put("이현승", 88);

		System.out.print("학생 이름 입력 >> ");
		boolean run = false;
		String a = scan.nextLine();

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> ent : entrySet) {
			if (a.equals(ent.getKey())) {
				Integer val = ent.getValue();
				System.out.println("점수 : " + val);
				run = true;
				break;
			}
		}
		if (!run) {
			System.out.println("없는 학생입니다.");
		}
		
		int avg = 0;
		int sum = 0;
		String tops = null;
		int top = 0;
		
		entrySet = map.entrySet();
		for (Entry<String, Integer> ent : entrySet) {
			Integer val = ent.getValue();
			sum += val;
			if (val > top) {
				top = val; // top에 val을 넣는다.
				tops = ent.getKey();
			}
		}
		avg = sum / map.size();
		System.out.println("평균점수 : " + avg);
		System.out.println("최고점수 : " + top + " | 학생 : " + tops);

	}
}
