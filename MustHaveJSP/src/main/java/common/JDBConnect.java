package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBConnect {
	private Connection con;

	public JDBConnect() {
		try {
			//JDBC 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//DB주소 아이디 비번
			String url="jdbc:oracle:thin:@localhost:1522/xe";
			String id="musthave";
			String pwd="1234";
			con=DriverManager.getConnection(
					url,id,pwd);
			System.out.println("DB 연결 성공(기본 생성자)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//연결 해제
	public void close() {
		try {
			if(con !=null) {
				con.close();
			}
			System.out.println("DB 연결 해제");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
