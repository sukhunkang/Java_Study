package codingtest_level0;

class Exercise21 {
    public int Exercise21(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals(">")) {
            if(eq.equals("=")) {
                answer = (n>=m) ? 1 : 0;
            } else if(eq.equals("!")) {
                answer = (n>m) ? 1 : 0;
            }
        } else if(ineq.equals("<")) {
            if(eq.equals("=")) {
                answer = (n<=m) ? 1 : 0;
            } else if(eq.equals("!")) {
                answer = (n<m) ? 1 : 0;
            }
        }
        return answer;
    }
}