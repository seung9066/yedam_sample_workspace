package com.yedam02.member;

import com.yedam02.common.DAO;

// member 관련 sql query문 다 작성
public class MemberManage extends DAO{
	// 싱글톤
	private static MemberManage mm = null;
	
	// 생성자
	private MemberManage() {
		
	}
	
	public static MemberManage getInstance() {
		if (mm == null) {
			mm = new MemberManage();
		}
		return mm;
	}
	
	public MemberDTO login(MemberDTO member) {
		MemberDTO mem = null;
		try {
			conn();
			String sql = "select * from member1 where member_id = ? and member_pw = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				mem = new MemberDTO();
				mem.setMemberId(rs.getNString("member_id"));
				mem.setMemberPw(rs.getNString("member_pw"));
				mem.setMemberName(rs.getNString("member_name"));
				mem.setMemberBelong(rs.getNString("member_belong"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return mem;
	}
	
	
	
	
	
}
