package codingtest_level0;

class Exercise110 {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] array = my_string.toCharArray();
        
        for(int i=0; i<array.length; i++) {
            for(int j=1; j<=n; j++) {
                answer += array[i];
            }
        }
        return answer;
    }
}