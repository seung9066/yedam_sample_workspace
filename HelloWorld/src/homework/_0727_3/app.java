package homework._0727_3;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("영화");
		
		Culture M = new Movie(scan.next(), scan.nextInt(), scan.nextInt(), scan.next());
		M.countw = scan.nextInt();
		for (int i = 0; i < M.countw; i++) {
			M.setTotalScore(scan.nextInt());
		}
		
		System.out.println("공연");
		
		Culture P = new Performance(scan.next(), scan.nextInt(), scan.nextInt(), scan.next());
		P.countw = scan.nextInt();
		for (int i = 0; i < P.countw; i++) {
			P.setTotalScore(scan.nextInt());
		}
		
		M.getInformation();
		System.out.println("======================");
		P.getInformation();
	}

}
