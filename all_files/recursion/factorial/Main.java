package all_files.recursion.factorial;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        var rec = main.factorial(-5);
        System.out.println(rec);
    }

    public int factorial(int n){
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
