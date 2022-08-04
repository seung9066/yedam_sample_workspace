package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO1 {
	
	// DAO = Data Access Object(데이터 접근 객체)

	// java <-> DB 연결할 때 쓰는 객체
	protected Connection conn = null;

	// select문에서 나온 결과 반환 받는 객체
	protected ResultSet rs = null;

	// query문을 담고 query문을 실행하는 객체
	protected PreparedStatement pstmt = null; // insert, delete에서 편함(조건이 들어갈 때)
	protected Statement stmt = null; // select문에서 편함

	// google(jdbc oracle)
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "test";
	String pw = "1234";

	public void conn() {
		try {
			// 1. 드라이버 로딩
			Class.forName(driver);
			// 2. db 연결
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void disconn() {
		try {
			if(rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
