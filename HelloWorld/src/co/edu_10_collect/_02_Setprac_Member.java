package co.edu_10_collect;

import java.util.HashSet;
import java.util.Set;

// 중복요소 제거
// Set컬렉션에 중복여부체크 => hashCode, equals가 동일해야 = > true;

class Member {
	private int id;
	private String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() { // 인스턴스마다 가지는 고유한 값
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 아이디, 이름 같으면 논리적으로 동등한 객체
		if (obj instanceof Member) {
			Member mem = (Member) obj; // Member class instance가 맞기에 obj를 불러올 수 있음
			return this.name.equals(mem.name); // && this.id == mem.id
		}
		return false;
	}
	
}

public class _02_Setprac_Member {
	public static void main(String[] args) {
		Set<Member> members = new HashSet<Member>();
		members.add(new Member(10, "홍길동"));
		members.add(new Member(20, "김민수"));
		members.add(new Member(30, "홍길동"));
		members.add(new Member(10, "홍길동")); // 인스턴스가 다르기 때문에 hashCode, equals를 재정의 해야함
		
		// members.clear(); // 모든 요소 제거
		if(members.isEmpty()) {
			System.out.println("컬렉션 요소 비어있음");
		}
		
		for (Member member : members) {
			System.out.println(member.toString());
		}
	}
}
