package co.edu_08_api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
 * Date, Calendar
 */
public class _07_Date {
	public static void main(String[] args) {

// Date 클래스
		Date today = new Date(); // LocalDate, LocalDateTime으로 대체됨
		today.getDate();
		today.getDay();
		System.out.println(today.toString()); // .toString(); : 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
		System.out.println(today.toGMTString());
		System.out.println(today.toLocaleString());

		System.out.println("==========================================");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); // HH시 로하면 24시 기준
		System.out.println(sdf.format(today));

		System.out.println("==========================================");

		sdf = new SimpleDateFormat("yyyy-MM-dd\nhh:mm:ss");
		System.out.println(sdf.format(today));

		System.out.println("==========================================");

		today = new Date("1995/12/03 17:50:00"); // 원하는 날짜 지정
		System.out.println(sdf.format(today));

		System.out.println("==========================================");

// Calender 클래스
		Calendar now = Calendar.getInstance();
		System.out
				.println(now.get(Calendar.YEAR) + "년 " + now.get(Calendar.MONTH) + "월 " + now.get(Calendar.DATE) + "일");
		// 월은 0월부터 시작
		
		System.out.println("==========================================");

		now.set(2022, 10, 11);
		System.out.println(now.get(Calendar.DATE) + "일");
		
		System.out.println("==========================================");
		
// LocalDate
		
		LocalDate Date = LocalDate.now(); // 정적메소드
		System.out.println(Date.toString());
		
		System.out.println("==========================================");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println(Date.format(dtf));

	}

}
