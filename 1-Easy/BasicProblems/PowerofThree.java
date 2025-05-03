

class Main {

    public static boolean isPowerOfThree(int n) {
        int i = 1;

        while(i < n) {
            i = i * 3;
        }
        return i == n ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
}}