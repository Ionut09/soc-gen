package com.java._4_oop._1_classes;

import java.math.BigDecimal;

public class BranchService {

    public static void main(String... args) {
        Account account = new Account(); //constructor (metoda fara return)
        account.deposit(new BigDecimal(100)); //euro
        account.withdraw(new BigDecimal(50));
        account.withdraw(new BigDecimal(50));
        account.withdraw(new BigDecimal(1));


//        System.out.println(account.getBalance());
    }
}
