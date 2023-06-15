package codingtest_level0;

class Exercise50 {
    public int Exercise50(int n) {
        int answer = 0;
        int sum=0;
        for(int i=0; i<=n; i++) {
            if(i%2==0) {
                sum += i;
            }
        }
        answer = sum;
        return answer;
    }
}