package codingtest_level0;

class Exercise136 {
    public int solution(int num, int k) {
        int answer = 0;
        String num2 = num + "";
        String k2 = String.valueOf(k);
        
        answer=-1;
        for(int i=0; i<num2.length(); i++) {
            if( num2.substring(i,i+1).equals(k2) ) {
                answer=i+1;
                break;
            } 
        }
        return answer;
    }
}