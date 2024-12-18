package Easy.Arrays;

public class TwoSum {

    // Make the twoSum method static
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // j starts from i + 1
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // If no solution is found
        return new int[] {};
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        
        // Call the twoSum method directly since it's static
        int[] result = twoSum(nums, target);

        // Print the result
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}

