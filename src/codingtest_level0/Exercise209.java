package codingtest_level0;

class Exercise209 {
   
	
	public int[] solution(int[][] score) {
        int[] answer = {};
        double avg[] = new double[score.length];
        
        for(int i=0; i<avg.length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / (double) 2;
        } // for
        
        answer = new int[score.length];
        
        for(int i=0; i<answer.length; i++) {
            int ranking = 1;
            
            for(int j=0; j<avg.length; j++) {
            
            	if(avg[i]<avg[j]) {
                    ranking++;
                } // if
                
            	answer[i]=ranking;
            } // inner for
            
        } // Outter for 
        
        return answer;
    } // solution
	
} // end class
