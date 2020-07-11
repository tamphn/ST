package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] myInt = getIntegers(5);
        for(int i = 0; i < myInt.length;i++) {
            System.out.println("Element " + i + ", typed value was 12" +
                    "" + myInt[i]);
        }
        System.out.println("The average is " + getAverage(myInt));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer value. \r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }
}
