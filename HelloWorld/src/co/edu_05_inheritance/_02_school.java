package co.edu_05_inheritance;
/*
 * 이름 연락처 학교 전공
 */
public class _02_school extends _02_friends {
	
	private String school;
	private String major;
	
	public _02_school(String name, String phone, String school, String major) {
		super(name, phone);
		this.school = school;
		this.major = major;
	}

	@Override
	public String toString() {
		return "학교친구 [이름 : " + getName() + " | 연락처 : " + getPhone() + " | 학교 : " + school + " | 전공 : "
				+ major + "]";
	}

	@Override
	public void showInfo() {
		System.out.printf("학교 [이름 : %s | 번호 : %s | 학교 : %s | 전공 : %s]\n", getName(), getPhone(), school, major);
	}
	
	

}
