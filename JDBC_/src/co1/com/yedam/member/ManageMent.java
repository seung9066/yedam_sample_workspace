package co1.com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import co1.com.common.DAO;

public class ManageMent extends DAO {
	public ManageMent() {
		showInfo();
		getMember();
		insertInfo();
	}
	
	// 한건 입력
	private void insertInfo() {
		int result = 0;
		try {
			// 1. db 연결
			conn();
			// 2. query 작성
			String sql = "insert into member values(?,?,?)";
			// 3. 창구 생성
			pstmt = conn.prepareStatement(sql);
			// 4. query 데이터 입력
			pstmt.setString(1, "F");
			pstmt.setString(2, "1234");
			pstmt.setString(3, "김씨");
			// DML (insert, update, delete) -> executeUpdate() / select -> executeQuery()
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		if(result == 1) {
			System.out.println("정상 입력되었습니다.");
		} else {
			System.out.println("입력 실패");
		}
	}
	
	// 한건 조회
	private void getMember() {
		Member member = null;
		try {
			// 1. db 연결
			conn();
			// 2. query문 작성
			String sql = "select * from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "A"); // 1번째 물음표에 A를 넣어라
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		System.out.println("***********************************");
		System.out.println(member.toString());
	}
	
	// 전체 조회
	private void showInfo() {
		List<Member> list = new ArrayList<>();
		Member mem = null;

		try {
			// 1. conn() 메소드로 db 연결
			conn();
			// 2. query문 작성
			String sql = "select * from member";
			// 3. 연결된 db에 query문 보낼 수 있는 창구 생성
			stmt = conn.createStatement();
			// 4. 3번에서 만든 창구로 query문 보냄
			rs = stmt.executeQuery(sql);
			while (rs.next()) { // rs(query문 저장)가 다음 데이터도 있는지, row 한개한개 읽어오기 위해
				mem = new Member();
				mem.setId(rs.getString("id")); // 컬럼명과 일치하는 걸 넣겠다.
				mem.setPw(rs.getString("pw"));
				mem.setName(rs.getString("name"));
				list.add(mem); // list에 넣기
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // try catch 상관 없이 할거
			disconn(); // 혹시나 인터넷이 끊긴다는 등의 사태 방지
		}
		for (Member member : list) {
			System.out.println(member.toString());
		}
	}
}
