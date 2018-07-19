package test13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyDB {
//	public int excuteWhich(String sql) {
//		return Connection
//	}
	
	public static void main(String[] args) {
		Connection con;
		String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
		String id = "root";
		String pwd = "12345678";
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // jdbc 드라이버 불러오기
			con = DriverManager.getConnection(url, id, pwd); // 
			Statement stmt = con.createStatement();
			Scanner scan = new Scanner(System.in);
			String sql;
//			sql = "delete from user_info where uNum=1";
//			sql = "insert into user_info(uName, uAge, uAddress, uEtc)";
//			sql += "values('김기섭',33,'서울시','덜 졸림')";
			sql = "update user_info set uEtc = '우린 가족'";
			//sql += "where ";
			int cnt = stmt.executeUpdate(sql);
			if(cnt==1) {
				System.out.println("등록 성공");
			} else {
				System.out.println("등록 실패");
			} 	// Delete 실행단
			sql = "select * from user_info";
			//stmt.executeQuery(sql);
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int uNum = rs.getInt("uNum");
				int uAge = rs.getInt("uAge");
				String uName = rs.getString("uName");
				String uEtc = rs.getString("uEtc");
				System.out.println(uNum + " " + uName + " " + uAge + " " + uEtc);
			}
			System.out.println("연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		System.out.println("프로그램 종료!");
		
	}
	

}
