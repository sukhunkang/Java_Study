// 1400에서 백의 자리 이하를 버리는 코드

package practice;

public class RoundDownExample {
	public static void main(String[] args) {
		int value = 1400;
		System.out.println((value/1000)*1000);
	}
}