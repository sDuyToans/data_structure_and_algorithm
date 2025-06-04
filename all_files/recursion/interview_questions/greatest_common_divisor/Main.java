package all_files.recursion.interview_questions.greatest_common_divisor;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int res = main.greatest_common_divisor(8, 4);
        System.out.println(res);
    }

    public int greatest_common_divisor(int p, int q) {
        if (p < 0 || q < 0) return -1;
        if (q == 0){
            return p;
        }
        return greatest_common_divisor(q, p % q);
    }
}
