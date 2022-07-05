package co.edu_01;

public class _02_boolean_if {
	public static void main(String[] args) {
		
		// boolean
		boolean istrue = false;
		
		int myage = 10;
		int yourage = 11;
		
		istrue = myage > yourage; // false
		if (istrue) {
			System.out.println("나의 나이가 더 많다.");			
		} else {
			System.out.println("나의 나이가 더 적다.");
		}
		
		// if문을 이용한 키 비교
		double myh = 180.1;
		double fh = 178.8;
				
		double difference = 0;
				
		if (myh > fh) {
			difference = myh - fh;
			System.out.println("나의 키가 " + difference + "만큼 더 큽니다.");
		} else {
			difference = fh - myh;
			System.out.println("나의 키가 " + difference + "만큼 더 작습니다.");
		}
				
	}

}
