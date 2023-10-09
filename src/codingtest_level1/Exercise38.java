package codingtest_level1;

import java.time.*;


class Exercise38 {
   
	
	public String solution(int a, int b) {
        String answer = "";
      
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int num = dayOfWeek.getValue()-1;
        
        String[] arr = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        
        answer = arr[num];
        return answer;
    } // solution
	
} // end class
