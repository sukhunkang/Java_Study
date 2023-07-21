package codingtest_level0;

class Exercise162 {
    
	
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        
        for(int i=0; i<queries.length; i++) {
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        } // for
        
        
        answer=arr;
        return answer;
        
    } // solution
	
} // end class