package practice;

public class MemberService {

	boolean login(String id, String password) {
		
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		} // if-else
		
	} // login
	
	void logout(String id) {
		System.out.println("Logout");
	} // logout
	
} // end class
