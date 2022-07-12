package co.edu_10_collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// 키와 값을 쌍으로 저장

public class _03_Map {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 80);
		map.put("김민수", 85);
		map.put("최기동", 92);
		map.put("홍길동", 89); // 동일한 키값이 들어오면 기존의 값(value)을 바꾸는걸로 적용

		int score = map.get("홍길동"); // 키를 넣으면 값을 출력
		System.out.println(score);

		System.out.println("==================================");

		map.remove("홍길동");

		// 반복요소
		Set<String> keyset = map.keySet(); // 키를 새로운 Set 컬렉션에 저장

		// 확장 for
		for (String key : keyset) {
			Integer val = map.get(key); // 값
			System.out.println("키 : " + key + " | 값 : " + val);
		}

		System.out.println("==================================");

		// 키 && 값 => entrySet()
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> ent : entrySet) {
			System.out.println("ent : " + ent);
			String key = ent.getKey();
			Integer val = ent.getValue();
			System.out.println("키 : " + key + " | 값 : " + val);
		}

	}
}
