package co.sgg.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sgg.prj.common.Command;
import co.sgg.prj.member.service.MemberService;
import co.sgg.prj.member.service.MemberVO;
import co.sgg.prj.member.serviceImpl.MemberServiceImpl;

public class MemberDelete implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setMemberId(request.getParameter("memberId"));
		System.out.println(vo.getMemberId());
		dao.memberDelete(vo);
		return "memberSelectList.do";
	}

}
