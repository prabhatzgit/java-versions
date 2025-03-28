package jdk7.multithreading;

public class MyThread extends Thread {
    // using java7
    @Override
    public void run() {
        System.out.println("Hello World using java7");
    }

//    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.start();
//    }

    // using java8
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            System.out.println("Hello World using java8");
        });
        t1.start();
    }

}
