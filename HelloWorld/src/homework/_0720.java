package homework;

import java.io.IOException;
import java.util.Scanner;

public class _0720 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("문제1) 두 숫자를 적으세요");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x > 0 && y > 0)
            System.out.println("1 사분면");
        else if (x < 0 && y > 0)
            System.out.println("2 사분면");
        else if (x < 0 && y < 0)
            System.out.println("3 사분면");
        else if (x > 0 && y < 0)
            System.out.println("4 사분면");

        System.out.println("문제2) 연도를 적으세요");
        int A = scan.nextInt();
        if (A % 4 == 0 && A % 100 != 0 || A % 400 == 0)
            System.out.println("윤년입니다.");
        else
            System.out.println("윤년이 아닙니다.");

        System.out.println("문제3) 가위 바위 보!");
        String r = scan.next();
        switch (r) {
            case "가위":
                System.out.println("이기기 위해선 바위를 내야합니다.");
                break;
            case "바위":
                System.out.println("이기기 위해선 보를 내야합니다.");
                break;
            case "보":
                System.out.println("이기기 위해선 가위를 내야합니다.");
                break;
        }

        System.out.println("문제4) 별찍기");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("문제5) 구구단");
        System.out.print("단 : ");
        int a1 = scan.nextInt();
        System.out.print("곱할 수 : ");
        int a2 = scan.nextInt();
        for (int i = 1; i <= a2; i++) {
            System.out.printf(a1 + " x " + i + " = " + (a1 * i));
            System.out.println();
        }

    }
}


