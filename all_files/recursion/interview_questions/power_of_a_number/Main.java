package all_files.recursion.interview_questions.power_of_a_number;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int res = main.powerOfNumber(2, 9);
        System.out.println(res);
    }

    public int powerOfNumber(int n, int p) {
        if (p == 1) return n;
        if (p == 0) return 1;
        return n * powerOfNumber(n, p - 1);
    }
}
