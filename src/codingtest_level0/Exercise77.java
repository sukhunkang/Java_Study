package codingtest_level0;

class Exercise77 {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str2.indexOf(str1) == -1) {
            answer = 0;
        } else {
            answer = 1;
        }
        return answer;
    }
}