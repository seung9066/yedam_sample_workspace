package co.edu_10_collect_list;

import java.util.ArrayList;
import java.util.LinkedList;

// ArrayList vs LinkedList

public class _02_LinkedList {
	public static void main(String[] args) {

		ArrayList<String> aList = new ArrayList<String>();

		LinkedList<String> lList = new LinkedList<String>();

		long start = System.currentTimeMillis(); // 현재시점
		for (int i = 0; i < 100000; i++) {
			aList.add(0, Integer.toString(i)); // aList : 하나씩 밀어내며 저장 -> 오래걸림
		}
		long end = System.currentTimeMillis();
		System.out.println("aList 걸린시간 : " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			lList.add(0, Integer.toString(i)); // lList :
		}
		end = System.currentTimeMillis();
		System.out.println("lList 걸린시간 : " + (end - start));

	}

}
