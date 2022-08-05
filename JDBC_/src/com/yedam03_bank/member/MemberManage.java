package com.yedam03_bank.member;

import com.yedam03_bank.common.DAO;

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
			if(rs.next()) {
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
}
