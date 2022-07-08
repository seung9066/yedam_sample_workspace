package co.edu_06_interfaces.employee;
/*
 * 배열기반 기능 구현 (implement)
 */

import java.util.Scanner;

public class Employeearray implements Employeelist{
	
	// 싱글톤
	private static Employeearray instance = new Employeearray();
	private Employeearray() {}
	public static Employeearray getInstance() {
		return instance;
	}
	
	Employee[] list; // 사원정보 배열
	int empNum; // 사원수를 편하게
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void init() {
		System.out.print("사원 수 >> ");
		int num = Integer.parseInt(scan.nextLine());
		list = new Employee[num];
	}

	@Override
	public void input() {
		System.out.printf("%d 사번 >> ", empNum);
		int no = Integer.parseInt(scan.nextLine());
		
		System.out.print("이름 >> ");
		String name = scan.nextLine();
		
		System.out.print("급여 >> ");
		int sal = Integer.parseInt(scan.nextLine());
		
		list[empNum++] = new Employee(no, name, sal);
	}

	@Override
	public Employee search(int empId) {
		for (int i = 0; i < empNum; i++) {
			if (list[i].getEmployeeId() == empId);
			return list[i];
		}
		return null; // 루틴을 다 돌아보고 없으면 null 값 return
	}

	@Override
	public void printList() {
		for (int i = 0; i < empNum; i++) {
			System.out.printf("%d | %s | %d\n", list[i].getEmployeeId(), list[i].getName(), list[i].getSalary());
		}
	}

}
