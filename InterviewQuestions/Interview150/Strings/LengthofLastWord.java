package Leetcode.InterviewQuestions.Interview150.Strings;

public class LengthofLastWord {
    static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        return i + 1;
    }
}
