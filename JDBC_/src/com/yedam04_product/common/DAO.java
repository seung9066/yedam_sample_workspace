package com.yedam04_product.common;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DAO {
	
	// DAO = Data Access Object(데이터 접근 객체)

	// java <-> DB 연결할 때 쓰는 객체
	protected Connection conn = null;

	// select문에서 나온 결과 반환 받는 객체
	protected ResultSet rs = null;

	// query문을 담고 query문을 실행하는 객체
	protected PreparedStatement pstmt = null; // insert, delete에서 편함(조건이 들어갈 때)
	protected Statement stmt = null; // select문에서 편함
	
	Properties pro = new Properties();
	
	// google(jdbc oracle)
	String driver = "";
	String url = "";
	String id = "";
	String pw = "";

	public void conn() {
		try {
			getProperties();
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
	
	// 파일에서 읽어오기
	private void getProperties() {
		try {
			FileReader resource = new FileReader("src/com/yedam04_product/config/db.properties");
			pro.load(resource);
			driver = pro.getProperty("driver");
			url = pro.getProperty("url");
			id = pro.getProperty("id");
			pw = pro.getProperty("pw");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
