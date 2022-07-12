package co.edu_10_collect;

import java.util.Stack;

public class _04_Stack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		stack.push("홍길동");
		stack.push("김민수");
		stack.push("박찬호");
		
		String elem = stack.pop(); // 요소를 빼내는 작업
		System.out.println(elem);
		
		elem = stack.pop(); // 요소를 빼내는 작업
		System.out.println(elem);
		
		elem = stack.pop(); // 요소를 빼내는 작업
		System.out.println(elem);
		
		if (stack.isEmpty()) {
			System.out.println("스택에 요소가 없음");
		}
	}
}
