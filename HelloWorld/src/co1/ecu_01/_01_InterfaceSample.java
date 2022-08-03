package co1.ecu_01;

public interface _01_InterfaceSample {

	// interface는 스스로 객체를 만들지 못함, implement를 통해 인터페이스를 상속 받아 사용
	
	// 상수필드
	public static final double PI = 3.14;
	// static = 모든 메모리 영역에 접근 가능 -> 객체를 만들지 않아도 사용 가능
	// static은 프로그램을 시작하면 메모리에 항상 앉아있기에 최대한 사용하지 않는게 좋음
	
	public void test();
	public int service();
}
