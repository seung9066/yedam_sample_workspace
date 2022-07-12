package co.edu_10_collect.prac;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import co.edu_06_interfaces.employee.Employeearraylist;

// 1. 목록 2. 등록 3. 조회(작성자) 4. 삭제 5. 종료

public class BoardApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BoardDAO app = BoardDAO.getInstance();

		while (true) {
			System.out.println("1. 목록 | 2. 등록 | 3. 조회(작성자) | 4. 삭제 | 5. 종료");
			System.out.print("입력 >> ");
			int selectno = Integer.parseInt(scan.nextLine());
			if (selectno == 1) {
				for (int i = 0; i < app.list.size(); i++) {
					System.out.println("제목 : " + app.boardList().get(i).getTitle() + " | 작성자 : "
							+ app.boardList().get(i).getWriter() + " | 내용 : " + app.boardList().get(i).getContent());
				}
			} else if (selectno == 2) {
				System.out.print("제목 >> ");
				String title = scan.nextLine();
				System.out.print("작성자 >> ");
				String writer = scan.nextLine();
				System.out.print("내용 >> ");
				String content = scan.nextLine();
				app.add(new Board(title, writer, content));
			} else if (selectno == 3) {
				System.out.print("작성자 입력 >> ");
				String writer = scan.nextLine();
				List<Board> list = app.search(writer);
				for (Board board : list) { // Board 클래스 board 변수명 list 배열 또는 컬렉션(반복대상) -> 배열(컬렉션)에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀져 변수에 저장
					System.out.println("제목 : " + board.getTitle() + " | 작성자 : " + board.getWriter() + " | 내용 : " + board.getContent());
				}
//				System.out.println("제목 : " + app.search(writer).get(0).getTitle() + " | 작성자 : "
//						+ app.search(writer).get(0).getWriter() + " | 내용 : " + app.search(writer).get(0).getContent());
			} else if (selectno == 4) {
				System.out.print("삭제할 제목 입력 >> ");
				String title = scan.nextLine();
				app.remove(title);
				System.out.println("삭제 완료");
			} else if (selectno == 5) {
				System.out.println("프로그램 종료...");
				break;
			} else if (selectno > 5) {
				System.out.println("잘못된 입력");
			}
		}
	}
}
