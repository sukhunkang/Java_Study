// 두 수를 나눌 때 0으로 나누면 '결과: 무한대' 를 출력하고 나머지 경우는 나눈 값 출력하는 코드

package practice;

import java.util.Scanner;

public class ZeroDivideExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		double num1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("두번째 수: ");
		double num2 = Double.parseDouble(sc.nextLine());
		System.out.println("------------------------");
		
		if(num2 != 0) {
			System.out.println("결과: " + num1/num2);
		} else {
			System.out.println("결과: 무한대");
		}
	}
}
