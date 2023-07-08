package codingtest_level0;

class Exercise119 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] array = my_string.toCharArray();
        char temp;
        temp=array[num1];
        array[num1]=array[num2];
        array[num2]=temp;
        
        for(int i=0; i<array.length; i++) {
            answer += array[i];
        }
        
        return answer;
    }
}