package codingtest_level0;

class Exercise93 {
    public int solution(String my_string, String target) {
        int answer = 0;
        if(my_string.indexOf(target) != -1) {
            answer=1;
        } else {
            answer=0;
        }
        return answer;
    }
}