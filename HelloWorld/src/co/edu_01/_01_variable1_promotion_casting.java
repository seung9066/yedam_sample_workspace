package co.edu_01;

public class _01_variable1_promotion_casting {
	public static void main(String[] args) {
		byte b1 = 10; // -128 ~ 127
		short s1 = 0; // -32,768 ~ 32,767
		int n1 = 0; // -2147483648 ~ 2147483647
		long l1 = 0; // -9223372036854775808 ~ -9223372036854775807
		
		// byte result = b1 + 20; = error / 연산자 변수 타입은 int이기에 b1을 int 타입 변수로 바꿔버린다.
		int result = b1 + 20;
		// result = l1 + 20; = error / l1의 변수 타입에 따라 20도 long 타입 변수로 바뀐다(자동형변환:promotion). 따라서 int에 담을 수 없다.
		long result1 = l1 + 20;
		result = (int)l1 + 20; // (int)를 통해 l1의 변수 타입을 long형에서 int형으로 강제형변환(casting)한다. 범위이내에만 가능.
		System.out.println(result);
		System.out.println(result1);
		
		char c1 = 'a'; // 문자 하나의 숫자 값을 담고 있다. a = 97 b = 98 ... A = 65 B = 66 ...
		char c2 = 'b'; // c1 = c1 + 1 = error
		c1++; // b가 된다.
		
		System.out.println((int)c1 + c2);
		System.out.println((int)c1 + 1);
		System.out.println(c1);
		
		// i = 27 보다 작으며 1씩 증가한다.
		for (int i = 0; i < 27; i++) {
			System.out.println(c1++);
			
		}
		
		// 이력변경추가 2022.07.01. 12:55 (perspective에서 git으로 변경 후 히스토리)
		System.out.println("이력변경추가");
		
		// git에서 수정한 작업
		System.out.println("git");
	}

}
