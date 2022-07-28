package homework._0727_2;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Human s = new StandardWeightInfo("홍길동", 168, 45);
		s.getInformation();
		System.out.println();
		s = new ObesityInfo("박둘이", 168, 90);
		s.getInformation();
		
	}

}
