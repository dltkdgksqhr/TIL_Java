package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class ex1_program3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

	String title = "TEST4";	
	String content = "hahaha";	
	String files = "";	
	int id = 3;	
		
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String sql = "update notice set title =?, content=?, files=? where id=? ";
	
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con=DriverManager.getConnection(url,"whdytpq4","1234");
//	Statement st = con.createStatement();
	PreparedStatement st=con.prepareStatement(sql);
    st.setString(1, title);
    st.setString(2, content);
    st.setString(3, files);
    st.setInt(4, id);
    
    int result = st.executeUpdate();
    System.out.println(result);
	
	st.close();
	con.close();
	

	}

}
