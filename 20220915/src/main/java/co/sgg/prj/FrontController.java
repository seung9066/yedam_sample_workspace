package co.sgg.prj;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.sgg.prj.command.MemberInsert;
import co.sgg.prj.common.Command;
import co.sgg.prj.member.command.MemberJoinForm;
import co.sgg.prj.member.command.MemberSelect;
import co.sgg.prj.member.command.MemberSelectList;

/**
 * Servlet implementation class FrontController
 * 모든 .do 요청을 분석하고 처리한다.
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
   private static final long serialVersionUID = 1L;
   private HashMap<String, Command> map = new HashMap<String, Command>(); //요청 값을 저장하기 위해
    
    public FrontController() {
        super();
    
    }
    public void init(ServletConfig config) throws ServletException {
       // 모든 요청을 등록하는 곳
       map.put("/main.do", new MainCommand()); //처음 시작하는페이지
       map.put("/memberSelectList.do", new MemberSelectList());
       map.put("/memberSelect.do", new MemberSelect());
       map.put("/memberJoinForm.do", new MemberJoinForm()); // 멤버 입력 화면
       map.put("/memberInsert.do", new MemberInsert()); // 멤버 입력 처리
       
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // 요청 분석, 처리, 결과 돌려주는 곳
       request.setCharacterEncoding("utf-8"); //한글 깨짐방지
       String uri = request.getRequestURI(); //도메인을 제외한 실제 요청정보
       String contextPath = request.getContextPath(); // ContextPath 구함
       String page = uri.substring(contextPath.length()); //처리할 요청명 구함
       System.out.println(request.getRequestURI());
       System.out.println(uri);
       System.out.println(contextPath);
       System.out.println(page);
       System.out.println(request.getRemoteUser());
       
       
       Command command = map.get(page); // 처리할 Command를 찾음
       String viewPage = command.exec(request, response); //Command를 실행하고 돌려줄 페이지를 받음
       
       if(!viewPage.endsWith(".do"))   {
          viewPage = "/WEB-INF/views/" + viewPage + ".jsp";
          
          RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
          dispatcher.forward(request, response);
       } else {
          response.sendRedirect(viewPage);
       }
       
    }

 }