package Easy.BasicProblems;

// public class FizzBuzz {
//     public static void main(String[] args) {
        

//         int n = 100;

//         for(int i = 1; i <= n; i++){
//             if(i % 3 == 0 && i % 5 == 0){
//                 System.out.println("Fizzbuzz");
//             }
//         }


//     }
// }

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        // Create a list to hold the result
        List<String> result = new ArrayList<>();

        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        // Return the result list
        return result;
    }
}

public class FizzBuzz {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 100;  // You can set any value for n here

        // Call the fizzBuzz method and get the result list
        List<String> fizzBuzzResult = solution.fizzBuzz(n);

        // Print the result
        for (String s : fizzBuzzResult) {
            System.out.println(s);
        }
    }
}