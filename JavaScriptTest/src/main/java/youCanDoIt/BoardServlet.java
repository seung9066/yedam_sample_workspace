package youCanDoIt;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		response.setCharacterEncoding("utf-8");

		BoardDAO dao = BoardDAO.getInstance();

		List<Board> list = dao.getBoardList();
		JsonArray ary = new JsonArray();
		for (Board bo : list) {
			JsonObject obj = new JsonObject();
			obj.addProperty("bno", bo.getBno());
			obj.addProperty("title", bo.getTitle());
			obj.addProperty("content", bo.getContent());
			obj.addProperty("writer", bo.getWriter());
			obj.addProperty("creationDate", bo.getCreationDate());
			ary.add(obj);
		}

		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(ary);
		response.getWriter().print(json);
		// 조회의 기능 구현.

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		response.setCharacterEncoding("utf-8");

		String select = request.getParameter("select");
		if (select.equals("insert")) {
			
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String writer = request.getParameter("writer");
	
			Board bo = new Board();
			bo.setTitle(title);
			bo.setContent(content);
			bo.setWriter(writer);
			
			BoardDAO dao = BoardDAO.getInstance();
			
			dao.insertBoard(bo);
			if (bo.getBno() > 1) {
				String json = "{\"retCode\": \"success\", \"title\": \"" + title + "\", \"content\": \"" + content + "\", \"writer\":\"" + writer + "\", \"bno\":\"" + bo.getBno() + "\", \"date\":\"" + bo.getCreationDate()
						 + "\"}";
				response.getWriter().print(json);
			} else {
				String json = "{\"retCode\": \"fail\"}";
				response.getWriter().print(json);
			}
		} else if (select.equals("delete")) {

			BoardDAO dao = BoardDAO.getInstance();
			
			int bno = Integer.parseInt(request.getParameter("bno"));
			
			if (dao.deleteBoard(bno)) {
				response.getWriter().print("success");
			} else {
				response.getWriter().print("fail");
			}
		}
		// 추가, 삭제의 기능을 구현.

	}

}
