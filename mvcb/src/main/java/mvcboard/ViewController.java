package mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/view.do")
public class ViewController extends HttpServlet{
	BoardRepository br=new BoardDao();

	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		int idx=
			Integer.parseInt(req.getParameter("idx"));
		BoardDto bDto=br.selectView(idx);
		req.setAttribute("bDto", bDto);
		req.getRequestDispatcher("view.jsp").forward(req, resp);
	}
	
}





