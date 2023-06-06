package codingtest_level0;

class Exercise25 {
    public int Exercise25(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i=0; i<included.length; i++) {
            if(included[i]) {
                answer += a+i*d;
            } 
        }
        return answer;
    }
}