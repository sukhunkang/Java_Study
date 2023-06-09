package codingtest_level0;

class Exercise37 {
    public int[] Exercise37(int money) {
        int[] answer = {};
        int cup_num = money/5500;
        int money_left = money%5500;
        answer = new int[2];
        answer[0] = cup_num;
        answer[1] = money_left;
        return answer;
    }
}