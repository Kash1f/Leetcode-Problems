

class Main {

    public static boolean isPowerOfTwo(int n) {
        int i = 1;

        while(i < n) {
            i = i * 2;
        }
        return i == n ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
}}