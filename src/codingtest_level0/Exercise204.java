package codingtest_level0;

class Exercise204 {
    
	
	public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        String[] str = new String[my_string.length()];
      
        for(int i=0; i<my_string.length(); i++) {
            str[i]=my_string.substring(i,i+1);
        } // for
        
        String[] temp = new String[str.length];
       
        for(int i=0; i<str.length; i++) {
            temp[i]=str[i];
        } // for
        
        for(int i=0; i<queries.length; i++) {
            int count=0;
          
            for(int j=queries[i][0]; j<=queries[i][1]; j++) {
                str[j]=temp[queries[i][1]-count];
                count++;
            } // inner for
            
            for(int j=0; j<str.length; j++) {
                temp[j]=str[j];
            } // inner for
            
        } // Outter for
        
        for(int i=0; i<str.length; i++) {
            answer += str[i];
        } // for
        
        return answer;
    } // solution
	
} // end class