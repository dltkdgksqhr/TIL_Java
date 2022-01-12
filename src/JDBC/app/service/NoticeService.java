package JDBC.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import JDBC.app.entity.Notice;

public class NoticeService {
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String userid="whdytpq4";
	private String pwd = "1234";
	private String driver = "oracle.jdbc.OracleDriver";

	public List<Notice> getlist(int page, String field, String query) throws SQLException, ClassNotFoundException {
		
		int start = 1 + (page-1) * 10; //1, 11 ,21 ,31
		int end =10*page; // 10, 20, 30, 40...
		
		String sql =  "SELECT * FROM NOTICE_VIEW WHERE "+field+" LIKE ? AND NUM BETWEEN ? AND ? ";
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,userid,pwd);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,"%"+query+"%");
		st.setInt(2, start);
		st.setInt(3, end);
		ResultSet rs = st.executeQuery();
		
		List<Notice> list = new ArrayList<Notice>();
		
		while(rs.next()) {
		
		int id =rs.getInt("ID");
		String title = rs.getString("TITLE");
		String wirterId=rs.getString("WRITER_ID");
		Date regDate = rs.getDate("REGDATE");
		String content = rs.getString("CONTENT");
		int hit = rs.getInt("hit");
		
		
		Notice notice = new Notice(
				id,
				title,
				wirterId,
				regDate,
				content,
				hit	
				
				); //순서는 정확하게!
		
		list.add(notice);
		}
		rs.close();
		st.close();
		con.close();
		
		return list;

	}
	
	// Scalar
		public int getCount() throws SQLException, ClassNotFoundException {
			  int count = 0;
		        String sql = "SELECT COUNT(ID) COUNT FROM NOTICE";

		        Class.forName(driver);
		        Connection con = DriverManager.getConnection(url, userid, pwd);
		        Statement st = con.createStatement();
		        ResultSet rs = st.executeQuery(sql);
		        if (rs.next()) {
		            count = rs.getInt("COUNT");
		        }
		        rs.close();
		        st.close();
		        con.close();

		        return count;
			
		}

	public int insert(Notice notice) throws ClassNotFoundException, SQLException {
		String title = notice.getTitle();	
		String writerId = notice.getWirterId();	
		String content = notice.getContent();	
		
			
		String sql = "INSERT INTO notice (" +
				"title, writer_id, content)" +
			    "VALUES (?,?,?)";
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,userid,pwd);
//		Statement st = con.createStatement();
		PreparedStatement st=con.prepareStatement(sql);
	    st.setString(1, title);
	    st.setString(2, writerId);
	    st.setString(3, content);
	    
	    
	    int result = st.executeUpdate();

		
		st.close();
		con.close();
		
		return result;
	}
	
	public int update(Notice notice) throws SQLException, ClassNotFoundException {
		String title = notice.getTitle();	
		String content = notice.getContent();	
			
		int id = notice.getId();	
			
		
		String sql = "update notice set title =?, content=? where id=? ";
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,userid,pwd);
//		Statement st = con.createStatement();
		PreparedStatement st=con.prepareStatement(sql);
	    st.setString(1, title);
	    st.setString(2, content);
	    st.setInt(3, id);
	    
	    
	    int result = st.executeUpdate();
	
		
		st.close();
		con.close();
		return result;
	}
	
	public int delete(int id) throws ClassNotFoundException, SQLException {
		
		
		
		String sql = "delete notice where id=? ";
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,userid,pwd);
		PreparedStatement st=con.prepareStatement(sql);
	    st.setInt(1, id);
	    
	    int result = st.executeUpdate();
	    System.out.println(result);
		
		st.close();
		con.close();
		
		return result;
	}

	
}
