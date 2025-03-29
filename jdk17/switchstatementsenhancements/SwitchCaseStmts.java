package jdk17.switchstatementsenhancements;

public class SwitchCaseStmts {

        public static String switchCaseNotUsingJdk17(int number) {
            String result;
            // Switch statement to check size
            switch (number) {
                case 1:
                    result = "One";
                    break;
                case 2:
                    result = "Two";
                    break;
                case 3:
                    result = "Three";
                    break;
                case 4:
                    result = "Four";
                    break;
                default:
                    result = "Unknown";
                    break;
            }

            return result;
        }

        public static String switchCaseUsingJdk17(int number) {
            return switch (number) {
                // enhancement scenario
                // arrow operator is used to define the block of statements
                // for a particular case block
                // Even though this switch case don't have break keyword
                // the particular case block get executed.
                // that means break keyword is not required
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                default -> "unknown";
            };
        }
    public static void main(String[] args) {
        String a = switchCaseNotUsingJdk17(4);
        String b = switchCaseUsingJdk17(2);
        System.out.println(a);
        System.out.println(b);
    }

}
