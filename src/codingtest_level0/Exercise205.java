package codingtest_level0;

class Exercise205 {
   
	
	public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        int[] dist = new int[numlist.length];
        
        for(int i=0; i<numlist.length; i++) {
            dist[i] = (int) Math.abs(n-numlist[i]);
        }
        
        for(int i=0; i<numlist.length-1; i++) {
           
        	for(int j=0; j<numlist.length-1-i; j++) {
               
        		if(dist[j]>dist[j+1]) {
                    int temp = dist[j];
                    dist[j]=dist[j+1];
                    dist[j+1]=temp;
                    
                    int tmp = numlist[j];
                    numlist[j]=numlist[j+1];
                    numlist[j+1]=tmp;
                } else if(dist[j]==dist[j+1]) {
                   
                	if(numlist[j]<numlist[j+1]) {
                        int tmp = numlist[j];
                        numlist[j]=numlist[j+1];
                        numlist[j+1]=tmp;
                    } // inner if
                	
                } // if-else 
        		
            } // inner for
        	
        } // Outter for
        
        answer = new int[numlist.length];
        
        for(int i=0; i<numlist.length; i++) {
            answer[i]=numlist[i];
        } // for
        
        return answer;
    } // solution
	
} // end class