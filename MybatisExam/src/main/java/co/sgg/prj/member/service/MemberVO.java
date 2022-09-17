package co.sgg.prj.member.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {
	private String  memberId;
    private String  memberPassWord;
    private String  memberName; 
    private String  memberTel;
    private String  memberAuthor;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPassWord() {
		return memberPassWord;
	}
	public void setMemberPassWord(String memberPassWord) {
		this.memberPassWord = memberPassWord;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberTel() {
		return memberTel;
	}
	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}
	public String getMemberAuthor() {
		return memberAuthor;
	}
	public void setMemberAuthor(String memberAuthor) {
		this.memberAuthor = memberAuthor;
	}
	
    
}
