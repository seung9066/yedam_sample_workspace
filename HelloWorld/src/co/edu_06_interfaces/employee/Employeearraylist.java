package co.edu_06_interfaces.employee;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 컬렉션 기반으로 기능 구현
 */
public class Employeearraylist implements Employeelist {
	
	private static Employeearraylist instance = new Employeearraylist();
	private Employeearraylist() {}
	public static Employeearraylist getInstance() {
		return instance;
	}
	
	ArrayList<Employee> list;
	int empNum; // 필요없음 add로 계속 넣으면 됨
	Scanner scan = new Scanner(System.in);


	
	@Override
	public void init() {
		list = new ArrayList<Employee>();
		System.out.println("초기화 되었습니다.");
	}

	@Override
	public void input() {
		System.out.print("사번 >> ");
		int no = Integer.parseInt(scan.nextLine());
		
		System.out.print("이름 >> ");
		String name = scan.nextLine();
		
		System.out.print("급여 >> ");
		int sal = Integer.parseInt(scan.nextLine());
		
		list.add(new Employee(no, name, sal));
	}

	@Override
	public Employee search(int empId) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getEmployeeId() == empId);
			return list.get(i);
		}
		return null;
	}

	@Override
	public void printList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d | %s | %d\n",list.get(i).getEmployeeId(),list.get(i).getName(), list.get(i).getSalary());
		}
	}

}
