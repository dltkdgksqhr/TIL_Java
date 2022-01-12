package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class ex1_program4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

	int id =256 ;	
		
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String sql = "delete notice where id=? ";
	
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con=DriverManager.getConnection(url,"whdytpq4","1234");
	PreparedStatement st=con.prepareStatement(sql);
    st.setInt(1, id);
    
    int result = st.executeUpdate();
    System.out.println(result);
	
	st.close();
	con.close();
	

	}

}
