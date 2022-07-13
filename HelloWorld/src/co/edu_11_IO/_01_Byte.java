package co.edu_11_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _01_Byte {
	public static void main(String[] args) {
		long start = System.nanoTime();
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/image.jpg"); // 이미지를 가져와서
			FileOutputStream fos = new FileOutputStream("c:/Dev/image1.jpg"); // 이미지를 만든다
			byte[] buff = new byte[100]; // 이미지 파일은 커서 한번에 100씩 가져오기 위해
			
			while(true) {
				int buf = fis.read(buff);
				if(buf == -1) {
					break;
				}
				
				fos.write(buff);
			}
			fos.flush();
			fos.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		System.out.println("처리시간: " + (end - start) + " 나노타임");
	}

	public static void read2() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data1.dat");
			byte[] arr = new byte[2];
			while (true) {
				int buf = fis.read(arr); // 10, 20, 30 을 2byte씩 읽는다.
				if (buf == -1) {
					break;
				}
				for (int i = 0; i < buf; i++) {
					System.out.print(arr[i]);
				}
				System.out.println();
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
	}

	public static void write2() {
		byte[] arr = { 10, 20, 30 };
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data1.dat");
			fos.write(arr);
			fos.flush();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
	}

	public static void read1() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data1.dat");

			while (true) {
				int buf = fis.read();
				if (buf == -1) {
					break;
				}
				System.out.println(buf);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");

	}

	// byte 기반 출력 스트림
	public static void write1() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data.dat");
			byte a = 10, b = 20, c = 30;

			fos.write(a);
			fos.write(b);
			fos.write(c);

			fos.flush();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("실행.");
	}
}

