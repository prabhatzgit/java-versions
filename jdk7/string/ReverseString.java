package jdk7.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "-314";
        if (str.startsWith("-")) {
            System.out.println(new StringBuilder(str.substring(1)).reverse().append('-').toString());
        } else {
            System.out.println(new StringBuilder(str).reverse().toString());
        }
    }
}
