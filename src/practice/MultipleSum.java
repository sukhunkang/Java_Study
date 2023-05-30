package practice;

public class MultipleSum {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			if( (i%7) ==0 ) {
				sum += i;
			}
		}
		System.out.println("1부터 1000까지 7의 배수의 총합: " + sum);
	}
}
