package codingtest_level0;

class Exercise40 {
    public int Exercise40(int n) {
        int answer = 2;
        for(int i=1; i<n; i++) {
            if(n == i*i) {
                answer = 1;
            } 
        }
        return answer;
    }
}