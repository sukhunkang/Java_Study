package codingtest_level0;

class Exercise17 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        answer = (flag) ? (a+b) : (a-b);
        return answer;
    }
}