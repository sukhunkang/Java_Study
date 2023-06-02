package codingtest_level0;

public class Exercise12 {
	public int solution(int a, int b) {
        int answer = 0;
        int c1 = Integer.parseInt(a + "" + b);
        int c2 = Integer.parseInt(b + "" + a);
        if(c1>=c2) {
            answer = c1;
        } else {
            answer = c2;
        }
        return answer;
    }
}