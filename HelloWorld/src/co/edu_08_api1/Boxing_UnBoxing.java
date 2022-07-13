package co.edu_08_api1;

public class Boxing_UnBoxing {
	public static void main(String[] args) {
		
		// boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		// unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		/*
		 * byte - Byte
		 * char - Character
		 * short - Short
		 * int - Integer
		 * long - Long
		 * float - Float
		 * double - Double
		 * boolean - Boolean
		 */
	}

}