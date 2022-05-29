
/**
 * Write a description of class Account here.
 *
 * @author (TJ Evert)
 * @version (2/11/2022)
 */
public class Account {
    
    // instance variables - replace the example below with your own
    private String name;
    private int pin;
    private double balance;

    /**
     * Constructor for objects of class Account
     */
    public Account(String n, int p) {
        // initialise instance variables
        name = n;
        pin = p;
        balance = 0.0;
    }
    
    public void deposit(int p, double amount) {
        if(pin == p) {
            balance += amount;
        }
        else {
            System.out.println("Incorrect PIN");
        }
    }

    public void withdraw(int p, double amount) {
        if(pin == p) {
            if(balance >= amount) {
                balance -= amount;
            }
            else {
                System.out.println("Insufficient funds");
            }
        }
        else {
            System.out.println("Incorrect PIN");
        }
    }
    
    public String toDollars(double amount) {
        String output = "$";
        int cents = (int)(amount * 1000);
        if(cents % 10 >= 5) {
            cents += 10;
        }
        cents /= 10;
        return output + (double)cents / 100.0;
    }
    
    /**
     */
    public String toString() {
        // put your code here
        return name + " has a balance of " + toDollars(balance);
    }
    
    public static void main(String[] args) {
    }
}
