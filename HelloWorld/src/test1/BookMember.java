package test1;

public class BookMember extends Member{
	// 도서반의 반장이름.
	private String bookname;
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	private String bookclass;
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실
	public BookMember() {
	
	}
	
	public BookMember(int memberId, String memberName, String phone, String bookname, String bookclass) {
		super(memberId, memberName, phone);
		this.bookname = bookname;
		this.bookclass = bookclass;
	}
	
	
	@Override
	public String toString() {
		return "BookMember [id = "+ getMemberId() +" 회원이름 = "+getMemberName()+" 번호 = "+getPhone()+" 반장이름 = " + bookname + ", 강의실 =" + bookclass + "]";
	}

	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookclass() {
		return bookclass;
	}
	public void setBookclass(String bookclass) {
		this.bookclass = bookclass;
	}
	
	
	
}