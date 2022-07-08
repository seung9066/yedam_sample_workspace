package co.edu_05_inheritance;
/*
 * 1. 등록 2. 목록. 3. 검색 ... 9.종료
 */
public class _02_friends {
	
	private String name;
	private String phone;
	
	// 생성자 : 우클릭 -> source -> constructor
	public _02_friends(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "친구 [이름 : " + name + " | 번호 : " + phone + "]";
	}
	
	public void showInfo() {
		System.out.printf("친구 [이름 : %s | 번호 : %s]\n", name, phone);
	}

	
	

}
