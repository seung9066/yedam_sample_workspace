package co.edu_10_collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set (인터페이스) -> HashSet, TreeSet

public class _02_Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("사과");
		set.add("딸기");
		set.add("수박");
		set.add("딸기"); // 중복된 값은 담기지 않음
		System.out.println("크기 : " + set.size());

		set.remove("딸기"); // index가 아니어서 삭제할 내용 직접 입력
		System.out.println(set.contains("딸기")); // ("요소") 찾기

		if (set.isEmpty()) { // collect 안이 비어있는지
			System.out.println("컬렉션이 비어있음");
		}

		// 반복요소처리
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println("iter : " + val);
		}
		// 반복처리
		iter = set.iterator(); // 새롭게 반복을 하고 싶으면 반복자를 다시 획득
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println("iter1 : " + val);
		}

		// index가 없기에 확장 for만 가능
		for (String val : set) {
			System.out.println("확장 for : " + val);
		}

	}

}
