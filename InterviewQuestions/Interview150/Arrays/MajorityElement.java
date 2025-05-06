
package Leetcode.InterviewQuestions.Interview150.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
       for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if(candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}


// | Index | Value | Candidate | Count | Explanation                               |
// | ----- | ----- | --------- | ----- | ----------------------------------------- |
// | 0     | 2     | 2         | 1     | count was 0, pick 2 as candidate, count++ |
// | 1     | 2     | 2         | 2     | same as candidate, count++                |
// | 2     | 1     | 2         | 1     | different, count--                        |
// | 3     | 1     | 2         | 0     | different, count--                        |
// | 4     | 1     | 1         | 1     | count is 0, pick new candidate 1, count++ |
// | 5     | 2     | 1         | 0     | different, count--                        |
// | 6     | 2     | 2         | 1     | count is 0, pick new candidate 2, count++ |
