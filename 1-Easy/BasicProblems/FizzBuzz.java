package Easy.BasicProblems;

public class FizzBuzz {
    public static void main(String[] args) {

        int n = 100;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }

    }
}

//Logic and Flow::

// Loop through the entire value of n
// Use if else to print FizzBuzz when the Number among these values is divisble by both 3 and 5
// then print fizz if the number is divisible by 3 and print 5 if the looped number is divisible by 5
// then print all the numbers other than those who satisfy the values
