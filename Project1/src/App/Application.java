package App;

import java.util.Scanner;

import account.Account;
import account.AccountService;
import workout.WorkoutService;

public class Application {
	Scanner sc = new Scanner(System.in);

	AccountService as = new AccountService();
	WorkoutService ws = new WorkoutService();

	public Application() {
		start();
	}

	int selectno = 0;
	int selectno1 = 0;

	private void start() {
		boolean run = true;
		while (run) {
			System.out.println("1. 로그인 | 2. 회원가입 | 3. 탈퇴 | 9. 종료");
			selectno = Integer.parseInt(sc.nextLine());
			switch (selectno) {
			case 1:
				as.login();
				if (AccountService.accountinfo != null) {
					selectno1 = 0;
					while (selectno1 != 9) {
						System.out.println("1. 글작성 | 2. 수정 | 3. 조회 | 4. 삭제 | 9. 로그아웃");
						selectno1 = Integer.parseInt(sc.nextLine());
						switch (selectno1) {
						case 1:
							ws.insertContent();
							break;
						case 2:
							ws.edit();
							break;
						case 3:
							ws.find();
							break;
						case 4:
							ws.delete();
							break;
						case 9:
							as.logout();
							break;
						}
					}
				}
				break;
			case 2:
				as.createAccount();
				break;
			case 3:
				as.deleteAccount();
				break;
			case 9:
				System.out.println("종료...");
				run = false;

			}
		}
		System.out.println("종료되었습니다.");
	}
}
