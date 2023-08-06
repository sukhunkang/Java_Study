package codingtest_level0;

class Exercise199 {
    
	
	public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int a = arr.length;
        int b = arr[0].length;
        
        if(a==b) {
            answer=arr;
        } else if(a>b) {
            answer = new int[a][a];
            
            for(int i=0; i<a; i++) {
                
            	for(int j=0; j<b; j++) {
                    answer[i][j]=arr[i][j];
                } // inner-for
            	
            } // Outter-for
            
        } else{
            answer = new int[b][b];
            
            for(int i=0; i<a; i++) {
               
            	for(int j=0; j<b; j++) {
                    answer[i][j]=arr[i][j];
                } // inner-for
            	
            } // Outter-for
            
        } // if-else

        return answer;
    } // solution
	
} // end class