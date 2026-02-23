import java.util.Arrays;

public class discussion {
    public static void main(String[] args) {

        // 1) single dimension array
        // A 1D array is a "straight line" of values:
        // one set of brackets [] means you index with ONE number: arr[i]
        // example use-case: a week of daily water intake in ounces.
        int[] waterOzByDay = {64, 80, 72, 60, 90, 70, 68};

        System.out.println("1D array (water per day): " + Arrays.toString(waterOzByDay));
        System.out.println("Wednesday water (index 2): " + waterOzByDay[2] + " oz");

        // 2) multidimensional array (2D)
        // A multidimensional array uses multiple bracket pairs like [][].
        // In Java, a 2D array is actually an "array of arrays":
        // The first index chooses the row (which sub-array)
        // The second index chooses the element inside that row
        // So you index with 2 numbers: grid[row][col]
        //
        // Example use-case: a simple content plan:
        // rows = days, columns = platforms (0=TikTok, 1=YouTube, 2=Instagram)
        String[][] contentPlan = {
                {"Recipe teaser", "Long-form vlog", "Behind-the-scenes"},
                {"Grocery haul", "Short (15 sec)", "Carousel photos"},
                {"Knife skills", "No post", "Story Q&A"},
                {"Leftovers remix", "Short (before/after)", "Reel"},
                {"Date-night dinner", "Long-form cook", "Thumbnail test"},
                {"Farmers market", "No post", "Aesthetic stills"},
                {"Meal prep", "Weekly recap", "Pinned comment prompts"}
        };

        System.out.println("\n2D array (content plan):");
        for (int day = 0; day < contentPlan.length; day++) {
            // contentPlan.length = number of rows (days)
            System.out.println("Day " + day + " plan: " + Arrays.toString(contentPlan[day]));
        }

        // Example of accessing a specific "cell":
        System.out.println("\nFriday TikTok idea (day 4, platform 0): " + contentPlan[4][0]);
    }
}

