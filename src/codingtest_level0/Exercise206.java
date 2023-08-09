package codingtest_level0;

class Exercise206 {
   
	
	public int solution(int[] common) {
        int answer = 0;
        
        int diff_1 = common[1]-common[0];
        int diff_2 = common[2]-common[1];
        
        if(diff_1==diff_2) {
            answer = common[common.length-1] + diff_1;
            return answer;
        } // if
        
        int ratio_1 = common[1]/common[0];
        int ratio_2 = common[2]/common[1];
        
        if(ratio_1==ratio_2) {
            answer = common[common.length-1]*ratio_1;
        } // if
        
        
        return answer;
    } // solution
	
} // end class