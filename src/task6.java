public class task6 {
    public static void task6(String[] args) {
        int[] arr = {7, 8, 6 ,4,5 ,2, 1, 9};
        int first = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > first) {
                count++;
            }
        }
        System.out.print("Count: " + count);
    }
}
