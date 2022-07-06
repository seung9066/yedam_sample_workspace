package co.edu_03;

class member {
	
	String name;
	String tel;
	String address;
	String email;
	int age;
	
}

public class _01_class1 {
	public static void main(String[] args) {
		
		member s1 = new member();
		s1.name = "김";
		s1.tel = "010-123-1234";
		s1.address = "대구 수성구 동대구로95";
		s1.email = "abcd@naver.com";
		s1.age = 20;
		
		System.out.println(s1.name);
		
	}
}
