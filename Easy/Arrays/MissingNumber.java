package Easy.Arrays;

class MissingNumber {
    public int missingNumber(int[] nums) {

        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }

        int total = n * (n + 1) / 2;
        int result = total - sum;
        return result;
    }

    public static void main(String[] args) {
        //example input
        int[] nums = { 0, 1, 2, 3, 5 };

        //create object and call method
        MissingNumber obj = new MissingNumber();
        int missingNum = obj.missingNumber(nums);
        System.out.println("Missing Number: " + missingNum);
    }
}


/*

Explanation and Logic to Find the Missing Number:


1. Add all the numbers present in the array.

2. Calculate the expected total sum from 0 to n using the formula:

   n * (n + 1) / 2

3. Subtract the actual sum (from array) from the expected total sum.

4. The difference is the missing number.

 */