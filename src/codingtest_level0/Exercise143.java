package codingtest_level0;

class Exercise143 {
   
	
	public int[] solution(String myString) {
        int[] answer = {};
        
        String[] array = myString.split("x",-1);
        
        answer = new int[array.length];
        
        for(int i=0; i<answer.length; i++) {
            answer[i]=array[i].length();
        } // for
        
        return answer;
    } // solution block
	
} // end class