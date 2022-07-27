package homework._0727_1;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmpDept emp = new EmpDept();
		System.out.print("이름 >> ");
		emp.name = scan.next();
		System.out.print("연봉 >> ");
		emp.sal = scan.nextInt();
		System.out.print("부서 >> ");
		emp.depn = scan.next();
		
		emp.getInformation();
		emp.pirnt();
	}
}
