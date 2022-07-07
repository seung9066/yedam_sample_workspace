package co.edu_02;

public class _04_method3 {
	public static void main(String[] args) {
		sum(10 ,20);
		
		int result = sum2(5, 10);
		System.out.println(result);
		
		result = sum2(sum2(3,5), sum2(5,7));
		System.out.println(result);
		
		double trans = weight(180);
		System.out.println("적정 몸무게는 : "+trans);
		
		double tri = gettri(23.4, 12.2);
		System.out.printf("삼각형의 넓이 : %.1f\n",tri);
		
	}
	
	public static void sum(int n1, int n2) {
		int result = n1 * 2 + n2 * 3;
		System.out.println("결과 : " + result);
	}
	
	public static int sum2(int n1, int n2) {
		int result = n1 * 2 + n2 * 3;
		return result; // sum2 method 호출한 영역으로 결과값 반환
	}
	
	// 키에 따른 적정 몸무게
	public static double weight (double height) {
		double result = (height - 100) * 0.9;
		return result;
	}
	
	public static double gettri (double x, double y) {
		double result = (x * y) / 2;
		return result;
	}
	
}
