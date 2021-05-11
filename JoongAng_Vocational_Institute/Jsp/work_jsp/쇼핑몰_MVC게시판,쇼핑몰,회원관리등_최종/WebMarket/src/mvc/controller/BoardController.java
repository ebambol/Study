package mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter; // JSP 처럼 out 출력 객체를 사용하기 위함.

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.model.BoardDAO;
import mvc.model.BoardDTO;

public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		// 1.콘솔창에 결과 출력
		/*
		System.out.println("RequestURI :"+RequestURI);
		System.out.println("contextPath :"+contextPath);
		System.out.println("RequestURI.substring(contextPath.length()) :"+command);
		*/
		// 2.브라우저에 출력
		/*
		PrintWriter out = response.getWriter(); // JSP처럼 out 출력객체를 사용하기 위함
		out.println("RequestURI :"+RequestURI);
		out.println("<br>");
		out.println("contextPath :"+contextPath);
		out.println("<br>");
		out.println("RequestURI.substring(contextPath.length()) :"+command);
		*/
		/*
		 *  RequestURI :/WebMarket/*.do
		 *	contextPath :/WebMarket
		 *	RequestURI.substring(contextPath.length()) :/*.do
		 *  
		 *  RequestURI :/WebMarket/BoardListAction.do
		 *  contextPath :/WebMarket
		 *	RequestURI.substring(contextPath.length()) :/BoardListAction.do
		 */
		
		
			if (command.equals("/BoardListAction.do")) {
				requestBoardList(request);
				RequestDispatcher rd = request.getRequestDispatcher("./board/list.jsp");
				rd.forward(request, response);
				
			} 
			else if (command.equals("/BoardWriteForm.do")) {
					requestLoginName(request);
					RequestDispatcher rd = request.getRequestDispatcher("./board/writeForm.jsp");
					rd.forward(request, response);				

			} else if (command.equals("/BoardWriteAction.do")) {
					requestBoardWrite(request);
					RequestDispatcher rd = request.getRequestDispatcher("/BoardListAction.do");
					rd.forward(request, response);						
					
			} 
			else if (command.equals("/BoardViewAction.do")) {
					requestBoardView(request);
					RequestDispatcher rd = request.getRequestDispatcher("/BoardView.do");
					rd.forward(request, response);						
					
			} else if (command.equals("/BoardView.do")) {
				RequestDispatcher rd = request.getRequestDispatcher("./board/view.jsp");
				rd.forward(request, response);	
			
			} 
			else if (command.equals("/BoardUpdateAction.do")) {
				requestBoardUpdate(request);
				RequestDispatcher rd = request.getRequestDispatcher("/BoardListAction.do");
				rd.forward(request, response);
			}		
			else if (command.equals("/BoardDeleteAction.do")) {

				requestBoardDelete(request);
				RequestDispatcher rd = request.getRequestDispatcher("/BoardListAction.do");
				rd.forward(request, response);				
				
			} 
			
			
	}
		
	public void requestBoardList(HttpServletRequest request)
	{
			
		BoardDAO dao = BoardDAO.getInstance();
		List<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		
	  	int pageNum=1; // 게시판에 출력한 페이지 번호
		int limit=4;   // 게시판 한페이지에 목록으로 출력할 글의 갯수 => 페이지당 최대 4개를 출력
		
		if(request.getParameter("pageNum")!=null){
			pageNum=Integer.parseInt(request.getParameter("pageNum"));
		}		
		
		String items = request.getParameter("items"); //검색항목(필드)
		String text = request.getParameter("text");   //검색할내용
		
		int total_record=dao.getListCount(); //게시판 테이블에 저장된 글의 개수
		
		//해당페이지의 글 목록이 들어 있는 Arraylist 객체를 리턴.
		boardlist = dao.getBoardList(pageNum,limit, items, text); 
		
		int total_page; // 페이징 처리시 표시해야할 최대 페이지 번호
		
		// 게시판글의 갯수를 limit으로  나눈 나머지 가 0일때(페이지수와 글갯수가 딱 맞을때)
		// 한페이지에 4개씩 글을 출력한다고 했을 때
		// 게시판글의 총갯수가 12개면 total_page는  3개만 있으면 됨.
		if (total_record % limit == 0){    
	     	total_page =total_record/limit;
	     	Math.floor(total_page);  
		}
		else{ // 게시판글의 총갯수가 13개면 total_page는  3+1 -> 4개가 필요함.
		   total_page =total_record/limit;
		   Math.floor(total_page); 
		   total_page =  total_page + 1; 
		}		
   
		// 속성에다가 값을 저장	
   		request.setAttribute("pageNum", pageNum);		  
   		request.setAttribute("total_page", total_page);   
		request.setAttribute("total_record",total_record); 
		request.setAttribute("boardlist", boardlist);			
		
							
	}
	public void requestLoginName(HttpServletRequest request)
	{
					
		String id = request.getParameter("id");
		
		BoardDAO  dao = BoardDAO.getInstance();
		
		String name = dao.getLoginNameById(id);		
		
		request.setAttribute("name", name);		  
							
	}
	public void requestBoardWrite(HttpServletRequest request)
	{
					
		BoardDAO dao = BoardDAO.getInstance();		
		
		BoardDTO board = new BoardDTO();
		board.setId(request.getParameter("id"));
		board.setName(request.getParameter("name"));
		board.setSubject(request.getParameter("subject"));
		board.setContent(request.getParameter("content"));	
		
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("subject"));
		System.out.println(request.getParameter("content"));
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy/MM/dd(HH:mm:ss)");
		String regist_day = formatter.format(new java.util.Date()); 
		
		board.setHit(0);
		board.setRegist_day(regist_day);
		board.setIp(request.getRemoteAddr());			
		
		dao.insertBoard(board);			
							
	}
	public void requestBoardView(HttpServletRequest request)
	{
					
		BoardDAO dao = BoardDAO.getInstance();
		int num = Integer.parseInt(request.getParameter("num"));
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));	
		
		BoardDTO board = new BoardDTO();
		board = dao.getBoardByNum(num, pageNum);		
		
		request.setAttribute("num", num);		 
   		request.setAttribute("page", pageNum); 
   		request.setAttribute("board", board);   		
		
							
	}
	public void requestBoardUpdate(HttpServletRequest request)
	{
					
		int num = Integer.parseInt(request.getParameter("num"));
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));	
		
		BoardDAO dao = BoardDAO.getInstance();		
		
		BoardDTO board = new BoardDTO();		
		board.setNum(num);
		board.setName(request.getParameter("name"));
		board.setSubject(request.getParameter("subject"));
		board.setContent(request.getParameter("content"));		
		
		 java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy/MM/dd(HH:mm:ss)");
		 String regist_day = formatter.format(new java.util.Date()); 
		 
		 board.setHit(0);
		 board.setRegist_day(regist_day);
		 board.setIp(request.getRemoteAddr());			
		
		 dao.updateBoard(board);		
		
							
	}
	public void requestBoardDelete(HttpServletRequest request)
	{
					
		int num = Integer.parseInt(request.getParameter("num"));
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));	
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.deleteBoard(num);		  	
							
	}
	
	
}
