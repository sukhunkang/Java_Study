package codingtest_level0;

class Exercise198 {
   
	
	public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        //login
        for(int i=0; i<db.length; i++) {
           
        	if(db[i][0].equals(id_pw[0])) {
               
        		if(db[i][1].equals(id_pw[1])) {
                    answer="login";
                    return answer;
        		} // inner-if
        		
        	} // Outter-if
        	
        } // for
        
        //fail
        int count=0;
        int j=0;
       
        for(int i=0; i<db.length; i++) {
           
        	if(db[i][0].equals(id_pw[0])) {
                count++;
                j=i;
            } // if
        	
        } // for
        
        if(count==0) {
            answer="fail";
            return answer;
        } // if
        
        //wrong pw
        if(!db[j][1].equals(id_pw[1])) {
            answer = "wrong pw";
        } // if
        
        return answer;
    } // solution
	
} // end class