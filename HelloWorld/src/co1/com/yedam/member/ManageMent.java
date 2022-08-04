package co1.com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import co1.com.common.DAO;

public class ManageMent extends DAO {
	public ManageMent() {
		showInfo();
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

	}
}
