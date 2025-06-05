package mvcboard;

import java.io.IOException;
import java.util.List;

import common.FileUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/write.do")
@MultipartConfig(
		maxFileSize=1024*1024*200,
		maxRequestSize=1024*1024*100
)
public class WriteController extends HttpServlet{
	private BoardRepository br=new BoardDao();
	private FileUtil fu=new FileUtil();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("write.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//폼값을 가져와서 BoardDto 필드값을 채워 생성
		BoardDto bDto=new BoardDto();
		bDto.setName(req.getParameter("name"));
		bDto.setTitle(req.getParameter("title"));
		bDto.setContent(req.getParameter("content"));
		bDto.setPass(req.getParameter("pass"));
		//파일을 업로드 했을 때만
		if(req.getPart("ofile").getSubmittedFileName()!="") {
			//파일 업로드 처리
			String saveDirectory=req.getServletContext()
				.getRealPath("/files");
			List<String> fNames=fu.uploadFile(req, saveDirectory);
			bDto.setOfile(fNames.get(0));
			bDto.setSfile(fNames.get(1));
		}
		int result=br.insertWrite(bDto);
		if(result>0) {
			//글쓰기 성공
			resp.sendRedirect("./list");
		}else {
			//글쓰기 실패
			req.setAttribute("errMsg", "글쓰기에 실패 하였습니다.");
			req.getRequestDispatcher("write.do").forward(req, resp);
		}
	}
	
	
	
}






