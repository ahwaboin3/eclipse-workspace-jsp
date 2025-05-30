package fileupload;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;

public class FileUtil {
	//파일 업로드 처리
	public void uploadFile(
			HttpServletRequest req,String sDirectory) 
					throws IOException, ServletException {
		//type이 file일 때는 Part 클래스를 사용해야 합니다.
		Part part=req.getPart("ofile");
		//헤더값에서 name속성과 파일명을 읽어 오기
		String partHeader=
				part.getHeader("content-disposition");
		//헤더의 내용에서 파일명 추출
		//....name="ofile";filename=".....jpg"
		String[] phArr=partHeader.split("filename=");
		System.out.println(phArr[1]);
		
	}
}






