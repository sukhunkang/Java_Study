package codingtest_level0;

class Exercise170 {
   
	
	public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.", "--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.", "...","-","..-","...-",".--","-..-", "-.--","--.."};
        String[] array = letter.split(" ");
       
        
        for(int i=0; i<array.length; i++) {
           
        	for(int j=0; j<morse.length; j++) {
               
        		if(array[i].equals(morse[j])) {
                    answer += Character.toString(j+'a');
                } // if
        		
            } // inner-for
        	
        } // Outter-for
        
        return answer;
    } // solution
	
} // end class