package jdk8.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class WithForEach {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("forEach anonymous class Value::" + integer);
            }
        });
        MyConsumer action = new MyConsumer();
        arrayList.forEach(action);
    }
}

class MyConsumer implements Consumer {

    @Override
    public void accept(Object o) {
        System.out.println("Consumer impl Value::" + o);
    }
}