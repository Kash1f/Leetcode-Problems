package Easy.BasicProblems;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 123;                // Example input
        int original = x;           // Store original number
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;     // Extract last digit
            reversed = reversed * 10 + digit;  // Append digit to reversed number
            x = x / 10;             // Remove last digit from x
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
