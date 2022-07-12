package co.edu_10_collect_generic;

public class BoxExample {
	public static void main(String[] args) {
		Box strBox = new Box();
		strBox.set(new String("문자열")); // 저장할 때는 매개값이 Object타입이기에 어떤 타입이든 매개변수로 받을 수 있음
		String result = (String) strBox.get(); // 가져올 때는 Object 타입을 String 타입으로 casting(변환)
		System.out.println(result);
		
		Box intBox = new Box();
		intBox.set(new Integer(100));
		Integer result1 = (Integer) intBox.get();
		System.out.println(result1);
		
	}
}
