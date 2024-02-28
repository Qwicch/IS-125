import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem_8_1 {
    public static void main(String[] args) {
        printConsole();

    }

    public static double[][] getArray() {
        //Create a scanner
        Scanner scanner = new Scanner(System.in);

        //Enter Array values 3 by 4
        double[][] array = new double[3][4];
        System.out.println("Enter " + array.length + " rows and "
        + array[0].length + " columns: ");

        System.out.println("-".repeat(30));
        System.out.println("""
                             1 2 3 4
                Example:     1 2 3 4
                             1 2 3 4""");
        System.out.println("-".repeat(30));

        try {
            for (int row = 0; row < array.length; row++) {
                System.out.print("->  ");
                for (int column = 0; column < array[row].length; column++) {
                    array[row][column] = scanner.nextDouble();
                }
            }
            return array;
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input.");
        }
        return array;
    }

    public static double[] sumByColumn(double [][] array){

        // Replace it with the size of maximum length inner array
        int size = array[0].length;
        double[] sum = new double[size];

        for (double[] doubles : array) {
            for (int j = 0; j < doubles.length; j++) {
                sum[j] += doubles[j];
            }
        }
        return sum;
    }

    public static void printArray (double[] array) {
        System.out.println("-".repeat(30));
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sum of the elements at column " + i + " is: " + array[i]);
        }
        System.out.println("-".repeat(30));
    }

    public static void printConsole() {
        boolean answer = true;

        while(answer) {
            double[][] array = getArray();
            double[] sumArray = sumByColumn(array);
            printArray(sumArray);

            System.out.println("Would you like to try again? True/False\n");
            System.out.print("->  ");
            Scanner scanner = new Scanner(System.in);
            try {
                answer = scanner.nextBoolean();
                System.out.println("-".repeat(30));
                if (!answer) {
                    System.out.println("Thank you for using. Will you use me next time Yes/No?(╥﹏╥)");
                    System.out.println("-".repeat(30));

                    String finalAnswer = scanner.next().toLowerCase();
                    if (finalAnswer.equals("yes")) {
                        System.out.println("-".repeat(30));
                        System.out.println("Thank you, see you later! | (• ◡•)|");
                        System.out.println("-".repeat(30));
                    } else if (finalAnswer.equals("no")) {
                        System.out.println("-".repeat(30));
                        System.out.println("""
                                    (()__(()
                                     /       \\\s
                                    ( /    \\  \\
                                     \\ o o    /
                                     (_()_)__/ \\            \s
                                    / _,==.____ \\
                                   (   |--|      )
                                   /\\_.|__|'-.__/\\_
                                  / (        /     \\\s
                                  \\  \\      (      /
                                   )  '._____)    /   \s
                                (((____.--(((____/""");
                        System.out.println("-".repeat(30));
                    } else {
                        System.out.println("-".repeat(30));
                        System.out.println("Invalid input.");
                        System.out.println("-".repeat(30));
                    }
                }


            } catch (InputMismatchException exception) {
                System.out.println("-".repeat(30));
                System.out.println("Invalid input. Try Again.");
                System.out.println("-".repeat(30));
            }
        }

    }
}