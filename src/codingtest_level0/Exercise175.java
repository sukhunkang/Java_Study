package codingtest_level0;

class Exercise175 {
   
	
	public int solution(int[] num_list) {
        int answer = 0;
       
        
        for(int i=0; i<num_list.length; i++) {
           
        	while(num_list[i]!=1) {
                
        		if(num_list[i]%2==0) {
                    num_list[i]=num_list[i]/2;
                    answer++;
                } else{
                    num_list[i]=(num_list[i]-1)/2;
                    answer++;
                } // if-else
        		
            } // while
        	
        } // for
        
        return answer;
    } // solution
	
} // end class