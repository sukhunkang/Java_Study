// �� ���� ���� �� 0���� ������ '���: ���Ѵ�' �� ����ϰ� ������ ���� ���� �� ����ϴ� �ڵ�

package practice;

import java.util.Scanner;

public class ZeroDivideExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ��: ");
		double num1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("�ι�° ��: ");
		double num2 = Double.parseDouble(sc.nextLine());
		System.out.println("------------------------");
		
		if(num2 != 0) {
			System.out.println("���: " + num1/num2);
		} else {
			System.out.println("���: ���Ѵ�");
		}
	}
}
