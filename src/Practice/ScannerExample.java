// Scanner를 이용해서 이름, 주민번호 앞 6자리, 전화번호를 키보드에서 입력받고 출력하는 코드

package Practice;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		String name = sc.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		int ssn = Integer.parseInt(sc.nextLine());
		
		System.out.print("3. 전화번호: ");
		String tel = sc.nextLine();
		System.out.println();
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(ssn);
		System.out.println(tel);
	}
}