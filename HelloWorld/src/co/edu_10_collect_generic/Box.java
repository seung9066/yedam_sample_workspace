package co.edu_10_collect_generic;

public class Box { // Box클래스의 필드타입을 사용하는 시점에 정하도록 한다.
	private Object obj; // Object는 최상위이기 때문에 어떤 타입이든 받을 수 있음
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return obj;
	}
	
}
