package test;

import mvcboard.BoardDao;
import mvcboard.BoardDto;
import mvcboard.BoardRepository;

public class DaoTest {
	public static void main(String[] args) {
		BoardRepository br=new BoardDao();
//		for(BoardDto bd:br.getBoards(null)) {
//			System.out.println(bd);
//		}
		//게시글 등록 테스트
//		BoardDto bDto=new BoardDto();
//		bDto.setName("테스트 이름1");
//		bDto.setTitle("테스트 제목1");
//		bDto.setContent("테스트 내용1");
//		bDto.setPass("1234");
//		int r=br.insertWrite(bDto);
//		if(r>0) System.out.println("성공");
//		else System.out.println("실패");
		//게시글 한개 가져오기 테스트
		System.out.println(br.selectView(4));
	}

}





