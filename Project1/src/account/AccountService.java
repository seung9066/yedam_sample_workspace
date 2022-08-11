package account;

import java.util.Scanner;

public class AccountService {
	Scanner sc = new Scanner(System.in);

	public static Account accountinfo = null;

	// 회원가임
	public void createAccount() {
		Account account = new Account();

		System.out.print("아이디 >> ");
		String id = sc.nextLine();
		account.setId(id);

		System.out.print("이름 >> ");
		String name = sc.nextLine();
		account.setName(name);

		System.out.print("비밀번호 >> ");
		String pw = sc.nextLine();
		account.setPw(pw);

		System.out.print("비밀번호 확인 >> ");
		String pw1 = sc.nextLine();

		String idcheck = AccountDAO.getInstance().compare(id);
		if (id.equals(idcheck)) {
			System.out.println("중복된 아이디 입니다");
		} else {
			if (!pw.equals(pw1)) {
				System.out.println("비밀번호가 일치하지 않습니다");
			} else {
				int result = AccountDAO.getInstance().createAccount(account);
				if (result == 1) {
					System.out.println("회원가입 완료");
				} else {
					System.out.println("회원가입 실패");
				}
			}
		}
	}

	// 로그인
	public void login() {
		Account account = new Account();
		System.out.print("아이디 >> ");
		String id = sc.nextLine();

		System.out.print("비밀번호 >> ");
		String pw = sc.nextLine();

		account = AccountDAO.getInstance().login(id);
		if (account != null) {
			if (account.getPw().equals(pw)) {
				accountinfo = account;
			} else {
				System.out.println("로그인 실패");
			}
		} else {
			
		}
	}

	// 로그아웃
	public void logout() {
		if (accountinfo != null)
			accountinfo = null;
	}

	// 탈퇴
	public void deleteAccount() {
		Account account = new Account();
		System.out.print("삭제할 아이디 >>");
		String id = sc.nextLine();
		account.setId(id);

		System.out.print("비밀번호 >> ");
		String pw = sc.nextLine();
		account.setPw(pw);

		System.out.print("비밀번호 확인 >> ");
		String pw1 = sc.nextLine();

		int result1 = AccountDAO.getInstance().logincheck(account);

		if (!pw.equals(pw1)) {
			System.out.println("비밀번호가 일치하지 않습니다");
		} else {
			if (result1 == 1) {
				int result = AccountDAO.getInstance().deleteAccount(account);
				if (result == 1) {
					System.out.println("삭제 완료");
				} else {
					System.out.println("잘못된 정보입니다");
				}
			} else {
				System.out.println("존재하지 않는 회원입니다");
			}
		}
	}
}
