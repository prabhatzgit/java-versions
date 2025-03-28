package jdk7.comparator;

import java.util.Comparator;
import java.util.PriorityQueue;

class RestaurantQueue {
    private PriorityQueue<Customer> queue;

    public RestaurantQueue() {
        queue = new PriorityQueue<>(new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                if (c1.isVip && !c2.isVip) {
                    return -1;
                } else if (!c1.isVip && c2.isVip) {
                    return 1;
                } else {
                    return Integer.compare(c2.waitTime, c1.waitTime);
                }
            }
        });
    }

    public void addCustomer(Customer customer) {
        queue.offer(customer);
    }

    public Customer serveCustomer() {
        return queue.poll();
    }

    public void viewCustomers() {
        for (Customer customer : queue) {
            System.out.println(customer);
        }
    }
}
