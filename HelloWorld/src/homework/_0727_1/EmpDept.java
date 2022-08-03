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
		System.out.println("이름 : " + name + "\n연봉 : " + sal + "\n부서 : " + depn);
	}

	@Override
	public void pirnt() {
		super.pirnt();
		System.out.println("서브클래스");
	}

	
	
}
