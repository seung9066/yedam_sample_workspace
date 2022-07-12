package co.edu_10_collect_generic;

import java.util.ArrayList;

public class _01_Generic_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(); // <> = generic : 타입을 미리 체크하기 위해 사용
		list.add("사과");
		// list.add(100); // generic이 없어도 Object로써 다 넣을 수 있지만 generic을 넣음으로써 int 타입 불가
		
		for(int i = 0; i < list.size(); i++) {
			String result = (String) list.get(i);
			System.out.println(result);
		}
		
	}

}
