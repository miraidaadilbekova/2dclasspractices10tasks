public class task2 {
    public static void task2(String[] args) {
        int[] nums = {3, 4, -5, 0, 6, 7, 1, 2, -7, -4};
        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        System.out.println("Sum: " + sum);
    }
}