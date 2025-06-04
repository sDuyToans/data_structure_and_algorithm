package all_files.recursion.interview_questions.decimal_to_binary;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int res = main.decimalToBinary(-20);
        System.out.println(res);
    }

    public int decimalToBinary(int num) {
        if (num == 0) return 0;
        return num % 2 + 10 * decimalToBinary(num / 2);
    }
}
