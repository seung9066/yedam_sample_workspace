package co.sgg.prj.member.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sgg.prj.common.Command;
import co.sgg.prj.member.service.MemberService;
import co.sgg.prj.member.service.MemberVO;
import co.sgg.prj.member.serviceImpl.MemberServiceImpl;

public class MemberSelectList implements Command {

	// 멤버목록 보기
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		MemberService dao = new MemberServiceImpl();
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = dao.memberSelectList();
		request.setAttribute("members", members); // 결과 담기
		return "member/memberList";
	}

}
