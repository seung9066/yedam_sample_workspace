package co.edu_10_collect_generic;

public class BoxT<T> { // <대문자알파벳 하나> = generic : Box클래스의 필드타입을 사용하는 시점에 정하도록 한다.
	private T obj1;
	
	public void set(T obj1) {
		this.obj1 = obj1;
	}
	
	public T get() {
		return obj1;
	}
	
}
