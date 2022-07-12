package co.edu_10_collect_generic;

public class BoxTExample {
	public static void main(String[] args) {

		BoxT<String> strbox = new BoxT<String>();
		strbox.set("문자열");
		String result = strbox.get();
		System.out.println(result);
		
		BoxT<Integer> intBox = new BoxT<Integer>();
		intBox.set(100);
		int result1 = intBox.get();
		System.out.println(result1);
	}
}
