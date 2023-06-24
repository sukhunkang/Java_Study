package codingtest_level0;

class Exercise82 {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                count += 1;
            }
        }
        answer = count;
        return answer;
    }
}