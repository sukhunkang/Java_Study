package codingtest_level0;

class Exercise54 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        int numer3 = numer1*denom2 + numer2*denom1;
        int denom3 = denom1*denom2;
        
        for(int i=numer3; i>=1; i--) {
            if(numer3%i==0 & denom3%i==0) {
                numer3 /= i;
                denom3 /= i;
            }
        }
        
        answer = new int[2];
        answer[0] = numer3;
        answer[1] = denom3;
        return answer;
    }
}