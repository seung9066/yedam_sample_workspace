package co.sgg.prj;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sgg.prj.common.Command;

public class MainCommand implements Command {

	// 첫 시작 페이지 오픈
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		return "main/main";
	}

}
