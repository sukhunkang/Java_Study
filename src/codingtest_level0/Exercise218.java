package codingtest_level0;

class Exercise218 {
   
	
	public int[] solution(int num, int total) {
        int[] answer = {};
        int sum = 0;
        int start = 0;
        
        while(sum!=total) {
            sum = 0;
          
            for(int i=start; i<start+num; i++) {
                sum += i;
            } // for
            
            if(sum<total) {
                start++;
            } else if(sum>total) {
                start--;
            } // if-else
            
        } // while
        
        if(total==0) {
            start = -(num-1)/2;
        } // if
        
        answer = new int[num];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = start+i;
        } // for
        
        return answer;
    } // solution
	
} // end class
