package test;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DBConnecter;
import dao.UserDAO;
import dto.UserDTO;

public class Test {
   public static void main(String[] args) {

      // 연결테스트
      try {
         Connection conn = DBConnecter.getConnection();
         conn.close();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      UserDAO userDAO = new UserDAO();
      UserDTO userDTO = new UserDTO();

      userDTO.setUserId("aaa");
      userDTO.setUserPw("1234");
      userDTO.setUserName("홍길동");
      userDTO.setUserAge(20);
      userDTO.setUserGender("M");
      userDTO.setUserBirth("20000101");
//      System.out.println(userDTO);
      
      //회원가입
//      userDAO.join(userDTO);
      
      //로그인
//      System.out.println(userDAO.login("aaa", "1234"));

      // 아이디 중복 검사
//      System.out.println(userDAO.checkId(userDTO.getUserId()));
//      System.out.println(userDAO.checkId("abc"));
      
      //사용자 아이디 찾기
//      List<String> userIds = userDAO.findId("유리", "2017-01-01");
//      userIds.forEach(System.out::println); //스트림API사용
      
      //회원정보 전체 수정
//      userDTO.setUserId("updateTest");
//      userDTO.setUserPw("123123");
//      userDTO.setUserName("test");
//      userDTO.setUserAge(20);
//      userDTO.setUserBirth("19990901");
//      userDTO.setUserNumber(7);
//      userDAO.update(userDTO);

   }
}