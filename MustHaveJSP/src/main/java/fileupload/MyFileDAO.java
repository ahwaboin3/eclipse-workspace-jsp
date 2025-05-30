package fileupload;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.JDBConnect;

public class MyFileDAO {
	
	//새로운 파일등록을 디비에 입력
	public int insertFile(MyFileDTO mfdto) throws SQLException {
		String query="insert into myfile("
				+ "idx,title,cate,ofile,sfile)"
				+ "values(seq_board_num.nextval,?,?,?,?)";
		JDBConnect jdbc=new JDBConnect();
		PreparedStatement ps=jdbc.getCon().prepareStatement(query);
		ps.setString(1, mfdto.getTitle());
		ps.setString(2, mfdto.getCate());
		ps.setString(3, mfdto.getOfile());
		ps.setString(4, mfdto.getSfile());
		int applyResult=ps.executeUpdate(query);
		return applyResult;
	}

}
