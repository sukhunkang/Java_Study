package codingtest_level0;

class Exercise88 {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString=myString.toLowerCase();
        pat=pat.toLowerCase();
        if(myString.indexOf(pat) != -1) {
            answer=1;
        } else {
            answer=0;
        }
        return answer;
    }
}