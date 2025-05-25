package InterviewQuestions.Interview150.Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        //check if input is null or empty
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        //sort the array

        Arrays.sort(strs);

        //get the first and last String i.e club and clove
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        //start comparing character by character
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // example input
        String[] strs = { "flow", "fl", "flower", "flow", "flower" };

        // create object and call method
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String commonPrefix = obj.longestCommonPrefix(strs);

        // print result
        System.out.println("Longest Common Prefix: " + commonPrefix);
    }
}

/*


Check if the input array is null or empty.

Sort the input array strs lexicographically using Arrays.sort(strs).

Take the first string in the sorted array, call it first.

Take the last string in the sorted array, call it last.

Convert both first and last to character arrays.

Create an empty StringBuilder called result.

For each index i from 0 to length of first - 1, do:

Compare first[i] and last[i].

If they are not equal, break the loop.

If they are equal, append first[i] to result.

Return the string representation of result by calling result.toString().

 */