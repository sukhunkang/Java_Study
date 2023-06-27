package codingtest_level0;

class Exercise86 {
    public int solution(int n, int t) {
        int answer = 0;
        int b = (int) Math.pow(2,t);
        answer = n * b;
        return answer;
    }
}