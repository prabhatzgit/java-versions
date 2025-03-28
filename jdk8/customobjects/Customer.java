package jdk8.customobjects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


class Customer {
    private static String id;
    private String name;
    private LocalDate purchaseDate;

    public Customer(String id, String name, LocalDate purchaseDate) {
        this.id = id;
        this.name = name;
        this.purchaseDate = purchaseDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("1", "John", LocalDate.of(2022, 1, 1)));
        customers.add(new Customer("1", "John", LocalDate.of(2022, 1, 15)));
        customers.add(new Customer("2", "Alice", LocalDate.of(2022, 2, 1)));
        customers.add(new Customer("2", "Alice", LocalDate.of(2022, 2, 20)));
        customers.add(new Customer("3", "Bob", LocalDate.of(2022, 3, 1)));

        Optional<Customer> max = customers
                .stream()
                .filter(object -> object.getId() == id && object.getPurchaseDate() == null
                        && object.getPurchaseDate() != null)
                .max(Comparator.comparing(Customer::getPurchaseDate));
            //max.
    }
}
