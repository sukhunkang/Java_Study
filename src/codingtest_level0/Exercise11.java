package codingtest_level0;

public class Exercise11 {
	public int solution(int a, int b) {
        int answer = 0;
        
        int oper1 = Integer.parseInt(a + "" + b);
            
        int oper2 = 2 * a * b;
        
        if(oper1>=oper2) {
            answer = oper1;
        } else {
            answer = oper2;
        }
        
        return answer;
    }
}