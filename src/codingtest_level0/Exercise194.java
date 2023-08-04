package codingtest_level0;

class Exercise194 {
    
	
	public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[31];
        
        for(int i=0; i<strArr.length; i++) {
           
        	for(int j=0; j<=30; j++) {
               
        		if(strArr[i].length()==j) {
                    arr[j]++;
                } // if
        		
            } // inner-for  
        	
        } // Outter-for
        
        for(int i=0; i<arr.length; i++) {
         
        	if(answer<arr[i]) {
               answer=arr[i];
           } // if
        	
        } // for
    
        return answer;
    } // solution
	
} // end class