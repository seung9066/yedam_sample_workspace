package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MemberApp implements MemberService {

	List<Member> members = new ArrayList<Member>();
	Scanner scan = new Scanner(System.in);

	private static MemberApp instance = new MemberApp();

	public static MemberApp getInstance() {
		return instance;
	}

	public static void setInstance(MemberApp instance) {
		MemberApp.instance = instance;
	}

	public void execute() {
		// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
		// 1)도서반=>기본정보+도서반장,강의실이름
		// 축구반=>기본정보+코치이름,락커룸이름
		// 수영반=>기본정보+강사이름,수영등급
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1.등록 | 2.수정 | 3.전체리스트 | 9.종료");
			System.out.print("선택 >> ");
			int selectno = Integer.parseInt(scan.nextLine());
			if (selectno == 1) {
				while (true) {
					System.out.println("1. book | 2. soccer | 3. swim");
					System.out.print("선택 >> ");
					int select = Integer.parseInt(scan.nextLine());
					if (select == 1) {
						System.out.print("회원아이디 : ");
						int id = Integer.parseInt(scan.nextLine());
						System.out.print("회원이름 : ");
						String name = scan.nextLine();
						System.out.print("회원번호 : ");
						String phone = scan.nextLine();
						System.out.print("반장이름 : ");
						String bookname = scan.nextLine();
						System.out.print("강의실 : ");
						String bookclass = scan.nextLine();
						Member member = new BookMember(id, name, phone, bookname, bookclass);
						addMember(member);
						break;
					} else if (select == 2) {
						System.out.print("회원아이디 : ");
						int id = Integer.parseInt(scan.nextLine());
						System.out.print("회원이름 : ");
						String name = scan.nextLine();
						System.out.print("회원번호 : ");
						String phone = scan.nextLine();
						System.out.print("코치이름 : ");
						String soccername = scan.nextLine();
						System.out.print("락커룸 : ");
						String soccerclass = scan.nextLine();
						Member member = new SoccerMember(id, name, phone, soccername, soccerclass);
						addMember(member);
						break;
					} else if (select == 3) {
						System.out.print("회원아이디 : ");
						int id = Integer.parseInt(scan.nextLine());
						System.out.print("회원이름 : ");
						String name = scan.nextLine();
						System.out.print("회원번호 : ");
						String phone = scan.nextLine();
						System.out.print("강사이름 : ");
						String tname = scan.nextLine();
						System.out.print("등급 : ");
						String sclass = scan.nextLine();
						Member member = new SwimMember(id, name, phone, tname, sclass);
						addMember(member);
						break;
					}
				}

			} else if (selectno == 2) {
				System.out.print("수정할 Id : ");
				int search = Integer.parseInt(scan.nextLine());
				Member member = new Member();
				for (Member mem : members) {
					if (mem.getMemberId() == search) {
						member = mem;
						modifyMember(member);
					}
				}
			} else if (selectno == 3) {
				for (int i =0; i < members.size(); i++) {
					System.out.println(members.get(i).toString());
				}
			} else if (selectno == 9) {
				System.out.println("프로그램 종료 중....");
				break;
			}
		}
		System.out.println("종료");
	}

	// 등록
	@Override
	public void addMember(Member member) {
		members.add(member);
	}

	// 수정
	@Override
	public void modifyMember(Member member) {
		System.out.print("수정할 전화번호 : ");
		String phone = scan.nextLine();
		member.setPhone(phone);
		/*
		 * for (int i = 0; i < members.size(); i++) {
		 * 	if (member.getMemberId() == members.get(i).getMemberId()) {
		 * 		members.get(i).setPhone(member.getPhone());
		 */
	}

	// 전체리스트
	@Override
	public List<Member> memberList() {
		return members;
	}
}
