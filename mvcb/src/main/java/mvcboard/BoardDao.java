package mvcboard;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.Jdbc;

public class BoardDao implements BoardRepository{

	//게시물 목록을 반환합니다(페이지 기능 지원)
	@Override
	public List<BoardDto> getBoards() {
		Jdbc jdbc=new Jdbc();
		List<BoardDto> boards=new ArrayList<>();
		//쿼리문 준비
		String query=
				"select * from mvcboard order by idx desc";
		try {
			PreparedStatement ps=
				jdbc.getCon().prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				BoardDto bdto=new BoardDto();
				bdto.setIdx(rs.getInt(1));
				bdto.setName(rs.getString(2));
				bdto.setTitle(rs.getString(3));
				bdto.setContent(rs.getString(4));
				bdto.setPostdate(rs.getDate(5));
				bdto.setOfile(rs.getString(6));
				bdto.setSfile(rs.getString(7));
				bdto.setDowncount(rs.getInt(8));
				bdto.setPass(rs.getString(9));
				bdto.setVisitcount(rs.getInt(10));
				boards.add(bdto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			jdbc.close();
		}
		return boards;
	}

}





