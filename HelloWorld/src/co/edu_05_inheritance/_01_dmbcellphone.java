package co.edu_05_inheritance;

// _01_cellphone < _01_DmbCellphone

public class _01_dmbcellphone extends _01_cellphone {

	private int channel;

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public _01_dmbcellphone() {
		super(); // 부모를 호출하겠다. (public _01_cellphone() { })
	}

	public _01_dmbcellphone(String model, String color, int channel) {
		super(model, color); // 부모 클래스로 넘어감
		// super.model = model; 불가. 부모에서 'private' String model;로 되어있기 때문
		this.channel = channel;
	}

	public void dmbon() {
		System.out.println("dmb on");
	}

	public void dmboff() {
		System.out.println("dmb off");
	}

	// overriding(재정의) : 우클릭 -> source -> override
	@Override // 부모의 기능을 받아서 재정의
	public void bell() {
		// super bell; 지움
		System.out.println("벨이 울립니다.");
	}

	@Override
	public String toString() {
		return "model명은 " + getModel() + ", 색상은 " + getColor() + "채널은 " + channel + "입니다."; // private 이라서 get으로 가져옴
	}
	
	
	
}
