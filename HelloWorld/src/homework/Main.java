package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = Integer.toString(scan.nextInt());
		String B = Integer.toString(scan.nextInt());

		int[] arrA = new int[A.length()];
		int[] arrAa = new int[arrA.length];
		int[] arrB = new int[B.length()];
		int[] arrBb = new int[arrB.length];

		for (int i = 0; i < A.length(); i++) {
			arrA[i] = A.charAt(i) - '0';
		}

		for (int i = 0; i < B.length(); i++) {
			arrB[i] = B.charAt(i) - '0';
		}

		boolean run = true;
		while (run) {
			for (int j = arrA.length - 1; j >= 0; j--) {
				for (int i = 0; i < arrA.length; i++) {
					if (arrAa[i] == 0) {
						arrAa[i] = arrA[j];
						break;
					}
				}
			}
			run = false;
		}
		
		run = true;
		
		while (run) {
			for (int j = arrB.length - 1; j >= 0; j--) {
				for (int i = 0; i < arrB.length; i++) {
					if (arrBb[i] == 0) {
						arrBb[i] = arrB[j];
						break;
					}
				}
			}
			run = false;
		}

		String Aaa = "";
		String Bbb = "";

		for (int i = 0; i < arrAa.length; i++) {
			Aaa += arrAa[i];
		}

		for (int i = 0; i < arrBb.length; i++) {
			Bbb += arrBb[i];
		}

		int Aaaa = Integer.parseInt(Aaa);
		int Bbbb = Integer.parseInt(Bbb);
		System.out.println(Bbbb);

		if (Aaaa > Bbbb) {
			System.out.println(Aaaa);
		}

		if (Bbbb > Aaaa) {
			System.out.println(Bbbb);
		}

	}
}