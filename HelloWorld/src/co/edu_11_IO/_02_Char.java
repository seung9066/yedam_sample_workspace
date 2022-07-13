package co.edu_11_IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class _02_Char {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:/Dev/test.txt");
			char[] cbuf = new char[10]; // 10개씩 읽기
			int buf1 = 0;
			while ((buf1 = fr.read(cbuf)) != -1) { // cbuf가 읽어오는 값이 없을 때 까지
				for (int i = 0; i <buf1; i++) {
					System.out.print(cbuf[i]); // 읽어들인 buf1의 크기만큼 반복하여 출력
				}
				System.out.println();
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}

	public static void reader1() {
		try {
			FileReader fr = new FileReader("c:/Dev/test.txt");
			while (true) {
				int buf = fr.read(); // 2byte씩(한문자씩) 읽어서 -> 정수타입으로 return
				if (buf == -1) {
					break;
				}
				System.out.print((char) buf);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}

	public static void writer1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		String txt = "";

		try {
			FileWriter fw = new FileWriter("C:/Dev/test.txt");
			while (true) {
				try {
					txt = scan.nextLine();
				} catch (NoSuchElementException e) {
					break;
				}
				fw.write(txt + "\n"); // 메모장 안에서 줄 바꿔주기 위해
			}
			fw.flush();
			fw.close(); // enter + ctrl + z로 완료

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");

	}
}
