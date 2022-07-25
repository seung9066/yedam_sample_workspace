package homework;

import java.util.Scanner;

public class _0725 {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scan = new Scanner(System.in);
        String[] count = null;
        int[] price = null;
        while (run) {
            System.out.println("1. 상품 수 | 2. 상품 및 가격입력 | 3. 제품별 가격 | 4. 분석 | 5. 종료");
            System.out.print("입력 >> ");
            int selectno = Integer.parseInt(scan.next());
            switch (selectno) {
                case 1:
                    System.out.print("상품 수 >> ");
                    int a = scan.nextInt();
                    count = new String[a];
                    price = new int[a];
                    break;
                case 2:
                    for (int i = 0; i < count.length; i++) {
                        System.out.print("상품 명 >> ");
                        String product = scan.next();
                        count[i] = product;
                        System.out.print("가격 >> ");
                        int pdprice = scan.nextInt();
                        price[i] = pdprice;
                    }
                    break;
                case 3:
                    for (int i = 0; i < count.length; i++) {
                        System.out.println(count[i] + " : " + price[i]);
                    }
                    break;
                case 4:
                    int max = 0;
                    int sum = 0;
                    String max1 = "";
                    for (int i = 0; i < count.length; i++) {
                        if (max < price[i]) {
                            max = price[i];
                            max1 = count[i];
                        }
                    }
                    for (int i = 0; i < count.length; i++) {
                        sum += price[i];
                    }
                    System.out.println("최고 가격 제품 : " + max1  + " | "+ max1 +" 제외 상품 총합 : " + (sum - max));
                    break;
                case 5:
                    System.out.println("프로그램 종료 중...");
                    run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
