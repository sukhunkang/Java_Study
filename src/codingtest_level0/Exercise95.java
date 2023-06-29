package codingtest_level0;

class Exercise95 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] array = my_string.toCharArray();
        char[] newarray = new char[index_list.length];
        for(int i=0; i<index_list.length; i++) {
            newarray[i]=array[index_list[i]];
            answer += newarray[i];
        }
        return answer;
    }
}