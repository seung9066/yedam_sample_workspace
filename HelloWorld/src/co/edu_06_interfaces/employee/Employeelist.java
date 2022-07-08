package co.edu_06_interfaces.employee;
/*
 * 기능 정의(선언)부분만 있음 : 추상 메소드만 있음
 */
public interface Employeelist {
	
	// 배열 초기화
	public void init();
	
	// 사원 정보 입력
	public void input();
	
	// 사번에 해당하는 정보 조회
	public Employee search(int empId);
	
	// 전체 출력
	public void printList();
	
}
