package codingtest_level1;

class Exercise51 {
   
	
	public int[] solution(int N, int[] stages) {
        int[] answer = {};
        answer = new int[N];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = i+1;
        } // for
        
        double[] failrate = new double[N];
        int k=0;
        
        for(int i=1; i<=N; i++) {
            int notclear = 0;
            int arrive = 0;
            
            for(int j=0; j<stages.length; j++) {
                
                if(stages[j] == i) {
                    notclear++;
                } // if
                
            } // inner-for
            
            for(int j=0; j<stages.length; j++) {
               
                if(stages[j] >= i) {
                    arrive++;
                } // if
                
            } // inner-for
            
            if(arrive == 0) {
                failrate[k] = 0;
            } else {
                failrate[k] = (double) notclear / arrive;
            } // if-else
            
            k++;
        } // Outter-for

        for(int i=0; i<answer.length-1; i++) {
            
            for(int j=0; j<answer.length-1-i; j++) {
                
                if(failrate[j] < failrate[j+1]) {
                    double tmp = failrate[j];
                    failrate[j] = failrate[j+1];
                    failrate[j+1] = tmp;
                    
                    int temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                    
                } else if(failrate[j] == failrate[j+1]) {
                    
                    if(answer[j] > answer[j+1]) {
                        int temp = answer[j];
                        answer[j] = answer[j+1];
                        answer[j+1] = temp;
                    } // if
                    
                } // Outter if-else
                
            } // inner-for
            
        } // Outter-for
        
        return answer;
    } // solution
	
} // end class

