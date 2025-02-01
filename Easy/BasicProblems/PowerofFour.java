
//Solution 1:
class Main {
    public static boolean PowerOfFour(int n) {
        int i = 1;

        while ( i < n) {
            i = i * 4;
        }
        return i == n ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(PowerOfFour(16));
    }
}

//Solution 2: 

class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xAAAAAAAA) == 0;
    }
}
