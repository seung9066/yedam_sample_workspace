package co.edu_08_api.prac;
// 대소문자 변환
public class ToLowerCase_toUpperCase {
	public static void main(String[] args) {
		String str1 = "Java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2));
		
		// 소문자로 변환
		String lowerStr1 = str1.toLowerCase();
		System.out.println(lowerStr1);
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
		
		// 대문자로 변환
		String upperStr1 = str1.toUpperCase();
		System.out.println(upperStr1);
		String upperStr2 = str2.toUpperCase();
		System.out.println(upperStr2);
		System.out.println(upperStr1.equals(upperStr2));
		
		// lower이나 upper 과정없이 안에 내용이 같은지 확인
		System.out.println(str1.equalsIgnoreCase(lowerStr2));
	}

}
