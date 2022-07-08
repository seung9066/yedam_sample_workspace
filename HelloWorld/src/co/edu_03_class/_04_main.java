package co.edu_03_class;

import java.util.Date;
import java.util.Scanner;

public class _04_main {

	public static void main(String[] args) {

		_04_noticeboard[] boards = new _04_noticeboard[100];
		_04_noticeboard[] signup = new _04_noticeboard[100];
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		boolean run1 = true;

		while (run1) {
			System.out.println("로그인 (1) | 회원가입 (2)");
			int c = scan.nextInt();
			if (c == 1) {
				System.out.print("ID : ");
				String a = scan.next();

				System.out.print("Password : ");
				String b = scan.next();
				for (int i = 0; i < signup.length; i++) {
					if (signup[i] != null && signup[i].getId().equals(a) && signup[i].getPassword().equals(b)) {
						System.out.println("로그인 완료");
						run1 = false;
					} else {
						if (i == boards.length - 1)
						System.out.println("아이디 비번을 확인하세요.");
						
					}
				}
			}
			if (c == 2) {
				_04_noticeboard sign = new _04_noticeboard();

				System.out.print("ID : ");
				String d = scan.next();

				System.out.print("Password : ");
				String e = scan.next();

				sign.setId(d);
				sign.setPassword(e);

				for (int i = 0; i < signup.length; i++) {
					if (signup[i] == null) { // 위치가 비어있으면
						signup[i] = sign; // 그 위치에 한건 저장한다.
						break;
					}
				}
				System.out.println("저장 완료");

			} else if (c > 2) {
				System.out.println("잘못된 접근입니다.");
			}
		}
		while (run) {
			System.out.println("1. 등록 | 2. 조회 | 3. 수정 | 4. 삭제 | 5. 리스트 | 6. 종료");
			System.out.print("선택 >> ");

			int selectno = Integer.parseInt(scan.next());

			if (selectno == 1) {
				System.out.print("제목 : ");
				String title = scan.next();

				System.out.print("내용 : ");
				String content = scan.next();

				System.out.print("작성자 : ");
				String writer = scan.next();

				_04_noticeboard board = new _04_noticeboard();
				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				board.setDate(new Date());
				board.setCount(0);

				// 배열의 비어있는 위치에 저장
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] == null) { // 위치가 비어있으면
						boards[i] = board; // 그 위치에 한건 저장한다.
						break;
					}
				}
				System.out.println("저장 완료");

			} else if (selectno == 2) {
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) {
						System.out.print("제목 : " + boards[i].getTitle());
						System.out.println();
						System.out.print("조회할 제목을 입력하세요 >> ");
						break;
					} else {
						System.out.println("조회할 내용이 없습니다.");
						break;
					}
				}

				String findtitle = scan.next();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findtitle)) {
						System.out.printf("제목 : %s\n내용 : %s\n작정자 : %s\n작성일시 : %s\n조회수 : %d\n", boards[i].getTitle(),
								boards[i].getContent(), boards[i].getWriter(), boards[i].getDate(),
								boards[i].getCount());

						// 카운트 증가
						int cnt = boards[i].getCount();
						boards[i].setCount(++cnt);
					}

				}

			} else if (selectno == 3) {
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) {
						System.out.print("제목 : " + boards[i].getTitle());
						System.out.println();
					}
				}
				System.out.print("수정할 제목을 입력하세요 >> ");
				String findtitle = scan.next();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findtitle)) {
						System.out.print("제목 : ");
						String title = scan.next();

						System.out.print("내용 : ");
						String content = scan.next();

						boards[i].setTitle(title);
						boards[i].setContent(content);

					}
				}
				System.out.println("수정 완료");
			} else if (selectno == 4) {
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) {
						System.out.print("제목 : " + boards[i].getTitle());
						System.out.println();
					}
				}
				System.out.print("삭제할 제목을 입력하세요 >> ");
				String findtitle = scan.next();
				System.out.println("글을 삭제하겠습니까? y / n");
				String y = scan.next();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null && boards[i].getTitle().equals(findtitle)) {
						if (y.equals("y")) {
							boards[i] = null;
							System.out.println("삭제되었습니다.");
						} else {
							System.out.println("삭제되지 않았습니다.");
						}
					}
				}

			} else if (selectno == 5) {
				System.out.println("===========글 목록===========");
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] != null) {
						System.out.printf("제목 : %s\n내용 : %s\n작정자 : %s\n작성일시 : %s\n조회수 : %d\n", boards[i].getTitle(),
								boards[i].getContent(), boards[i].getWriter(), boards[i].getDate(),
								boards[i].getCount());
					}
				}

			} else if (selectno == 6) {
				System.out.println("프로그램을 종료합니다.....");
				run = false;
			} else if (selectno > 6) {
				System.out.println("잘못된 번호 입력");
			}

		}
		System.out.println("프로그램 종료");
	}

}
