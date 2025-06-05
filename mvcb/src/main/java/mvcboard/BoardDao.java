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
	public List<BoardDto> getBoards(String title) {
		Jdbc jdbc=new Jdbc();
		List<BoardDto> boards=new ArrayList<>();
		//쿼리문 준비
		String query=
				"select * from mvcboard order by idx desc";
		//제목 검색어가 있으면 다른 쿼리문으로 교체
		if(title!=null) {
			query="select * from mvcboard "
					+ "where title like '%"+title+"%' "
					+ "order by idx desc";
		}
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
	
	//게시글을 데이터베이스에 등록
	public int insertWrite(BoardDto bDto) {
		int result=0;
		Jdbc jdbc=new Jdbc();
		String query="insert into mvcboard("
				+ "idx, name, title, content,ofile,sfile,pass) "
				+ "values(seq_mvcboard_num.nextval,"
				+ "?,?,?,?,?,?)";
		try {
			PreparedStatement ps=
					jdbc.getCon().prepareStatement(query);
			ps.setString(1, bDto.getName());
			ps.setString(2, bDto.getTitle());
			ps.setString(3, bDto.getContent());
			ps.setString(4, bDto.getOfile());
			ps.setString(5, bDto.getSfile());
			ps.setString(6, bDto.getPass());
			result=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		jdbc.close();
		return result;
	}
	
	//idx값을 이용하여 해당 게시물 한개만 가져 오기
	public BoardDto selectView(int idx) {
		Jdbc jdbc=new Jdbc();
		BoardDto bDto=new BoardDto();
		String query=
			"select * from mvcboard where idx=?";
		try {
			PreparedStatement ps=
				jdbc.getCon().prepareStatement(query);
			ps.setInt(1, idx);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				bDto.setIdx(rs.getInt(1));
				bDto.setName(rs.getString(2));
				bDto.setTitle(rs.getString(3));
				bDto.setContent(rs.getString(4));
				bDto.setPostdate(rs.getDate(5));
				bDto.setOfile(rs.getString(6));
				bDto.setSfile(rs.getString(7));
				bDto.setDowncount(rs.getInt(8));
				bDto.setPass(rs.getString(9));
				bDto.setVisitcount(rs.getInt(10));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		jdbc.close();
		return bDto;
	}

}












