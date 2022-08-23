package jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddBankMemberServlet")
public class AddBankMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddBankMemberServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// a 태그의 파라미터 정보 읽기
		// a 태그 처럼 주소 입력하는 것은 get
		// ?id=user1&pw=1234&name=김사용&role=0
		request.setCharacterEncoding("utf-8"); // 한글이 있으면 인코딩
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String role = request.getParameter("role");
		
		Member member = new Member();
		member.setMemberId(id);
		member.setMemberPw(pw);
		member.setMemberName(name);
		member.setRole(role);
		
		MemberManage.getInstance().registCustomer(member);
		
//		response.sendRedirect("index.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
