package homework;

import java.util.Scanner;

public class _0704 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("---------------------------\n1. 예금 :  2. 출금 :  3. 잔고 :  4. 종료\n---------------------------");
            System.out.print("선택 >> ");
            int menu = scan.nextInt();
            if (menu == 1) {
                System.out.println("---------------------------\n1. 예금 :  2. 출금 :  3. 잔고 :  4. 종료\n---------------------------");
                System.out.println("선택 > 1");
                System.out.print("예금액 > ");
                int account = scan.nextInt();
                balance += account;
                System.out.printf("잔액은 %d 원 입니다.\n", balance);
            }
            if (menu == 2) {
                System.out.println("---------------------------\n1. 예금 :  2. 출금 :  3. 잔고 :  4. 종료\n---------------------------");
                System.out.println("선택 > 2");
                System.out.print("출금액 > ");
                int account = scan.nextInt();
                balance -= account;
                if (balance >= 0) {
                    System.out.printf("잔액은 %d 원 입니다.\n", balance);
                }
                if (balance < 0) {
                    System.out.println("잔액이 부족합니다.");
                    balance += account;
                    System.out.printf("잔액은 %d 원 입니다.\n", balance);
                }
            }
            if (menu == 3) {
                System.out.println("---------------------------\n1. 예금 :  2. 출금 :  3. 잔고 :  4. 종료\n---------------------------");
                System.out.println("선택 > 3");
                System.out.print("잔고 > ");
                System.out.println(balance);
            }
            if (menu == 4) {
                System.out.println("---------------------------\n1. 예금 :  2. 출금 :  3. 잔고 :  4. 종료\n---------------------------");
                System.out.println("선택 > 4");
                System.out.println("프로그램 종료");
                break;
            }
            if (menu > 4) {
                System.out.println("잘못된 접근입니다.");
            }


        }


    }
}
