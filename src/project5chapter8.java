import java.util.Scanner;

public class project5chapter8 {

    public static void main(String[] args) {

        // 1. Create Scanner
        Scanner input = new Scanner(System.in);
        // 2. Prompt for number of cities (n)
        System.out.print("Enter the number of cities: ");
        int n = input.nextInt();
        // 3. Create a 2D array to store city coordinates: cities[n][2]
        double[][] cities = new double[n][2];
        // 4. Prompt user to enter 2*n numbers (x y x y ...), store them into the array
        System.out.print("Enter the coordinates of the cities: ");
        for (int i = 0; i < n; i++) {
            cities[i][0] = input.nextDouble(); // x
            cities[i][1] = input.nextDouble(); // y
        }
        // 5. Track the best (minimum) total distance:
        //    - minTotalDistance (double)
        //    - centralIndex (int)
        int centralIndex = 0;
        double minTotalDistance = Double.POSITIVE_INFINITY;
        // 6. For each city i:
        //    - compute total distance from city i to all other cities
        //    - if this total is smaller than minTotalDistance:
        //         update minTotalDistance
        //         update centralIndex
        for (int i = 0; i < n; i++) {
            double totalDistance = 0;

            for (int j = 0; j < n; j++) {
                totalDistance += distance(
                        cities[i][0], cities[i][1],
                        cities[j][0], cities[j][1]
                );
            }

            if (totalDistance < minTotalDistance) {
                minTotalDistance = totalDistance;
                centralIndex = i;
            }
        }
        // 7. Print:
        //    - the central city's coordinates
        //    - the total distance
        System.out.printf("The central city is at (%.1f, %.1f)%n",
                cities[centralIndex][0], cities[centralIndex][1]);
        System.out.println("The total distance to all other cities is " + minTotalDistance);

        input.close();
    }

    // Helper method to compute distance between two points
    // distance = sqrt((x1-x2)^2 + (y1-y2)^2)
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;
        return Math.sqrt(dx * dx + dy * dy);
    }
}