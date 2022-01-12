package JDBC;

import java.sql.SQLException;

import JDBC.app.console.NoticeConsole;

public class ex1_program5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	NoticeConsole console = new NoticeConsole();
//	int page;
	
	EXIT:while(true) {
		console.printNoticeList();
		int menu=console.inputNoticeMenu();
		
		switch(menu) {
		case 1: //상세조회
			break;
		case 2: //이전
			console.movePreList();
//			page--;
			break;
		case 3: //다음
			console.moveNextList();
//			page++;
			break;
		case 4: //글쓰기
		    break;
		case 5: //검색
			console.inputSearchWord();
		    break;
		case 6: //종료
			System.out.println("Bye~~");
		    break EXIT;
		    default:
		    	System.out.println("<<사용방법>> 메뉴는 1~4까지만 입력할 수 있습니다.");
		    	break;
		}
	  }
	}
}
