package co.edu_02;

public class _03_nestloopprac2_bubblesort {
    public static void main(String[] args) {
        int[] tempary = new int[5];
        for (int i = 0; i < tempary.length; i++) {
            tempary[i] = (int) (Math.random() * 50);
        }

        for (int num : tempary) {
            System.out.println(num);
        }
        System.out.println("end.");

        // 제일 큰값 max를 찾기
        int max = 0;
        for (int num : tempary) {
            if (tempary[0] > tempary[1] && tempary[0] > tempary[2] && tempary[0] > tempary[3]
                    && tempary[0] > tempary[4]) {
                max = tempary[0];
            } else if (tempary[1] > tempary[0] && tempary[1] > tempary[2] && tempary[1] > tempary[3]
                    && tempary[1] > tempary[4]) {
                max = tempary[1];
            } else if (tempary[2] > tempary[0] && tempary[2] > tempary[1] && tempary[2] > tempary[3]
                    && tempary[2] > tempary[4]) {
                max = tempary[2];
            } else if (tempary[3] > tempary[0] && tempary[3] > tempary[1] && tempary[3] > tempary[2]
                    && tempary[3] > tempary[4]) {
                max = tempary[3];
            } else if (tempary[4] > tempary[0] && tempary[4] > tempary[1] && tempary[4] > tempary[2]
                    && tempary[4] > tempary[3]) {
                max = tempary[4];
            }
        }
        System.out.println("가장 큰 값 a : " + max);

        /* 버블정렬
         * 배열 속 두수의 크기를 비교하여 두수의 위치를 바꿈
         * 큰수정렬 : 두수를 비교하여 i가 j보다 작으면 i와 j의 위치를 바꿈
         * 작은수정렬 : 두수를 비교하여 i가 j보다 크면 i와 J의 위치를 바꿈
         */
        for (int i = 0; i < tempary.length; i++) {
            for (int j = i + 1; j < tempary.length; j++) {
                if (tempary[i] < tempary[j]) {
                    int max1 = tempary[i];
                    tempary[i] = tempary[j];
                    tempary[j] = max1;
                }
            }
        }
        System.out.print("큰 수부터 출력 : ");
        for (int i = 0; i < tempary.length; i++) {
            System.out.print(tempary[i] + " ");
        }
        System.out.println();
    }
}
