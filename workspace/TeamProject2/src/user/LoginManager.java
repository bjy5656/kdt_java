package user;

import java.util.HashMap;
import java.util.Map;

import member.Admin;
import member.Member;

public class LoginManager {
	//필드
	private Map<String, Member> userInfo; // ID, Member
	private Map<String, Admin> adminInfo; // ID, Admin
	
	
	//생성자 
	public LoginManager() {
		this.userInfo = new HashMap<>();
		this.adminInfo = new HashMap<>();
		Admin admin = new Admin();
		this.adminInfo.put(admin.getId(), admin);
		this.userInfo.put(admin.getId(), new Member(null, null, admin.getId(), admin.getPw()));
	}
	
	
	//메소드
	//회원가입 메소드 
	//매개변수:(id, pw, 이름, 전화번호)
	//회원목록에 회원 추가
	public void register(String id, String pw, String name, String phoneNumber) {
		Member member = new Member(name, phoneNumber, id, pw);
		userInfo.put(id, member);
	}
	//로그인 메소드 
	//매개변수:(id, pw)
	//pw 일치하면 관리자 혹은 회원 반환 및 로그인여부 변경
	public User login(String id, String pw) {
		if(adminInfo.containsKey(id) && pw.equals(adminInfo.get(id).getPw())) {
			adminInfo.get(id).setLoggedIn(true);
			return adminInfo.get(id);
		}
		else if(pw.equals(userInfo.get(id).getPw())) {
			userInfo.get(id).setLoggedIn(true);
			return userInfo.get(id);
		}
		return new Member(null, null, null, null);
	}
	//로그아웃 메소드 
	//매개변수:(User)
	//회원의 로그인여부 변경 
	public void logout(User user) {
		user.setLoggedIn(false);
	}
	//toString 재정의
	@Override
	public String toString() {
		return "LoginManager가 시작되었습니다!";
	}
	

	//getter, setter
	public Map<String, Member> getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(Map<String, Member> userInfo) {
		this.userInfo = userInfo;
	}
	public Map<String, Admin> getAdminInfo() {
		return adminInfo;
	}
	public void setAdminInfo(Map<String, Admin> adminInfo) {
		this.adminInfo = adminInfo;
	}
	
	
}
