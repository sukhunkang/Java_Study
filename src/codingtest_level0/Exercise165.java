package codingtest_level0;

class Exercise165 {
   
	
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        
        for(int i=0; i<queries.length; i++) {
          
        	for(int j=queries[i][0]; j<=queries[i][1]; j++) {
               
        		if( j%queries[i][2]  == 0 && j!=0) {
                    arr[j]++;
                } else if(j==0) {
                    arr[j]++;
                } // if-else
        		
            } // inner-for
        	
        } // Outter-for
        
        answer=arr;
        return answer;
        
    } // solution
	
} // end class