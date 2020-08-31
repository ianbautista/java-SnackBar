package snackBar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    // constructor
    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.cashOnHand = cashOnHand;
    }

    // id getter
    public int getId() {
        return id;
    }

    // name getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // cashOnHand getter and setter
    public double getCashOnHand() {
        return cashOnHand;
    }
    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    // buySnacks method
    public void buySnacks(double cost, int purchased) {
        this.cashOnHand -= cost * purchased;
    }

    // add cash to cash on hand
    public void findCash(double foundCash)
    {
        this.cashOnHand += foundCash;
    }
}