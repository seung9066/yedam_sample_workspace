package co.sgg.prj.member.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sgg.prj.common.Command;
import co.sgg.prj.member.service.MemberService;
import co.sgg.prj.member.service.MemberVO;
import co.sgg.prj.member.serviceImpl.MemberServiceImpl;

public class MemberIdCheck implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		MemberService dao = new MemberServiceImpl();
		boolean vo1 = dao.isMemberId(request.getParameter("id"));
		String str = "ajax:1";
		System.out.println(vo1);
		if (vo1) {
			str = "ajax:0"; // view Resolve에 Ajax 호출이라는 것을 알려주기 위해
		}
		return str;
	}

}
