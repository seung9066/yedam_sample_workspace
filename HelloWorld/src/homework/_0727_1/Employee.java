package homework._0727_1;

public class Employee {
	protected int sal;
	protected String name;
	
	// 오버로딩 = 같은 생성자여도 다른 매개변수를 가지면 오류가 나지 않음
	public Employee() {
		
	}
	
	public Employee(String name, int sal) { // int sal, String name 처럼 매개변수 순서만 바꿔숴 생성자 하나 더 만들어도 오류 안남
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
