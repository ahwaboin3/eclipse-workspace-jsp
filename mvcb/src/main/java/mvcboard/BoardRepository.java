package mvcboard;

import java.util.List;

public interface BoardRepository {
	//목록 조회
	public List<BoardDto> getBoards(String title);
	//게시글 등록
	public int insertWrite(BoardDto bDto);
	//게시글 한개 조회
	public BoardDto selectView(int idx);
}
