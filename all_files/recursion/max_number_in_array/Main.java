package all_files.recursion.max_number_in_array;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {30, 1, 20, 60, 70, 10, 40};
        System.out.println(main.maxNumberInArray(arr, arr.length));
    }

    public int maxNumber(int a, int b){
        return Math.max(a, b);
    }

    public int maxNumberInArray(int[] nums, int n) {
        if (n == 1) return nums[0];
        return maxNumber(nums[n - 1], maxNumberInArray(nums, n - 1));
    }
}
