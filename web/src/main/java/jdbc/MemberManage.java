package jdbc;

import java.util.ArrayList;
import java.util.List;

public class MemberManage extends DAO {

	private static MemberManage mm = new MemberManage();

	private MemberManage() {

	}

	public static MemberManage getInstance() {
		return mm;
	}

	// 로그인
	public Member loginInfo(String id) {
		Member member = null;
		try {
			conn();
			String sql = "select * from bankmember where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				member = new Member();
				member.setAccountId(rs.getString("member_id"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberName(rs.getString("member_name"));
				member.setRole(rs.getString("role"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return member;
	}

	// 고객등록
	public int registCustomer(Member member) { // 고객정보가 필요하니까 매게변수로 Member
		int result = 0;
		try {
			conn();
			String sql = "insert into bankmember (member_id, member_pw, member_name, role) values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getRole());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	// 전체 멤버 반환
	public List<Member> getMembers() {
		List<Member> list = new ArrayList<>();
		try {
			conn();
			String sql = "select * from bankmember";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Member mem = new Member();
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberPw(rs.getString("member_pw"));
				mem.setMemberName(rs.getString("member_name"));
				mem.setAccountId(rs.getString("account_id"));
				mem.setRole(rs.getString("role"));
				list.add(mem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		
		return list;
	}
	
	// 아이디를 기준으로 삭제처리 후 정상처리 되면 true return
	public boolean delMember(String id) {
		try {
			conn();
			String sql = "delete from bankmember where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			disconn();
		}
		return false; // 정상처리 안된 경우
	}
	
	// 수정
	public boolean updateMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update bankmember set member_name = ?, member_pw = ?, role = ? where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberName());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getRole());
			pstmt.setString(4, member.getMemberId());
			result = pstmt.executeUpdate();
			if (result > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return false;
	}
	
}
