package co.edu_05_inheritance;


// _01_cellphone < _01_DmbCellphone

public class _01_dmbcellphone extends _01_cellphone{
	
	private int channel;
	
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
	
}
