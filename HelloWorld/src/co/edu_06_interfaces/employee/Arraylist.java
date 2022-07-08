package co.edu_06_interfaces.employee;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {

		Employee[] empary = new Employee[10]; // 배열 선언 10개짜리 선언
		empary[0] = new Employee(); // 추가
		empary[0] = null; // 삭제
		empary[0] = new Employee(); // 변경

		for (int i = 0; i < empary.length; i++) {
			System.out.println("empAry[" + i + "]");
		}

		ArrayList<Employee> emplist = new ArrayList<Employee>(); // 배열 생성자 선언
		emplist.add(new Employee()); // 추가
		// emplist.remove(0); // 삭제
		emplist.set(0, new Employee()); // 변경 : 0번째 위치에 바꿈
		emplist.add(new Employee()); // 추가
		System.out.println(emplist.get(0)); // 0번째 정보를 가져옴

		for (int i = 0; i < emplist.size(); i++) { // length가 아닌 size
			System.out.println("emplist[" + i + "]");
		}

	}
}
