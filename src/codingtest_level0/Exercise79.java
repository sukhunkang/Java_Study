package codingtest_level0;

class Exercise79 {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        answer = new String[strArr.length];
        for(int i=1; i<strArr.length; i=i+2) {
            answer[i]=strArr[i].toUpperCase();
        }
        for(int i=0; i<strArr.length; i=i+2) {
            answer[i]=strArr[i].toLowerCase();
        }
        return answer;
    }
}