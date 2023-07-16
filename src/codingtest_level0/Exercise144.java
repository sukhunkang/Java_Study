package codingtest_level0;

class Exercise144 {
    
	
	public String solution(int age) {
        String answer = "";
        char[] array = {'a','b','c','d','e','f','g','h','i','j'};
        String temp = age + "";
        
        for(int i=0; i<temp.length(); i++) {
            answer += array[Integer.parseInt(temp.substring(i,i+1))];
        } // for
        
        return answer;
    } // solution block
	
} // end class