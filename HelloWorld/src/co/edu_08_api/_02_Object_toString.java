package co.edu_08_api;

/*
 * 기본적으로 모든 클래스는 최상위 클래스인 Object를 상속받음
 */

class Member1 {
	String id;
	int age;

	public String toString() {
		return "아이디 : " + id + " " + "나이 : " + age;
	}
}

public class _02_Object_toString {

	public static void main(String[] args) {

		Object obj1 = new Object(); // instance => 주소값

		System.out.println("Object : " + obj1.toString());

		String name1 = new String("홍길동");
		System.out.println("String : " + name1.toString());

		Member1 member1 = new Member1();
		member1.id = "user1";
		member1.age = 10;

		System.out.println("Override : " + member1.toString()); // 원래 주소값이 나와야 하지만 toString() Override를 통해 주소값이 아닌 지정 값이
																// 나옴

	}

}
