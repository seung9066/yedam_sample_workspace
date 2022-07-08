package co.edu_04_static;

public class _01_singleton {

	// singleton : 인스턴스를 여러개 못 만들게 하기 위함
	private static _01_singleton instance = new _01_singleton();

	private _01_singleton() {

	}

	public static _01_singleton getinstance() {
		return instance;
	}

}
