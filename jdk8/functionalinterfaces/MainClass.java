package jdk8.functionalinterfaces;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Main Class started");
        FuncInterface functionalInterface = new FuncInterfaceImpl();
        functionalInterface.funcA();

        FuncInterface anonymousObj1 = new FuncInterfaceImpl(){
          public void funcA() {
              System.out.println("first anonymous class");
          }
        };
        anonymousObj1.funcA();

        FuncInterface anonymousObj2 = new FuncInterfaceImpl(){
            public void funcA() {
                System.out.println("second anonymous class");
            }
        };
        anonymousObj2.funcA();

        // using interface with help of lambda
        FuncInterface lambdaObj = () -> System.out.println("Single abstract method is calling with use of lambda");
        lambdaObj.funcA();

        SumFuncInterface sumFuncInterface = (a, b) -> a + b;
        System.out.println(sumFuncInterface.sum(4,6));
        System.out.println(sumFuncInterface.sum(7,5));

        StringLengthFI stringLengthFI = (str) -> str.length();
        System.out.println("Length of the string is " + stringLengthFI.getStringLength("Riddhi"));

    }
}
