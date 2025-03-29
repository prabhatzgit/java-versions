package jdk17.switchstatementsenhancements;

public class SwitchStatementWithNullHandling {

    public static void testFooBar(String string){
        if(string == null){
            System.out.println("string is null");
        }
        switch(string){
            case "foo, bar" -> System.out.println("foo, bar");
            default -> System.out.println("Ok");
        }
    }

//    public static String describe(Object object){
//        return switch (object){
//            case null -> "null";
//            case i -> "integer";
//            case d -> "double";
//            default -> "unknown";
//        };
//    }
// feature upgraded to jdk 21

    public static void main(String[] args) {
        testFooBar(null);
    }
}
