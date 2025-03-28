package jdk7.string;

public class FindAllCombinationsOfString {
    public static void main(String[] args) {
        String str = "abc";
        StringBuilder sb = new StringBuilder(str);
        // find all combinations of given string
        permute(sb, 0);
    }

    private static String permute(StringBuilder str, int index) {
        if (str.length() - 1 == 0){
            return null;
        }
        for (int i = index; i < str.length() - 1; i++) {
            swap(str, 0, i);
            permute(str, index + 1);
            swap(str, 0, i);
        }
        return str.toString();
    }

    // Helper function to swap characters in the StringBuilder
    static void swap(StringBuilder s, int i, int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }
}
