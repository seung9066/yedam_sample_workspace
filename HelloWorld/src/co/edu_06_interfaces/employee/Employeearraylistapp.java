package co.edu_06_interfaces.employee;

import java.util.Scanner;

public class Employeearraylistapp {

    public static void main(String[] args) {

        Employeearraylist app = Employeearraylist.getInstance();
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("1. 초기화 | 2. 사원입력 | 3. 사원리스트 | 4. 상세검색 | 9. 종료");
            System.out.print("선택 >> ");
            int selectno = scan.nextInt();
            if (selectno == 1) {
                app.init();
            } else if (selectno == 2) {
                app.input();
            } else if (selectno == 3) {
                app.printList();
            } else if (selectno == 4) {
                System.out.print("검색한 사번입력 >> ");
                int empId = scan.nextInt();
                Employee emp = app.search(empId);
                System.out.println(emp.getDetailInfo());
            } else if (selectno == 9) {
                System.out.println("프로그램 종료...");
                break;
            }
        }

    }
}
