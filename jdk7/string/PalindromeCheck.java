package jdk7.string;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "level";
        boolean value = isPalindrome(str);
        if (value) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }

    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String str) {
        // base case
        if (str.length() == 0 || str.length() == 1)
            return true;

        // check first and last characters
        if (str.charAt(0) != str.charAt(str.length() - 1))
            return false;

        // check the remaining string
        return isPalindromeRecursive(str.substring(1, str.length() - 1));
    }
}
