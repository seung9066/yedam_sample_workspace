package homework;

import java.util.Scanner;

public class _0722_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = {10, 20, 30, 50, 3, 60, -3};

        System.out.print("문제1) ");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 60) {
                System.out.println("60의 인덱스 : " + i);
            }
        }

        System.out.print("문제2) ");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 3) {
                System.out.print(arr1[i] + " ");
            }
        }
        System.out.println();

        System.out.print("문제3) 출력하지 않을 배열 인덱스 >> ");
        int a = scan.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            if (i == a) {
                arr1[i] = 1000;
            }
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        int max = 0;
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
            if (min > arr1[i]) {
                min = arr1[i];
            }
        }
        System.out.printf("문제4) 최대값 : %d, 최소값 : %d\n", max, min);

        System.out.println("문제5) 열개의 정수를 입력하시오");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("3의 배수 : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
