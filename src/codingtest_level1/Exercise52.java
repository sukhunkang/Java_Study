package codingtest_level1;

class Exercise52 {
   
    
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = new int[2];
        
        int count = 0;
        int max = 0;
        int min = 0;
        int unknown = 0;
        
        
        for(int i=0; i<lottos.length; i++) {
            
            if(lottos[i] != 0 && (lottos[i] == win_nums[0] || lottos[i] == win_nums[1]
                || lottos[i] == win_nums[2] || lottos[i] == win_nums[3]
                || lottos[i] == win_nums[4] || lottos[i] == win_nums[5])) {
                count++;
            } // if
            
        } // for
        
        
        for(int i=0; i<lottos.length; i++) {
           
            if(lottos[i] == 0) {
                unknown++;
            } // if
            
        } // for
        
        max = unknown + count;
        min = count;
        
        if(max >= 6) {
            answer[0] = 1;
        } else if(max >= 5) {
            answer[0] = 2;
        } else if(max >= 4) {
            answer[0] = 3;
        } else if(max >= 3) {
            answer[0] = 4;
        } else if(max >= 2) {
            answer[0] = 5;
        } else {
            answer[0] = 6;
        } // if-else
        
        
        if(min >= 6) {
            answer[1] = 1;
        } else if(min >= 5) {
            answer[1] = 2;
        } else if(min >= 4) {
            answer[1] = 3;
        } else if(min >= 3) {
            answer[1] = 4;
        } else if(min >= 2) {
            answer[1] = 5;
        } else {
            answer[1] = 6;
        } // if-else
          
        return answer;
    } // solution
    
} // end class