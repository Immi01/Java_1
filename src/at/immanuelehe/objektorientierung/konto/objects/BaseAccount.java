package at.immanuelehe.objektorientierung.konto.objects;

import java.text.DecimalFormat;

public class BaseAccount {

    private float balance;

    public BaseAccount(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void withdraw(float amount) throws Exception {
        if (amount % 0.01f != 0) {
            amount = Math.round(amount * 100f) / 100f;
            System.out.println("The entered amount got rounded to " + amount + " €");
        }
        if(amount > 0f) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " €");
        } else {
            throw new Exception("Entered value too low");
        }
    }

    public void deposit(float amount) throws Exception {
        if (amount % 0.01f != 0) {
            amount = Math.round(amount * 100f) / 100f;
            System.out.println("The entered amount got rounded to " + amount + " €");
        }
        if(amount > 0f) {
            balance += amount;
            System.out.println("Deposited " + amount + " €");
        } else {
            throw new Exception("Entered value too low");
        }
    }

}
