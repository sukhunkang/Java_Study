// Scanner�� �̿��ؼ� �̸�, �ֹι�ȣ �� 6�ڸ�, ��ȭ��ȣ�� Ű���忡�� �Է¹ް� ����ϴ� �ڵ�

package Practice;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[�ʼ� ���� �Է�]");
		
		System.out.print("1. �̸�: ");
		String name = sc.nextLine();
		
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		int ssn = Integer.parseInt(sc.nextLine());
		
		System.out.print("3. ��ȭ��ȣ: ");
		String tel = sc.nextLine();
		System.out.println();
		
		System.out.println("[�Է��� ����]");
		System.out.println(name);
		System.out.println(ssn);
		System.out.println(tel);
	}
}