package co.edu_06_interfaces;
/* implements
 * Flyer 인터페이스를 구현하는 클래스를 만들겠다.
 * Airplane 마우스 올려서 add unimplemented
 */
public class _01_Airplane implements _01_Flyer {

	@Override
	public void takeoff() {
		System.out.println("비행기가 이륙합니다.");
	}

	@Override
	public void fly() {
		System.out.println("비행기가 비행합니다.");
	}

	@Override
	public void land() {
		System.out.println("비행기가 착륙합니다.");
	}

}
