package bookDTO;

import java.sql.Connection;
import java.sql.SQLException;

import functionDAO.DBConnecter;

public class Test {
	public static void main(String[] args) {
		
      try {
         Connection conn = DBConnecter.getConnection();
         conn.close();
      } catch (SQLException e) {
    	  System.out.println("연결실패");
         e.printStackTrace();
      }
		
	}
}
