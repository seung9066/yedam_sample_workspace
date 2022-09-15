package co.sgg.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sgg.prj.common.Command;
import co.sgg.prj.member.service.MemberService;
import co.sgg.prj.member.service.MemberVO;
import co.sgg.prj.member.serviceImpl.MemberServiceImpl;

public class MemberSelect implements Command {

	// 멤버 상세보기
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setMemberId(request.getParameter("id")); // 폼에서 넘어온 아이디
		vo = dao.memberSelect(vo); // 검색결과 얻기
		request.setAttribute("member", vo); // 페이지에 전달
		return "member/memberSelect";
	}

}
