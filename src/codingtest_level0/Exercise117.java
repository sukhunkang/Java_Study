package codingtest_level0;

class Exercise117 {
    public String[] solution(String[] names) {
        String[] answer = {};
        int length=0;
        
        if(names.length%5==0) {
            length=names.length/5;
        } else {
            length=names.length/5 + 1;
        }
        
        answer = new String[length];
        int j=0;
        
        for(int i=0; i<names.length; i=i+5) {
            answer[j]=names[i];
            j++;
        }
        
        return answer;
    }
}