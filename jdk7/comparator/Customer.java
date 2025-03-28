package jdk7.comparator;

class Customer {
    String name;
    boolean isVip;
    int waitTime;

    public Customer(String name, boolean isVip, int waitTime) {
        this.name = name;
        this.isVip = isVip;
        this.waitTime = waitTime;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', isVip=" + isVip + ", waitTime=" + waitTime + '}';
    }
}
