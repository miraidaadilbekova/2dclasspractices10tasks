public class task8 {
    public static void task8(String[] args) {
        int[] temperatures = { 16, 15, 34, 12, 10, 6, 5};
        int sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        double average = (double) sum / temperatures.length;
        int above = 0;
        for (int temp : temperatures) {
            if (temp > average) {
                above++;
            }
        }
        System.out.println("Average: " + average + ", above: " + above);
    }
}
