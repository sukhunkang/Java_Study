package codingtest_level0;

class Exercise67 {
    public int solution(int n) {
        int answer = 0;
        int gcd = 0;
        int lcm = 0;
        for(int i=1; i<=6; i++) {
            if(n%i==0 & 6%i==0) {
                gcd = i;
            }
        }
        
        lcm = 6*n/gcd;
        answer = lcm/6;
        return answer;
    }
}