package codingtest_level0;

class Exercise30 {
    public int Exercise30(int age) {
        // age = 2022- birth_year + 1
        int answer = 0;
        int birth_year = 2022 - age + 1;
        answer = birth_year;
        return answer;
    }
}