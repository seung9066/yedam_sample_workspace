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
	
	ArrayList<Employee> list = new ArrayList<Employee>();
	int empNum; // 필요없음 add로 계속 넣으면 됨
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void init() {
		
	}

	@Override
	public void input() {
		System.out.println("사번 >> ");
		int no = Integer.parseInt(scan.nextLine());
		
		System.out.print("이름 >> ");
		String name = scan.nextLine();
		
		System.out.print("급여 >> ");
		int sal = Integer.parseInt(scan.nextLine());
		
		list.add(new Employee(no, name, sal));
	}

	@Override
	public Employee search(int empId) {
		return null;
	}

	@Override
	public void printList() {
		list.get();
	}

}
