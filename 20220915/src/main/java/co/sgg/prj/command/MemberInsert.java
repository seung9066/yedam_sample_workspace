package co.sgg.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sgg.prj.common.Command;
import co.sgg.prj.member.service.MemberService;
import co.sgg.prj.member.service.MemberVO;
import co.sgg.prj.member.serviceImpl.MemberServiceImpl;

public class MemberInsert implements Command {

	// 멤버 추가
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setMemberId(request.getParameter("memberId"));
		vo.setMemberPassword(request.getParameter("memberPassword"));
		vo.setMemberName(request.getParameter("memberName"));
		vo.setMemberTel(request.getParameter("memberTel"));
		vo.setMemberAuthor(request.getParameter("memberAuthor"));
		String viewPage = null;
		int result = dao.memberInsert(vo);
		if (result != 0) {
			viewPage = "memberSelectList.do";
		} else {
			request.setAttribute("message", "회원가입 실패!");
			viewPage = "member/memberMessage";
		}
		return viewPage;
	}

}
