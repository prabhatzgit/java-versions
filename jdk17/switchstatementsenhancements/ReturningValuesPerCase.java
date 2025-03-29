package jdk17.switchstatementsenhancements;

public class ReturningValuesPerCase {

    public static void beforeJava17WithMultipleCaseValue(int number) {
        String result;
        // Switch statement to check size
        switch (number) {
            case 1:
                result = "One";
                break;
            case 2:
            case 3:
            case 4:
                result = "two, three, or four";
                break;
            default:
                result = "Unknown";
                break;
        }

        System.out.println(result);
    }

    public static void java17WithMultipleCaseValue(int number) {
        switch (number) {
            case 1 -> System.out.println("one");
            case 2, 3, 4 -> System.out.println("two, three, or four");
            default -> System.out.println("unknown");
        };
    }

    public static void main(String[] args) {
        System.out.println("*** Before Java 17 ***");
        beforeJava17WithMultipleCaseValue(2);
        beforeJava17WithMultipleCaseValue(3);
        beforeJava17WithMultipleCaseValue(4);
        System.out.println("\n");
        System.out.println("*** After Java 17 ***");
        java17WithMultipleCaseValue(2);
        java17WithMultipleCaseValue(3);
        java17WithMultipleCaseValue(4);
    }

}
