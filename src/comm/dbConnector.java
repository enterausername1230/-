package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnector {

	Connection conn; // java.sql.Connection
	Statement stmt = null;

	
	public dbConnector() {
		
		// 생성자가 실행되면 DB에 자동 연결되어 Connection 객체 생성
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://jdb.deu.monster:60001/java03_team03", "java03_team03","980601eh!");
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
	
	
	public ResultSet executeQurey(String sql) {
		//SQL문 실행하기 위한 메소드 - Parameter : String객체로 만든 SQL문
		//실행결과는 ResultSet으로 반환
		
		ResultSet src = null;
		try {
			src = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("SQL 실행 에러");
			return null;
		}
		
		return src;
	}
	
	public Connection getConnection() {
		//PreparedStatement이용해 SQL 작성할 경우 Connection 객체가 필요해 만든 메소드
		
		if(conn!=null) {
			return conn;
		}else {
			return null;
		}
		
	}


	public int executeUpdate(String str) {
		// TODO Auto-generated method stub
		int src;
		try {
			src = stmt.executeUpdate(str);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("SQL 실행 에러");
			return 0;
		}
		
		return src;
	}
	
	
	
}
