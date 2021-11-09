package com.java._4_oop._1_classes;

import java.math.BigDecimal;

public class Account {

    private String iban;

    private String owner;

    private BigDecimal balance; //immutabil

    public void deposit(BigDecimal amount) {
        if (balance == null) balance = BigDecimal.ZERO;
        balance = balance.add(amount);
        System.out.println("Amount " + amount + " deposited.");
    }

    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) < 0) { //obiectele Comparabile au metoda compareTo
            System.out.println("Not enough balance");
            return;
        }
        balance = balance.subtract(amount);
        System.out.println("Amount " + amount + " withdrawn.\n" +
                "Remaining balance is: " + balance);
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
