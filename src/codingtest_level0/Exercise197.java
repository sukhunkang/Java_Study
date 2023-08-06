package codingtest_level0;

class Exercise197 {
   
	
	public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for(int i=0; i<dic.length; i++) {
            int count=0;
           
            for(int j=0; j<spell.length; j++) {
                
            	if(dic[i].contains(spell[j])) {
                    count++;
                } // if
            	
            } // inner-for
            
            if(count==spell.length) {
                answer = 1;
                return answer;
            } // if
            
        } // Outter-for
                  
        return answer;
    } // solution
	
} // end class