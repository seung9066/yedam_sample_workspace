package co.edu_02;

class person {
	String name;
	int age;
}

public class _01_datatype {
	public static void main(String[] args) {

		// 기본데이터 타입이기에 num1의 값이 바껴도 num2는 유지된다.
		int num1 = 100;
		int num2 = num1;
		num1 = 200;

		System.out.println("num1 : " + num1); // stack memory : 100 -> 200
		System.out.println("num2 : " + num2); // stack memory : 100 -> 100

		/*
		 * 자바 문자열은 String pool에 저장되지만 new String();으로 저장시 Heap에 저장된다. 
		 * String name1 = new
		 * String("홍길동"); String name2 = name1;
		 */

		// 참조데이터 타입이기에 참조주소값이 같다. 따라서 p1을 바꾸면 p2도 바뀐다.
		person p1 = new person();
		p1.name = "최승현";
		p1.age = 28;
		person p2 = p1;
		p1.name = "박춘배";
		p1.age = 88;
		
		
		System.out.println("이름 : " + p1.name + " 나이 : " + p1.age);
		System.out.println("이름 : " + p2.name + " 나이 : " + p2.age);

	}

}
