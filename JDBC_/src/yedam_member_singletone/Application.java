package yedam_member_singletone;

import java.util.List;
import java.util.Scanner;

public class Application {

	Scanner sc = new Scanner(System.in);

	public Application() {
		run();
	}

	private void run() {
		int menuNo = 0;
		while (menuNo != 9) {
			System.out.println("1. 전체 조회 | 2. 단건 조회 | 3. 회원 입력 | 4. 회원 수정 | 5. 회원 삭제 | 9. 종료");
			System.out.print("입력 >> ");
			menuNo = Integer.parseInt(sc.nextLine());
			switch (menuNo) {
			case 1:
				// MemberManagement mm = new MembetManagement().getMemberList();
				List<Member> list = MemberManagement.getInstance().getMemberList();
				if (list.size() == 0) {
					System.out.println("조회된 데이터가 없습니다.");
				} else {
					for (Member member : list) {
						System.out.println(member.toString());
					}
				}
				break;
			case 2:
				System.out.print("조회할 ID 입력 >> ");
				String id = sc.nextLine();
				Member member = MemberManagement.getInstance().getMember(id);
				if (member == null) { // 정상적으로 데이터가 들어가 있지 않았을 상황 대비
					System.out.println("등록되지 않은 ID 입니다.");
				} else {
					System.out.println(member.toString());
				}
				break;
			case 3:
				Member member1 = new Member();
				System.out.println("**** 회원 등록 ****");

				System.out.print("ID >> ");
				String str = sc.nextLine();
				member1.setId(str);

				System.out.print("PW >> ");
				String pw = sc.nextLine();
				member1.setPw(pw);

				System.out.print("이름 >> ");
				String name = sc.nextLine();
				member1.setName(name);
				int result = MemberManagement.getInstance().insertMember(member1);
				if (result == 1) {
					System.out.println("입력 완료");
				} else {
					System.out.println("입력 실패");
				}
				break;
			case 4:
				Member member2 = new Member();
				System.out.print("수정할 회원 ID >> ");
				String id1 = sc.nextLine();
				member2.setId(id1);

				System.out.print("새로운 PW >> ");
				String pw1 = sc.nextLine();
				member2.setPw(pw1);

				int result1 = MemberManagement.getInstance().updateMember(member2);
				if (result1 == 1) {
					System.out.println("수정 완료");
				} else {
					System.out.println("수정 실패");
				}
				break;
			case 5:
				System.out.print("삭제할 ID >> ");
				String id2 = sc.nextLine();
				int result2 = MemberManagement.getInstance().deleteMember(id2);
				if (result2 == 1) {
					System.out.println("삭제 완료");
				} else {
					System.out.println("삭제 실패");
				}
				break;
			}
		}
		System.out.println("종료");
	}
}
