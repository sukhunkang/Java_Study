package codingtest_level0;

class Exercise145 {
   
	
	public int solution(int[] numbers) {
        int answer = -1000000000;
        int l = numbers.length;
       
        for(int i=0; i<l; i++) {
            
        	for(int j=0; j<l; j++) {
                
        		if(i!=j && numbers[i]*numbers[j]>=answer) {
                    answer=numbers[i]*numbers[j];
                } // if
        		
            } // inner-for
        	
        } // Outter-for
        
        return answer;
    } // solution block
	
} // end class