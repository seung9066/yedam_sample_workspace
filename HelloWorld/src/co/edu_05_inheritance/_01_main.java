package co.edu_05_inheritance;

public class _01_main {

	public static void main(String[] args) {

		_01_dmbcellphone phone = new _01_dmbcellphone();

		phone.setModel("Anycall");
		phone.setColor("white");

		// 부모의 기능
		phone.powerOn();
		phone.bell();
		phone.sendvoice();
		phone.receiveVoice();

		// 자식의 기능
		phone.dmbon();
		phone.dmboff();

		phone.powerOff();

		_01_smartphone sphone = new _01_smartphone();

		phone.setModel("Iphone");
		phone.setColor("spacegray");

		sphone.powerOn();
		sphone.bell();
		sphone.sendvoice();
		sphone.receiveVoice();
		sphone.dmbon();
		sphone.dmboff();
		sphone.powerOff();

		_01_cellphone dphone = new _01_dmbcellphone("galaxy", "red", 100); // 자식을 부모에 담을 수 있음(부모 <= 자식)
		dphone.powerOn();
		System.out.println(dphone.toString());
		// dphone.dmbon(); dphone은 dmb지만 부모(cell)로 담겨있는데 dmbon은 부모가 가진 기능이 아니기에 사용 불가
		_01_dmbcellphone dcp = (_01_dmbcellphone) dphone; // cellphone에 담긴 dphone을 다시 dmbcellphone으로 변경
		dcp.dmbon();
		

		_01_cellphone cphone = new _01_cellphone(); // (부모 <= 부모)
		// _01_dmbcellphone dcp1 = (_01_dmbcellphone) cphone;
		// 부모를 자식으로 바꾸는게 불가능해서 출력시 error발생(큰거에서 작은거로는 형변환 x)
		cphone.bell();
		cphone.setModel("lg");
		cphone.setColor("white");
		System.out.println(cphone.toString());

	}

}
