// ���̵� math�̰� �н����尡 9876�̸� �α��� ����, �׷��� ������ �α��� ���и� ����ϴ� �ڵ�

package practice;

import java.util.Scanner;

public class IdPasswordExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵�: ");
		String id = sc.nextLine();
		
		System.out.print("�н�����: ");
		int password = Integer.parseInt(sc.nextLine());
		
		if(id.equals("math")) {
			if(password == 9876) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����: �н����尡 Ʋ��");
			}
		} else {
			System.out.println("�α��� ����: ���̵� �������� ����");
		}
	}
}
