package co.edu_05_inheritance;

/*
 * 상속
 * 기능적 : 부모 < 자식
 * _01_cellphone dphone = new _01_dmbcellphone(); : 자식 클래스를 부모의 변수에 대입 가능. 대신 자식이 가진 기능 사용 불가 ex) .dmbon(); = error
 * 공통 기능의 경우 부모만 바꿔주면 자식까지 다 바꿔줄 수 있음
 */

public class _01_cellphone { //extends Object 모든 클래스는 기본적으로 Object클래스를 상속 받는다.
	
	// field
	private String model;
	private String color;
	
	// constructor
	public _01_cellphone() {

	}
	
	public _01_cellphone(String model, String color) {
		
	}
	
	public void powerOn() {
		System.out.println("전원 on");
	}
	
	public void powerOff() {
		System.out.println("전원 off");
	}
	
	public void bell() {
		System.out.println("bell");
	}
	
	public void sendvoice() {
		System.out.println("메세지 전송");
	}
	
	public void receiveVoice() {
		System.out.println("메세지 수신");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// 재정의
	@Override
	public String toString() { // Object 메소드에서 상속
		return "model명은 " + model + ", 색상은 " + color + "입니다.";
	}
	

}
