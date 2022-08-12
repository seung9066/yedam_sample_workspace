package workout;

import java.util.List;
import java.util.Scanner;

import account.AccountService;

public class WorkoutService {
	Scanner sc = new Scanner(System.in);

	// 글 작성
	public void insertContent() {
		Workout workout = new Workout();

		System.out.print("점수(1~5점) >> ");
		try {
			int point = Integer.parseInt(sc.nextLine());
			if (point > 5) {
				System.out.println("점수는 1 ~ 5점 사이로 적으십시오");
				System.out.print("점수 >> ");
				point = Integer.parseInt(sc.nextLine());
			} else if (point < 1) {
				System.out.println("점수는 1 ~ 5점 사이로 적으십시오");
				System.out.print("점수 >> ");
				point = Integer.parseInt(sc.nextLine());
			}
			workout.setPoint(point);
		} catch (Exception e) {
			System.out.println("점수는 1 ~ 5점 사이로 적으십시오");
			System.out.print("점수 >> ");
			int point = Integer.parseInt(sc.nextLine());
		}

		System.out.print("종목 >> ");
		String sports = sc.nextLine();
		if (sports.equals("")) {
			System.out.println("종목을 입력하세요");
			System.out.print("종목 >> ");
			sports = sc.nextLine();
		}
		workout.setSports(sports);
		
		System.out.print("메모 >> ");
		String memo = sc.nextLine();
		workout.setMemo(memo);

		int result = WorkoutDAO.getInstance().insertContent(workout);

		if (result == 1) {
			System.out.println("작성 완료");
		} else {
			System.out.println("작성 실패");
		}
	}

	// 수정
	public void edit() {
		System.out.println("오늘 날짜 게시글만 수정 가능합니다");
		
		System.out.print("종목 >> ");
		String sports = sc.nextLine();

		System.out.print("메모 >> ");
		String memo = sc.nextLine();

		WorkoutDAO.getInstance().edit(sports, memo);

	}

	// 삭제
	public void delete() {
		List<Workout> list = WorkoutDAO.getInstance().findme();
		System.out.println(AccountService.accountinfo.getName() + " 님이 작성한 날짜");
		for (Workout workout : list) {
			System.out.print(workout.getDate_() + " | ");
		}
		System.out.println();

		System.out.print("삭제할 날짜 입력 >> ");
		String date = sc.nextLine();

		int result = WorkoutDAO.getInstance().delete(date);

		if (result == 1) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("삭제 실패");
		}
	}

	// 조회
	public void find() {
		List<Workout> list = WorkoutDAO.getInstance().find();
		for (Workout workout : list) {
			System.out.println("날짜 : " + workout.getDate_() + " | 이름 : " + workout.getName() + " | 점수 : "
					+ workout.getPoint() + " | 종목 : " + workout.getSports() + " | 메모 : " + workout.getMemo());
		}
	}

}
