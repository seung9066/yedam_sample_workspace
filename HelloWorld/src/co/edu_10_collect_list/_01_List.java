package co.edu_10_collect_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List collection : List(인터페이스) -> ArrayList, LinkedList, Vector

public class _01_List {
	public static void main(String[] args) {
					
		List<String> sList = new ArrayList<String>();
		sList.add("홍길동");
		sList.add("김민기");
		String result = sList.get(1); // 값 읽어오기
		sList.remove(0); // 값 삭제
		sList.set(0, "홍길동");
		sList.add("홍길동");
		
		// 반복자
		Iterator<String> iter = sList.iterator(); // 반복자 생성
		while(iter.hasNext()) { // .hasNext() : 요소의 존재여부 체크
			String val = iter.next(); // .next() : 요소를 가지고 오는 메소드
			System.out.println("반복자 : " + val);
		}
		
		// index 기반으로 요소를 저장
		for (int i = 0; i<sList.size(); i++) {
			System.out.println("for : " + sList.get(i));
		}
		
		// 확장 for구문
		for (String val : sList) {
			System.out.println("확장 for : " + val);
		}
		
	}

}
