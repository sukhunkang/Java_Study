package codingtest_level0;

class Exercise176 {
    
	
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[queries.length];
        
        
        for(int i=0; i<queries.length; i++) {
            int min = 10000000;
           
            for(int j=queries[i][0]; j<=queries[i][1]; j++) {
               
            	if(arr[j]>queries[i][2] && arr[j]<min) {
                    min=arr[j];
                } // if
            	
            } // inner-for
            
            if(min!=10000000) {
                answer[i]=min;
            } else {
                answer[i]=-1;
            } // if-else
            
        } // Outter-for
       
        return answer;
    } // solution
	
} // end class