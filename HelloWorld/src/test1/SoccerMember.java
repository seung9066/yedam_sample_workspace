package test1;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)

	// 정보출력시 => 코치이름: 홍길동, 락커룸: A

	private String soccername;

	private String soccerclass;

	public SoccerMember() {

	}

	public SoccerMember(int memberId, String memberName, String phone, String soccername, String soccerclass) {
		super(memberId, memberName, phone);
		this.soccername = soccername;
		this.soccerclass = soccerclass;
	}

	@Override
	public String toString() {
		return super.toString() + " 코치이름 = " + soccername + ", 락커룸 =" + soccerclass + "]";
	}

	public String getSoccername() {
		return soccername;
	}

	public void setSoccername(String soccername) {
		this.soccername = soccername;
	}

	public String getSoccerclass() {
		return soccerclass;
	}

	public void setSoccerclass(String soccerclass) {
		this.soccerclass = soccerclass;
	}

}
