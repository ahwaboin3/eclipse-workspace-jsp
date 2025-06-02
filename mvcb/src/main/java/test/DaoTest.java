package test;

import mvcboard.BoardDao;
import mvcboard.BoardDto;
import mvcboard.BoardRepository;

public class DaoTest {
	public static void main(String[] args) {
		BoardRepository br=new BoardDao();
		for(BoardDto bd:br.getBoards()) {
			System.out.println(bd);
		}
	}

}





