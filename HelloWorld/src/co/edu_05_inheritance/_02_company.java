package co.edu_05_inheritance;
/*
 * 이름 연락처 회사 직무
 */
public class _02_company extends _02_friends {
	
	private String company;
	private String department;
	
	public _02_company(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}

	@Override
	public String toString() {
		return "회사친구 [이름 : " + getName() + " | 번호 : " + getPhone() + " | 회사 : " + company
				+ " | 부서 : " + department + "]";
	}
	
	@Override
	public void showInfo() {
		System.out.printf("회사 [이름 : %s | 번호 : %s | 회사 : %s | 부서 : %s]\n", getName(), getPhone(), company, department);
	}
	
}
