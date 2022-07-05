package co.edu_01;

import java.io.IOException;

// 키보드 입력값 코드 or 값을 메소드 (enter값 때문에 한번에 3개(숫자 입력시) 나오는거)
public class _05_while_IOEread {
	public static void main(String[] args) {
		
		System.out.println("값을 입력하세요.");
		boolean run = true;
		while (run) {
			int result = 0; // result가 try 안에만 있으면 run = result != 48; = error이기에 while문에 result 변수를 지정
			// System.in.read(); (IOE)입출력을 요구하는 코드는 그냥 있어도 에러를 일으킨다. 따라서 마우스 올리고 surround 클릭
		try {
			result = System.in.read();
			System.out.printf("입력값은 %d 입니다.", result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		run = result != 48;
		}
		System.out.println("end of prog");
	}

}
