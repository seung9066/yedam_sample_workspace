package co.edu_10_collect;

import java.util.LinkedList;
import java.util.Queue;

public class _05_Queue {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		
		que.offer("홍길동");
		que.offer("김갑수");
		que.offer("이민기");
		
		while(!que.isEmpty()) {
		String result = que.poll();
		System.out.println(result);
		}
	}
}
