package codingtest_level0;

class Exercise85 {
    public int solution(int hp) {
        int answer = 0;
        int a; int b; int c;
        a=hp/5;
        b=(hp-5*a)/3;
        c=hp-5*a-3*b;
        answer=a+b+c;
        return answer;
    }
}