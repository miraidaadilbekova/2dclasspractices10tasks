public class task4 {
    public static void task4(String[] args) {
        int[] nums = {9, 2, 1, 6, 7,3, 8};
        int min = nums[0];
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }
        System.out.println("Min: " + min + ", index: " + minIndex);
    }
}
