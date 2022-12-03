import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task_1");
        System.out.println();

       int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10;
        }
        array[1] = 0;
        array[99] = 0;
        System.out.println(Arrays.toString(array));

        System.out.println();
        System.out.println("Task_2");

        int[] bigArray = new int[100];
        for (int i = 0; i < array.length; i++) {
            bigArray[i] = i % 10 * 111;

        }
        System.out.println(Arrays.toString(bigArray));



    }
}