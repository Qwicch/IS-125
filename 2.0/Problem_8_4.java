public class Problem_8_4 {
    public static void main(String[] args) {
        final String[] nameArray = {
                "Mike", "John", "Jake", "Kira", "Stephen", "Alexei", "Rasputin", "Stalin"};
        final int[] totalHoursArray = getSum();

        System.out.println("BEFORE:" + "\n" + "-".repeat(35));
        printArray(totalHoursArray, nameArray);
        System.out.println("-".repeat(35) + "\n");
        sort(totalHoursArray, nameArray);
        System.out.println("AFTER:" + "\n" + "-".repeat(35));
        printArray(totalHoursArray, nameArray);
        System.out.println("-".repeat(35));
    }
    
    private static int[] getSum() {
        final int[][] matrix = {
                {2, 4, 3, 4, 5, 8, 8}, // 34 hours
                {7, 3, 4, 3, 3, 4, 4}, // 28 hours
                {3, 3, 4, 3, 3, 2, 2}, // 20 hours
                {9, 3, 4, 7, 3, 4, 1}, // 31 hours
                {3, 5, 4, 3, 6, 3, 8}, // 32 hours
                {3, 4, 4, 6, 3, 4, 4}, // 28 hours
                {3, 7, 4, 8, 3, 8, 4}, // 37 hours
                {6, 3, 5, 9, 2, 7, 9}  // 41 hours
        };
        return sumByRowMatrix(matrix, matrix.length);
    }

    public static int[] sumByRowMatrix(int[][] matrix, int length) {
        int[] sumArray = new int[length];
        for (int row = 0; row < matrix.length; row++) {
            int total = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
            sumArray[row] = total;
        }
        return sumArray;
    }

    public static void sort(int[] array, String[] nameArray) {
        int n = array.length;

        // One by one move boundary of unsorted sub array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;

            for (int j = i + 1; j < n; j++)
                if (array[j] > array[min_idx])
                    min_idx = j;
            // Swap the found minimum element with the first

            // element
            String stringTemp = nameArray[min_idx];
            int temp = array[min_idx];

            array[min_idx] = array[i];
            nameArray[min_idx] = nameArray[i];

            array[i] = temp;
            nameArray[i] = stringTemp;

        }
    }

    public static void printArray(int[] array, String[] nameArray) {
        for (int i = 0; i < array.length; ++i)
            System.out.printf("%-10s total hours is: %-4d%n", nameArray[i], array[i]);
    }
}
