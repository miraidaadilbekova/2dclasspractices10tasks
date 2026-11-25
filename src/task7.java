public class task7 {
    public static void task7(String[] args) {
        int[] arr = {45, 56, 67, 1, 2,34, 67, 89};
        int[] evenNums = new int[arr.length];
        int count = 0;
        for (int num : arr){
            if (num % 2 == 0) {
                evenNums[count] = num;
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print("Even numbers: " + " ");
        }
    }
}
