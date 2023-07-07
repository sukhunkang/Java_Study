package codingtest_level0;

class Exercise116 {
    public String solution(String my_string) {
        String answer = "";
        char[] array = my_string.toCharArray();
        for(int i=0; i<array.length; i++) {
            if(Character.isUpperCase(array[i])) {
                answer += my_string.substring(i,i+1).toLowerCase();
            } else{
                answer += my_string.substring(i,i+1).toUpperCase();
            }
        }
        return answer;
    }
}