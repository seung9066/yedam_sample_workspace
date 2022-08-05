package com.yedam02.student;

import com.yedam02.common.DAO;

public class StudentManage extends DAO {

	private static StudentManage sm = null;

	private StudentManage() {

	}

	public static StudentManage getInstance() {
		if (sm == null) {
			sm = new StudentManage();
		}
		return sm;
	}

	public int insertStudent(StudentDTO std) { // 학생등록
		int result = 0;
		try {
			conn();
			String spl = "insert into student(student_id, student_name, student_class, student_addr, student_tell) values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(spl);
			pstmt.setInt(1, std.getStudentId());
			pstmt.setString(2, std.getStudentName());
			pstmt.setString(3, std.getStudentClass());
			pstmt.setString(4, std.getStudentAddr());
			pstmt.setString(5, std.getStudentTel());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	public int insertKor(StudentDTO std) { // 국어점수
		int result = 0;
		try {
			conn();
			String sql = "update student set student_kor = ? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentKor());
			pstmt.setInt(2, std.getStudentId());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	public int insertEng(StudentDTO std) { // 영어점수
		int result = 0;
		try {
			conn();
			String sql = "update student set student_eng = ? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentEng());
			pstmt.setInt(2, std.getStudentId());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	public int insertMath(StudentDTO std) { // 수학점수
		int result = 0;
		try {
			conn();
			String sql = "update student set student_math = ? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentMath());
			pstmt.setInt(2, std.getStudentId());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

}
