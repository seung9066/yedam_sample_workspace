package homework._0727_1;

public class Employee {
	public int sal;
	public	String name;
	
	public Employee() {
		
	}
	
	public Employee(String name, int sal) {
		this.sal = sal;
		this.name = name;
	}
	
	public int getSal() {
		return sal;
	}

	public String getName() {
		return name;
	}

	
	public void getInformation() {
		System.out.println(name + sal);
	}
	
	public void pirnt()	{
		System.out.println("수퍼클래스");
	}
	
}
