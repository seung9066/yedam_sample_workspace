package co.edu_06_interfaces;

public class _01_FlyMain {
	public static void main(String[] args) {
		
		_01_Flyer flier = new _01_Helicopter(); // Flyer < Helicopter
		flier.takeoff();
		flier.fly();
		flier.land();
		
		flier = new _01_Airplane(); // Flyer < Airplane (Helicopter -> Airplane)
		flier.takeoff();
		flier.fly();
		flier.land();
	}

}
