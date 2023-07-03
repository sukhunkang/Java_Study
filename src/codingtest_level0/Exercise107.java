package codingtest_level0;

class Exercise107 {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer=my_string.replace(letter,"");
        return answer;
    }
}