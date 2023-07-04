package codingtest_level0;

class Exercise112 {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] array = cipher.toCharArray();
        int length = array.length/code;
        for(int i=1; i<=length; i++) {
            answer += array[code*i-1];
        }
        return answer;
    }
}