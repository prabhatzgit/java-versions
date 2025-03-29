package jdk17.switchstatementsenhancements;

public class GuardedPatternsInSwitch {

    /*Add guarded clauses to case labels using the -> symbols, followed by
    * boolean expression. If the evaluation expression evaluates to true, the
    * code associated with that case label will be executed*/

//    public static void guardedPatternsInSwitch(Object object) {
//        switch (object){
//            case String s when s.length() > 5 -> System.out.println("String is too long" + s);
//            case String s -> System.out.println("String is too short" + s);
//        }
//    }

    // this feature upgraded to jdk 21

    public static void main(String[] args) {
    // Guarded patterns can be used with various type of patterns
        // including type, record and array

    }
}
