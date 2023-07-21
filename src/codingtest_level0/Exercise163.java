package codingtest_level0;

class Exercise163 {
    
	
	public int solution(int[] array) {
        int answer = 0;
        String[] newArr = new String[array.length];
       
        
        for(int i=0; i<array.length; i++) {
            newArr[i]=String.valueOf(array[i]);
        } // for
        
        
        for(int i=0; i<newArr.length; i++) {
           
        	for(int j=0; j<newArr[i].length(); j++) {
              
        		if(newArr[i].charAt(j)=='7') {
                    answer++;
                } // if
        		
            } // inner-for
        	
        } // Outter-for
        
        
        
        return answer;
        
    } // solution
	
} // end class