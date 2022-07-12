package co.edu_10_collect.prac;

import java.util.ArrayList;
import java.util.List;

// 데이터 입출력

public class BoardDAO {

	// 싱글톤
	private static BoardDAO instance = new BoardDAO();

	List<Board> list; // List 클래스 Board 타입 list 필드

	private BoardDAO() {
		list = new ArrayList<>();
	}

	public static BoardDAO getInstance() {
		return instance;
	}

	// 1. 목록
	public List<Board> boardList() {
		return list;
	}

	// 2. 등록
	public void add(Board board) {
		list.add(board);
	}

	// 3. 조회(작성자)
	public List<Board> search(String writer) {
		List<Board> list = new ArrayList<>(); // list = 변수 / 찾고자 하는 이름

		for (Board board : this.list) { // list = 필드 / 필드에 저장된 애들을 하나씩 읽어보는 과정
			if (board.getWriter().equals(writer)) {
				list.add(board); // 같은 작성자를 담아준다.
			}
		}
		return list;
	}

	// 4. 삭제(제목)
	public void remove(String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
				break;
			}
		}
	}
}
