package co.edu_07_exception;

import java.sql.DriverManager;
import java.sql.SQLException;

public class _05_Throws {
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (ClassNotFoundException | SQLException e) { // multicatch를 한줄에 가능
			e.printStackTrace();
		}
		System.out.println("종료");
	}
	
	public static void method1() throws ClassNotFoundException, SQLException { // throws : method1();을 호출할 때 호출 영역에서 예외처리하겠다.
		
		Class.forName("jave.lang.String"); // 마우스 올려서 add Throws 클릭
		DriverManager.getConnection("", "", "");
	}
	
}
