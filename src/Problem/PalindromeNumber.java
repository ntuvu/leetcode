package Problem;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        if (x > 0 && x % 10 == 0) return false;

        int y = 0;

        while (y < x) {

            y = y * 10 + x % 10;
            System.out.println(y);
            x /= 10;
            System.out.println(x);
        }
        System.out.println(y);
        System.out.println(x);
        return x == y || x == y / 10;
    }
}
