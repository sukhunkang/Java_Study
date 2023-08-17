package codingtest_level0;

class Exercise223 {
   
    
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String b : babbling) {
            b = b.replaceFirst("aya", "!");
            b = b.replaceFirst("ye", "!");
            b = b.replaceFirst("woo", "!");
            b = b.replaceFirst("ma", "!");
            
            b = b.replace("!", "");
            
            if(b.equals("")) {
                answer++;
            } // if
            
        } // for
       
        
        return answer;
    } // solution
    
} // end class
