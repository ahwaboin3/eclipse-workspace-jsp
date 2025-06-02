package mvcboard;

import java.util.List;

public interface BoardRepository {
	//목록 조회
	public List<BoardDto> getBoards();
}
