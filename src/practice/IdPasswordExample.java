// 아이디가 math이고 패스워드가 9876이면 로그인 성공, 그렇지 않으면 로그인 실패를 출력하는 코드

package practice;

import java.util.Scanner;

public class IdPasswordExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = sc.nextLine();
		
		System.out.print("패스워드: ");
		int password = Integer.parseInt(sc.nextLine());
		
		if(id.equals("math")) {
			if(password == 9876) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패: 아이디 존재하지 않음");
		}
	}
}
