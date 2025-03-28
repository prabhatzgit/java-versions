package jdk8.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WithoutForEach {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            arrayList.add(i);
        //traversing using iterator
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            System.out.println("Iterator value : " + i);
            if (i == 5) {
                // ConcurrentModificationException is raised here as an element is removed during the iteration
                System.out.println("\n\nTrying to remove an element in between of the iteration\n");
                arrayList.remove(i);
            }
        }
    }

}