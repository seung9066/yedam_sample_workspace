package homework._0727_1;

public class EmpDept extends Employee{
	public String depn;
	
	public EmpDept() {
		
	}
	
	public EmpDept(String name, int sal, String depn) {
		super.name = name;
		super.sal = sal;
		this.depn = depn;
	}
	public String getDepn() {
		return depn;
	}

	@Override
	public void getInformation() {
		System.out.println("이름 : " + getName() + "\n연봉 : " + getSal() + "\n부서 : " + depn);
	}

	@Override
	public void pirnt() {
		System.out.println("수퍼클래스\n서브클래스");
	}

	
	
}
