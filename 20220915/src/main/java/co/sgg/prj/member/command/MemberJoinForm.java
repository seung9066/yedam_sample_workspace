package co.sgg.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sgg.prj.common.Command;

public class MemberJoinForm implements Command {
	
	// 멤버 입력화면 호출
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		return "member/memberJoinForm";
	}

}
