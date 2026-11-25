public class task3 {
    public static void task3(String[] args) {
        int[] arr = {2, 13, 5, 67, 3, 56, 7, 8};
        int count = 0;
        for (int num : arr) {
            if (num >= 10 && num <= 20) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
