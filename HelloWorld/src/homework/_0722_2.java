package homework;

import java.util.Scanner;

public class _0722_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        int stumax = 0;
        int sum_scores = 0;

        while (run) {
            System.out.println("------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("------------------------------------------------------");
            System.out.print("선택 >> ");
            int selectno = scan.nextInt();

            switch (selectno) {
                case 1:
                    System.out.print("학생수 입력 >> ");
                    studentNum = scan.nextInt();
                    scores = new int[studentNum];
                    break;
                case 2:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print((i+1)+"번째 학생 점수 >> ");
                        scores[i] = scan.nextInt();
                    }
                    break;
                case 3:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println((i+1) + "번째 학생 점수 >> " + scores[i]);
                    }
                    break;
                case 4:
                    for (int i = 0; i < scores.length; i++) {
                        sum_scores += scores[i];
                        if (stumax < scores[i]) {
                            stumax = scores[i];
                        }
                    }
                    System.out.println("최고 점수 : " + stumax + "\n평균 점수 : " + (sum_scores/studentNum));
                    break;
                case 5:
                    System.out.println("종료 중...");
                    run = false;
            }

        }
        System.out.println("종료 되었습니다.");
    }
}
