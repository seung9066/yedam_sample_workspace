package test1;

public class SwimMember extends Member{
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)

	// 정보출력시 => 강사이름: 홍길동, 등급: A

	private String swimname;

	private String swimclass;

	public SwimMember() {

	}

	public SwimMember(int memberId, String memberName, String phone, String swimname, String swimclass) {
		super(memberId, memberName, phone);
		this.swimname = swimname;
		this.swimclass = swimclass;
	}

	@Override
	public String toString() {
		return super.toString() + " 강사이름 = " + swimname + ", 등급 =" + swimclass + "]";
	}

	public String getSwimname() {
		return swimname;
	}

	public void setSwimname(String swimname) {
		this.swimname = swimname;
	}

	public String getSwimclass() {
		return swimclass;
	}

	public void setSwimclass(String swimclass) {
		this.swimclass = swimclass;
	}

}
