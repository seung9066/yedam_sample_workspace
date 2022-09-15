package co.sgg.prj.member.serviceImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import co.sgg.prj.common.DataSource;
import co.sgg.prj.member.service.MemberService;
import co.sgg.prj.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {

	private DataSource dao = new DataSource(); // 데이터 연결객체 생성
	private PreparedStatement pstmt;
	private ResultSet rs;

	@Override
	public List<MemberVO> memberSelectList() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo;
		String sql = "SELECT * FROM MEMBER";
		try {
			pstmt = dao.conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new MemberVO();
				vo.setMemberId(rs.getString("member_id"));
				vo.setMemberPassword(rs.getString("member_password"));
				vo.setMemberName(rs.getString("member_name"));
				vo.setMemberTel(rs.getString("member_tel"));
				vo.setMemberAuthor(rs.getString("member_author"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		String sql = "SELECT * FROM MEMBER WHERE MEMBER_ID = ?";
		try {
			pstmt = dao.conn.prepareStatement(sql);
			pstmt.setString(1, vo.getMemberId());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo.setMemberPassword(rs.getString("member_password"));
				vo.setMemberName(rs.getString("member_name"));
				vo.setMemberTel(rs.getString("member_tel"));
				vo.setMemberAuthor(rs.getString("member_author"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return vo;
	}

	@Override
	public int memberInsert(MemberVO vo) {
		int result = 0;
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?)";
		try {
			pstmt = dao.conn.prepareStatement(sql);
			pstmt.setString(1, vo.getMemberId());
			pstmt.setString(2, vo.getMemberPassword());
			pstmt.setString(3, vo.getMemberName());
			pstmt.setString(4, vo.getMemberTel());
			pstmt.setString(5, vo.getMemberAuthor());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	@Override
	public int memberDelete(MemberVO vo) {
		int result = 0;
		String sql = "DELETE FROM MEMBER WHERE MEMBER_ID = ?";
		try {
			pstmt = dao.conn.prepareStatement(sql);
			pstmt.setString(1, vo.getMemberId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return result;
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		int result = 0;
		String sql = "UPDATE MEMBER SET MEMBER_PASSWORD = ?, MEMBER_NAME = ?, MEMBER_TEL = ?, MEMBER_AUTHOR = ? WHERE MEMBER_ID = ?";
		try {
			pstmt = dao.conn.prepareStatement(sql);
			pstmt.setString(1, vo.getMemberPassword());
			pstmt.setString(2, vo.getMemberName());
			pstmt.setString(3, vo.getMemberTel());
			pstmt.setString(4, vo.getMemberAuthor());
			pstmt.setString(5, vo.getMemberId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return result;
	}

	@Override
	public boolean isMemberId(String id) {
		
		String sql = "SELECT MEMBER_ID FROM MEMBER WHERE MEMBER_ID = ?";
		try {
			pstmt = dao.conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (!rs.next()) {
				disconn();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return false;
	}

	// DBMS와 연결 끊기
	private void disconn() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (dao.conn != null)
				dao.conn.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
