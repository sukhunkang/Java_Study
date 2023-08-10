package codingtest_level0;

class Exercise211 {
    
	
	public int solution(String A, String B) {
        int answer = 0;
        boolean flag = false;
     
        for(int i=0; i<A.length(); i++) {
            String C="";
        
            for(int j=0; j<A.length(); j++) {
                C += A.charAt( (j + (A.length()-1) *i) % A.length() );
            } // inner for
            
            if(C.equals(B)) {
                flag=true;
                return answer;
            } else {
                answer++;
            } // if-else
            
        } // Outter-for
        
        if(!flag) {
            answer=-1;
        } // if

        return answer;
    } // solution
	
} // end class
