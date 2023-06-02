package codingtest_level0;

public class Exercise15 {
	public String solution(String my_string, int k) {
        String answer = "";
        for(int i=0; i<k; i++) {
            answer += my_string;
        }
        return answer;
    }
}