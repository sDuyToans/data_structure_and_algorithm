package all_files.recursion.finonacci;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int fib = main.fibonacci(7);
        System.out.println(fib);
    }
    public int fibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
