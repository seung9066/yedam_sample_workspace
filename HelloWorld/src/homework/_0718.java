package homework;

public class _0718 {
    public static void main(String[] args) {
        int x = -5;
        int y = 10;
        int result = -x;
        System.out.printf("1-1) x : %d, result : %d\n", x, result);
        result = ++x + y--;
        System.out.printf("1-2) x : %d, y : %d, result : %d\n", x, y, result);
        result = x + y;
        System.out.printf("1-3) x : %d, y : %d, result : %d\n", x, y, result);

        int m = 10;
        int n = 5;
        System.out.println("문제 2) " + (!(m*2 == n*4) || !(n<=5)));
        System.out.println("문제 2) " + (!(m/2 > 5) && !(n%2 <1)));

        int val = 0;
        val += 10;
        System.out.println("문제 3) " + val);
        val -= 5;
        System.out.println("문제 3) " + val);
        val *= 3;
        System.out.println("문제 3) " + val);
        val /= 5;
        System.out.println("문제 3) " + val);

        int intResult = (val > 0) ? val : 0;
        System.out.println("문제 4) " + intResult);

        int a = 10;
        int b = -8;
        String strResult = (a > 0 && b > 0) ? "both a and b are zero or more" : "One of a or b is negative number";
        System.out.println("문제 5) " + strResult);

    }
}
