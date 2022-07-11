package co.edu_08_api1;
// 문자열 짜르기
public class Substring {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		String thirdNum = ssn.substring(4);
		System.out.println(thirdNum);
	}
}
