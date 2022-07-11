package co.edu_08_api;

/*
 * 기본적으로 모든 클래스는 최상위 클래스인 Object를 상속받음
 */

class Member {
	String id;
	int age;

	@Override // equals + ctrl + space를 통해 Object의 equals를 가져와 재정의
	public boolean equals(Object obj) {
		
		if (obj instanceof Member) {
			boolean b1 = this.id.equals(((Member) obj).id);
			boolean b2 = this.age == (((Member) obj).age);
			return b1 && b2;
		}
		return false;

	}
}

public class _02_Object_equalsOverride {

	public static void main(String[] args) {

		Object obj1 = new Object(); // instance => 주소값
		Object obj2 = new Object(); // instance => 주소값

		// .equals();
		System.out.println(obj1.equals(obj2));
		String name1 = new String("홍길동"); // 원래 Object는 주소값을 가지기에 false지만 String을 통해 문자열을 가져서 같으면 true 가능
		String name2 = new String("김갑수");
		System.out.println(name1.equals(name2));

		Member member1 = new Member();
		member1.id = "user1";
		member1.age = 10;

		Member member2 = new Member();
		member2.id = "user1";
		member2.age = 10;

		System.out.println(member1.equals(member2)); // 원래는 주소값이 다르기에 false로 나옴 하지만 Members의 equals를 재정의(Override)해서 true로 나옴

	}

}
