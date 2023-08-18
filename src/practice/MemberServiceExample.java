package practice;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("Login");
			memberService.logout("hong");
		} else {
			System.out.println("id or password is not correct.");
		} // if-else
		
	} // main

} // end class
