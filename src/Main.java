public class Main{
    public static void main(String[] args){
        int[] numbers = {3, 4, 6, 7, 8, 1, 9, 5};
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}