package codingtest_level0;

class Exercise100 {
    public String solution(String my_string) {
        String answer = "";
        char[] myarray = my_string.toCharArray();
        char[] array = new char[my_string.length()];
        for(int i=0; i<array.length; i++) {
            array[i]=myarray[my_string.length()-(i+1)];
            answer += array[i];
        }
        return answer;
    }
}