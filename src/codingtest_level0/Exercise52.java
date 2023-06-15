package codingtest_level0;

class Exercise52 {
    public int solution(int n) {
        int answer = 0;
        if(n%7==0) {
            answer = n/7;
        } else {
            answer = n/7 + 1;
        }
        return answer;
    }
}