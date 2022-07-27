package homework._0727_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StandardWeightInfo s = new StandardWeightInfo();
		System.out.print("이름 >> ");
		s.name = scan.next();
		System.out.print("키 >> ");
		s.height = scan.nextInt();
		System.out.print("몸무게 >> ");
		s.weight = scan.nextInt();
		ObesityInfo h = new ObesityInfo();
		System.out.println();
		System.out.print("이름 >> ");
		h.name = scan.next();
		System.out.print("키 >> ");
		h.height = scan.nextInt();
		System.out.print("몸무게 >> ");
		h.weight = scan.nextInt();
		s.getInformation();
		System.out.println();
		h.getInformation();
		
	}

}
