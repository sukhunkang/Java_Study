package codingtest_level0;

class Exercise23 {
    public int Exercise23(int[] num_list) {
        int answer = 0;
        String a = "";
        String b = "";
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                a = a + num_list[i];
            } else {
                b = b + num_list[i];
            }
        }
        answer = Integer.parseInt(a) + Integer.parseInt(b);
        return answer;
    }
}