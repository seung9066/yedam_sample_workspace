package co.edu_11_IO.prac;

import java.io.Serializable;

public class Memo implements Serializable { // implements Serializable : 타입변환하여 저장 + 저장한 것 읽기
	
	// 필드
	private int no;
	
	private String date;
	
	private String content;
	
	// 생성자
	public Memo() {
		
	}
	
	public Memo(int no, String date, String content) {
		this.no = no;
		this.date = date;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "메모 [no=" + no + ", date=" + date + ", content=" + content + "]";
	}
	
	// getter, setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
