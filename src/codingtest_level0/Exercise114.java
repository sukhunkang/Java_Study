package codingtest_level0;

class Exercise114 {
    public int solution(int n) {
        int answer = 0;
        int factorial=1;
        for(int i=1; i<=n; i++) {
            factorial *= i;
            if(n>=factorial) {
                answer=i;
            } else {
                break;
            }
        }
        return answer;
    }
}