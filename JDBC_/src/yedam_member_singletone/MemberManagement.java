package yedam_member_singletone;

import java.util.ArrayList;
import java.util.List;

import common.DAO;

public class MemberManagement extends DAO {
	
	// 싱글톤 생성
	private static MemberManagement mm = null;
	
	// 생성자
	private MemberManagement() {
		
	}
	
	// 단 하나의 객체를 사용할 수 있도록 메소드 생성
	public static MemberManagement getInstance() {
		if(mm == null) {
			return new MemberManagement();
		} else {
			return mm;
		}
	}
	
	// 1. 전체 조회
	public List<Member> getMemberList() {
		List<Member> list = new ArrayList<>();
		Member member = null;
		try {
			conn();
			String sql = "select * from member";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				member = new Member(); // 한바퀴 돌고 초기화해야 다음 객체에 들어오니까
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}
	// 2. 단건 조회
	
	// 3. 입력

	// 4. 수정

	// 5. 삭제
}
