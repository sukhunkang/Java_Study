package codingtest_level0;

class Exercise219 {
   
    
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] count = new int[200];
        
        for(int i=0; i<lines.length; i++) {
            
            for(int j=lines[i][0]+100; j<lines[i][1]+100; j++) {
                count[j]++;
            } // inner-for
            
        } // Outter-for
        
        for(int i=0; i<200; i++) {
           
            if(count[i] >= 2) {
                answer++;
            } // if
            
        } // for
        
        return answer;
    } // solution
    
} // end class