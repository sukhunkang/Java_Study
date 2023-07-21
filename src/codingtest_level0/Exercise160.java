package codingtest_level0;

class Exercise160 {
    
	
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[arr.length];
        
        for(int i=0; i<queries.length; i++) {
          
        	for(int j=0; j<arr.length; j++) {
              
        		if(j>=queries[i][0] && j<=queries[i][1]) {
                    arr[j]=arr[j]+1;
                } // if   
        		
            } // inner-for
        	
        } // Outter-for
        
        answer=arr;
        
        return answer;
        
    } // solution
	
} // end class