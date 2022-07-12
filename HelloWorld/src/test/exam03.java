package test;

import java.util.Scanner;

public class exam03 {
    /*
     * 문제 3: 배열사용.
     * 정수(int)를 저장할 수 있는 배열(크기 3)을 선언하고 Scanner 클래스를 이용하여 사용자의 입력값을 저장 후
     * 저장 된 값중에서 가장 작은 값과 배열요소의 평균을 구하는 기능을 작성하세요.
     * 출력 예 : [5, 6, 7] 가장 작은 값: 5, 평균: 6.0
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] a = new int[3];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        int low = a[0];
        int sum_a = 0;

        for (int i = 0; i < a.length; i++) {
            sum_a += a[i];
            if (low > a[i]) {
                a[i] = low; // a[i]에 low값을 넣는다.
            }

        }
        System.out.printf("가장 작은값 : %d 평균 : %f", low, (double) sum_a / a.length);

    }
}
