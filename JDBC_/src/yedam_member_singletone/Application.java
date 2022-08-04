package yedam_member_singletone;

import java.util.List;

public class Application {
	
	public Application() {
		// 실행하는 곳
		List<Member> list = MemberManagement.getInstance().getMemberList();
		for (Member member : list) {
			System.out.println(member.toString());
		}
	}
}
