package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class ex1_program1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String sql = "select * from notice where hit >= 10";
	
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con=DriverManager.getConnection(url,"whdytpq4","1234");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(sql);
	
	while(rs.next()) {
	
	int id =rs.getInt("ID");
	String title = rs.getString("TITLE");
	String wirterId=rs.getString("WRITER_ID");
	Date regDate = rs.getDate("REGDATE");
	String content = rs.getString("CONTENT");
	int hit = rs.getInt("hit");
	
	System.out.printf("id:%d, title:%s, writerId:%s, regDate:%s, content:%s, hit:%d\n",
			id, title, wirterId, regDate, content, hit);
	  
	};
	
	rs.close();
	st.close();
	con.close();
	

	}

}