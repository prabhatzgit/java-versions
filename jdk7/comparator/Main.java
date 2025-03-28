package jdk7.comparator;

public class Main {
    public static void main(String[] args) {
        RestaurantQueue restaurantQueue = new RestaurantQueue();
        
        restaurantQueue.addCustomer(new Customer("Alice", true, 5));
        restaurantQueue.addCustomer(new Customer("Bob", false, 10));
        restaurantQueue.addCustomer(new Customer("Charlie", true, 15));
        restaurantQueue.addCustomer(new Customer("David", false, 20));
        
        System.out.println("Customers in queue:");
        restaurantQueue.viewCustomers();
        
        System.out.println("\nServing customers:");
        System.out.println(restaurantQueue.serveCustomer());
        System.out.println(restaurantQueue.serveCustomer());
    }
}
