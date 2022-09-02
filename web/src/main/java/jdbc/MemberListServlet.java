package jdbc;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberListServlet
 */
@WebServlet("/memberList")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberListServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// json 데이터 생성
		response.setCharacterEncoding("utf-8"); // 한글처리
		response.setContentType("text/json;charset=utf-8");
		
		MemberManage dao = MemberManage.getInstance();
		List<Member> list = dao.getMembers();
		// [{"memberId": "user1", "memberPw": 1234, "memberName": "홍길동",
		// "memberAccount": "1234", "memberRole": 0}]
		String json = "[";
		for (int i = 0; i < list.size(); i++) {
//			json += "{\"memberId\": " + list.get(i).getMemberId() + ", \"memberPw\": " + list.get(i).getMemberPw()
//					+ ", \"memberName\": " + list.get(i).getMemberName() + ", \"memberAccount\": "
//					+ list.get(i).getAccountId() + ", \"memberRole\": " + list.get(i).getRole() + "}";
			json += "{\"memberId\": \"" + list.get(i).getMemberId() + "\", \"memberPw\": \""+ list.get(i).getMemberPw()+"\", \"memberName\":\""+list.get(i).getMemberName()+"\", \"memberRole\": "+list.get(i).getRole()+
	                  "}";
			if (i != list.size()-1) {
				json += ", ";
			}
		}
		json += "]";
		
		response.getWriter().print(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		String id = request.getParameter("del_id");
		
		MemberManage dao = MemberManage.getInstance();
		if(dao.delMember(id)) {
			response.getWriter().print("success");
		} else {
			response.getWriter().print("fail");
		}
	}

}
