package codingtest_level0;

class Exercise115 {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++) {
            if(rsp.substring(i,i+1).equals("0")) {
                answer += "5";
            } else if(rsp.substring(i,i+1).equals("2")) {
                answer += "0";
            } else {
                answer += "2";
            }
        }
        return answer;
    }
}