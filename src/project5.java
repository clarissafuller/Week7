import java.util.Scanner;

public class project5 {

    // Method to check if array is sorted
    public static boolean isSorted(int[] list) {

        // Loop through array starting at index 1
        for (int i = 1; i < list.length; i++) {
        // Compare current element with previous element
            if (list[i] < list[i - 1]) {
        // If current element is smaller than previous return false immediately
                return false;
            }
        // If loop finishes without finding a problem,
        }

        return true;
        // return true

    }

    public static void main(String[] args) {

        // 1. Create Scanner
        Scanner input = new Scanner(System.in);
        // 2. Ask user for size of list
        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();
        // 3. Create array of that size
        int[] list = new int[size];
        // 4. Prompt user to enter elements
        System.out.print("Enter the content of the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        // 5. Print the list back to the user
        System.out.print("The list has " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        // 6. Call isSorted method
        if (isSorted(list)) {
            System.out.println("The list is already sorted");
        // 7. Display whether list is sorted or not
        } else {
            System.out.println("The list is not sorted");
        }

        input.close();
    }
}