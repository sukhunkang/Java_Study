package codingtest_level1;

class Exercise44 {
   
	
	public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0; i<nums.length; i++) {
          
        	for(int j=i+1; j<nums.length; j++) {
              
        		for(int k=j+1; k<nums.length; k++) {
                    int a = nums[i]+nums[j]+nums[k];
                    int count = 0;
                  
                    for(int l=1; l<=a; l++) {
                       
                    	if(a%l==0) {
                            count++;
                        } // if
                    	
                    } // 1st for
                    
                    if(count==2) {
                        answer++;
                    } // if
                    
                } // 2nd for
        		
            } // 3rd for
        	
        } // 4th for
        
        return answer;
    } // solution
	
} // end class
