package codingtest_level0;

class Exercise20 {
    public String Exercise20(String str1, String str2) {
        String answer = "";
        for(int i=0; i<str1.length(); i++) {
            answer += str1.substring(i,i+1);
            answer += str2.substring(i,i+1);
        }
        return answer;
    }
}