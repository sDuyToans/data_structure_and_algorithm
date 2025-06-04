package all_files.recursion.interview_questions.sum_of_positive_digit;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int res = main.sumOfDigits(8675);
        System.out.println(res);
    }

    public int sumOfDigits(int n) {
        if (n <  0 ) return - 1;
        if (n < 10) return n;
        return n % 10 + sumOfDigits(n / 10);
    }
}
