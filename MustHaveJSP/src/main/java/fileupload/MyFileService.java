package fileupload;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

public class MyFileService {
	FileUtil fu=new FileUtil();
	
	public void saveFile(HttpServletRequest req,String saveDirectory) throws IOException, ServletException {
		
//		System.out.println(saveDirectory);
		//String saveDirectory="Uploads";
		//원래 파일 이름과 새로운 이름
		List<String> names=fu.uploadFile(req, saveDirectory);
	}
	
	//db에 파일 업로드 정보 저장
	public void insertMyFile(List<String> names) {
		
	}
	
	

}






