package practice;

import java.util.Scanner;

public class BankingExample {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("--------------------------");
			System.out.print("����> ");
			
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
				case 1:
					System.out.print("���ݾ�> ");
					balance += Integer.parseInt(sc.nextLine());
					break;
				case 2:
					System.out.print("��ݾ�> ");
					balance -= Integer.parseInt(sc.nextLine());
					break;
				case 3:
					System.out.println("�ܰ�> " + balance);
					break;
				case 4:
					run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
