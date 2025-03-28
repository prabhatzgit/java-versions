package jdk7.string;

public class AddTwoStrings {
    public static void main(String[] args) {
        String num1 = "12349879349";
        String num2 = "98475";
        String num3 = addStrings(num1, num2);
        System.out.println(num3);
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0, p1 = num1.length() - 1, p2 = num2.length() - 1;
        // num1 = "12349879349" num2 = "98475"
        while (p1 >= 0 || p2 >= 0 || carry != 0) {
            int x1 = p1 >= 0 ? num1.charAt(p1) : 0; // 9
            int x2 = p2 >= 0 ? num2.charAt(p2) : 0;
            int sum = x1 + x2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
            p1--;
            p2--;
        }
        
        return result.reverse().toString();
    }
}
