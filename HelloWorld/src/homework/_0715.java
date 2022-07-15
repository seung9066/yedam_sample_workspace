package homework;

public class _0715 {
    public static void main(String[] args) {
        int a = 37;
        int b = 91;
        System.out.println("문제1) 변수명1 : " + a + " 변수명2 : " + b);
        System.out.println("문제2.1) "+ (b+a));
        System.out.println("문제2.2) " + (b-a));
        System.out.println("문제2.3) " + (b*a));
        System.out.println("문제2.4) " + ((double)b/a));

        int var1 = 128;
        String var2 = "B";
        int var3 = 44032;
        long var4 = 100000000000L;
        double var5 = 43.93106;
        double var6 = 301.3;
        System.out.printf("문제3-1) %d, int\n", var1);
        System.out.printf("문제3-2) %s, String\n", var2);
        System.out.printf("문제3-3) %d, int\n", var3);
        System.out.printf("문제3-4) %d, long\n", var4);
        System.out.printf("문제3-5) %f, double\n", var5);
        System.out.printf("문제3-6) %f, double\n", var6);

        byte a1 = 35;
        byte b1 = 23;
        int c1 = 463;
        long d1 = 1000L;
        long result1 = a1 + c1 + d1;
        System.out.println("문제4-1) " + result1);
        int result2 = a1 + b1 + c1;
        System.out.println("문제4-2) " + result2);
        double e1 = 45.31;
        double result3 = c1 + d1+ e1;
        System.out.println("문제4-3) " + result3);

        int intValue1 = 24;
        int intValue2 = 3;
        int intValue3 = 8;
        int intValue4 = 10;
        char charValue = 'A';
        String strValue = "번지";
        System.out.printf("문제5) %c%d%d%.1f%s\n", charValue, (intValue1+intValue2), intValue3, (double)intValue4, strValue);

        int a2 = 485;
        System.out.println("추가문제) " + (a2/100 + a2/10%10 + a2%10));

    }
}
