package jdk8.streamapi;

import java.util.Date;
import java.util.Objects;

public class Customer {

    private int purchaseId;
    private Date purchaseDate;
    private int customerId;

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "purchaseId=" + purchaseId +
                ", purchaseDate=" + purchaseDate +
                ", customerId=" + customerId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return purchaseId == customer.purchaseId && customerId == customer.customerId && Objects.equals(purchaseDate, customer.purchaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchaseId, purchaseDate, customerId);
    }
}
