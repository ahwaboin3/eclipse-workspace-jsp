package mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListController extends HttpServlet{
	BoardRepository br=new BoardDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//searchTitle이란 파라미터가 있을 경우 검색
		String searchTitle=req.getParameter("searchTitle");
		req.setAttribute("boards", br.getBoards(searchTitle));
		req.getRequestDispatcher("index.jsp")
			.forward(req, resp);
	}
	
}








