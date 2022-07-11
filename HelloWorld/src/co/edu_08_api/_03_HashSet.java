package co.edu_08_api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class _03_HashSet {
	public static void main(String[] args) {
		// 데이터 저장 => 배열
		// 컬렉션 ArrayList => 인덱스 값 지정, 동일한 값 다른 인덱스에 저장 가능
		// 컬렉션 HashSet => 인덱스 값 지정 x, 동일한 값 저장 x

		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김갑수");
		set.add("홍길동");

		System.out.println("Hashset 저장된 수 : " + set.size());
		System.out.println("Hashset 저장된 내용 : " + set);
		Iterator<String> iter = set.iterator(); // Iterator : 컬렉션 저장 요소 읽어오기
		while (iter.hasNext()) { // .hasNext() : 컬렉션에서 가지고 올 요소가 있는지 체크
			System.out.println(iter.next()); // .next() 요소 선택
		}

		System.out.println("=================================================");

		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김갑수");
		list.add("홍길동");
		System.out.println("Arraylist 저장된 수 : " + list.size());
		System.out.println("Arraylist 저장된 내용 : " + list);
		for (int i = 0; i < list.size(); i++) { // set에는 인덱스 값이 없기에 set에서는 같은 방법 불가능
			System.out.println(list.get(i));
		}
	}

}
