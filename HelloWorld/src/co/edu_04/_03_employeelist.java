package co.edu_04;

import java.util.Calendar;
import java.util.Scanner;

public class _03_employeelist {
	
	Calendar cal = Calendar.getInstance();
	// 싱클톤
	private static _03_employeelist instance = new _03_employeelist();

	private _03_employeelist() {
	}

	public static _03_employeelist getInstance() {
		return instance;
	}
	
	// 배열, 필드
	_03_employee[] list; // 사원 배열
	int empnum; // 몇번 째 사원이라는 변수이기에 총 사원 수 확인 가능
	Scanner scan = new Scanner(System.in);
	
	// 리스트 초기화 : 지금은 사용 안함
	//	private _03_employeelist(_03_employee[] list) {
	//		this.list = list;
	//		this.empnum = list.length;
	//	}
	
	// 배열객체 선언
	public void init() {
		System.out.print("사원 수 입력 >> ");
		int num = Integer.parseInt(scan.nextLine());
		list = new _03_employee[num];
	}
	
	// 사원 정보 입력 -> 배열에 추가
	public void input() {
		if (empnum >= list.length) {
			System.out.println("입력 초과");
			return; // 메소드 종료
		}
		
		System.out.printf("%d 사번 > ", empnum);
		int no = Integer.parseInt(scan.nextLine());
		
		System.out.printf("이름 > ");
		String name = scan.nextLine();
		
		System.out.printf("급여 > ");
		int sal = Integer.parseInt(scan.nextLine());
		
		list[empnum++] = new _03_employee(no, name, sal); // 사원 인스턴스 생성 -> 배열 저장 / new를 통해 empnum이 0 -> 1
	}
	
	// 전체 출력
	public void printlist() {
		for (int i = 0; i < empnum; i++) { // 등록되어 있는 사원의 수 = empnum
			System.out.printf("%5d | %10s | %7d\n", list[i].getEmployeeId(), list[i].getName(), list[i].getDepartmentId());
			
		}
	}
	
	// 상세조회. 사원의 상세정보를 보여주는 기능 _03_employee에 추가
	public void search() {
		System.out.print("사원번호를 입력 : ");
		int employeeId = Integer.parseInt(scan.nextLine());
		int count;
		for (int i = 0; i < empnum; i++) {
			if (employeeId == list[i].getEmployeeId()) {
				System.out.println(list[i].getDetailInfo());
				break;
			} else if(i == empnum - 1) {
				System.out.println("잘못된 번호입니다.");
			}
		}
	}
	
	public int getLastDate(int year, int month) {
		cal.set(year, month -1, 1);
		return cal.getActualMaximum(Calendar.DATE);
			
	}
	
	public int getDayInfo(int year, int month) {
		cal.set(year, month -1, 1);
		return cal.get(Calendar.DAY_OF_WEEK);

	}
	
	public void calendar() {
		System.out.print("연도 입력 >> ");
		int year = Integer.parseInt(scan.nextLine());		
		System.out.print("월 입력 >> ");
		int month = Integer.parseInt(scan.nextLine());
		// 요일 정보, 1일의 위치, 말일의 날짜
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		int firstday = getDayInfo(year, month); // 일=0 월=1 화=2 ... 토=6
		int lastdate = getLastDate(year, month);
		
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		
		
		// 1일의 요일 정보를 맞추기 위해 빈 공간을 넣겠다.
		for (int i = 1; i < firstday; i++) {
			System.out.printf("%4s", " ");
		}
		
		for (int i = 1; i <= lastdate; i++) {
			System.out.printf("%4d", i);
			if ((i+firstday-1) % 7 == 0) { // 토요일까지 출력 후 줄 바꿈
				System.out.println();
			}
		}
		System.out.println();
		}
	
}
