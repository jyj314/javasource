package member.dao;

//CRUD작업
//
//C: INSERT
//R: SELECT
//U: UPDATE
//D: DELETE
//
//~~DAO : database 작업 클래스
//~~DTO(Data Transfer Object) : value => 객체
//
//lombok : getter/setter, 생성자를 쉽게 작성할 수 있도록 도와줌 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

// 여러개의 DAO 파일에서 중복된 부분 처리

public class JdbcUtil {
	
	public static Connection getConnection() {
		
		Connection con = null;
			
		try {
			
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
			con = ds.getConnection();
			con.setAutoCommit(false);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}










