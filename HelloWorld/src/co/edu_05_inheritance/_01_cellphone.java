package co.edu_05_inheritance;

/*
 * 상속 (부모 > 자식)
 * Cellphone < DmbCellphone
 */

public class _01_cellphone {
	
	// field
	private String model;
	private String color;
	
	// constructor
	public _01_cellphone() {
		
	}
	
	public _01_cellphone(String mode, String color) {
		
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

}
