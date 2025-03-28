package jdk7.multithreading;

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Hello World using java7");
    }

//    public static void main(String[] args) {
//        Thread t = new Thread(new MyRunnable());
//        t.start();
//    }

    public static void main(String[] args) {
        Runnable runnable = () ->{
            System.out.println("Hello World using java8");
        };
        new Thread(runnable).start();
    }
}
