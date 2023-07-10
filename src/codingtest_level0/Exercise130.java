package codingtest_level0;

class Exercise130 {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        int count=0;
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].contains("ad")) {
                count++;
            }
        }
        answer = new String[strArr.length-count];
        int j=0;
        for(int i=0; i<strArr.length; i++) {
            if( !(strArr[i].contains("ad")) ) {
                answer[j]=strArr[i];
                j++;
            }
        }
        return answer;
    }
}