package jdk8.functionalinterfaces;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable thread = () -> {
          for (int i = 0; i < 10; i++) {
              System.out.println("value of i is :" + i);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };

        Thread thread1 = new Thread(thread);
        thread1.setName("Thread 1");
        thread1.start();

        Runnable thread2 = () -> {
            try {
                for (int i = 1; i < 10; i++) {
                    System.out.println(i*2);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread22 = new Thread(thread2);
        thread22.start();
    }
}
