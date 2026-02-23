import java.util.Scanner;

public class project3 {

    // Method to locate the largest element
    public static int[] locateLargest(double[][] a) {

        // 1. Assume first element is the largest
        double largest = a[0][0];
        // 2. Store its row and column
        int row = 0;
        int col = 0;
        // 3. Loop through each row
        for (int i = 0; i < a.length; i++) {
            // 4. Loop through each column inside each row
            for (int j = 0; j < a[i].length; j++) {
                // 5. If current element is larger than current largest:
                if (a[i][j] > largest) {
        //        update largest value
                    largest = a[i][j];
        //        update row index
                    row = i;
        //        update column index
                    col = j;
        // 6. Create int array of size 2
        // 7. Store row and column in array
                    int[] location = new int[2];
                    location[0] = row;
                    location[1] = col;

                    // 8. Return array
                    return location;

    }

    public static void main(String[] args) {

        // 1. Create Scanner
        // 2. Ask user for number of rows and columns
        // 3. Create 2D array with given dimensions
        // 4. Prompt user to enter array values
        // 5. Call locateLargest method
        // 6. Display returned row and column

    }
}
