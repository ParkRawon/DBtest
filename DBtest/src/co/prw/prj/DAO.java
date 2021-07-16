package co.prw.prj;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "demo";
	private String password = "1234";
	
	public Connection conn; //연결
	
	public DAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password); //DB연결 connection
			System.out.println("DB 연결성공");
		} catch(Exception e) {
			System.out.println("DB연결이 안되었거나 class가 없습니다.");
		}
	}

}
