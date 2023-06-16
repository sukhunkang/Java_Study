package codingtest_level0;

class Exercise57 {
    public int[] solution(int n) {
        int[] answer = {};
        
        if(n%2==0) {
            answer = new int[n/2];
        } else {
            answer = new int[(n+1)/2];
        }
        
        for(int i=1; i<=answer.length; i++) {
            answer[i-1]= 2*i-1;    
        }
        return answer;
    }
}