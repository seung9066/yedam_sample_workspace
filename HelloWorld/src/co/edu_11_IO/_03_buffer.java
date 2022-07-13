package co.edu_11_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/* 보조스트림 생성
 * 바이트 기반 -> 문자 기빈 (InputStreamReader, InputStreamWriter)
 * 버퍼스트림(성능향상) : 큰파일 처리 시간 단축
*/
public class _03_buffer {
	public static void main(String[] args) {

		bufferReaderWriter();
	}

	public static void bufferReaderWriter() {
		// 버퍼스트림
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/image.jpg"); // 기본스트림
			BufferedInputStream bis = new BufferedInputStream(fis); // 보조스트림(성능향상)

			FileOutputStream fos = new FileOutputStream("c:/Dev/buffer.jpg");
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			while (true) {

				int bt = bis.read();
				if (bt == -1) {
					break;
				}
				bos.write(bt);
			}
			bos.flush();
			bos.close();
			bis.close();
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}

	public static void streamToReader() {
		InputStream is = System.in; // System.in : 키보드 / 키보드의 입력값을 읽겠음
		InputStreamReader isr = new InputStreamReader(is); // Input~Reader : byte가 아닌 문자
		char[] cbuf = new char[10]; // 10개 읽겠음
		System.out.print("입력 >> ");
		try {
			int b = isr.read(cbuf);
			for (int i = 0; i < b; i++) {
				System.out.print((char) cbuf[i]);
			}
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}

	public static void streamToWriter() { // 호출 하려면 main에서 streamToWriter();
		// 바이트 스트림 -> 문자 스트림
		OutputStream os = System.out; // System.out : 모니터(console)
		OutputStreamWriter osw = new OutputStreamWriter(os);

		Scanner scan = new Scanner(System.in);
		System.out.print("입력 >> ");
		String text = scan.nextLine();

		try {
			osw.write(text + "\n"); // osw.write(String)
			osw.write("실행");
			osw.flush();
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
