package com.java._8_lambdas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class StockExchange {

    static Trader raoul = new Trader("Raoul", "Cambridge");

    static Trader mario = new Trader("Mario", "Milan");

    static Trader alan = new Trader("Alan", "Cambridge");

    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = List.of(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    /**
     * 1. Find all transactions in the year 2011 and sort them by value (small to high).
     * 2. What are all the unique cities where the traders work?
     * 3. Find all traders from Cambridge and sort them by name.
     * 4. Return a string of all traders’ names sorted alphabetically.
     * 5. Are any traders based in Milan?
     * 6. Print all transactions’ values from the traders living in Cambridge.
     * 7. What’s the highest value of all the transactions?
     * 8. Find the transaction with the smallest value.
     */

    public static void main(String... args) {
        //4
        String names = Stream.of(mario, raoul, alan, brian)
                             .map(trader -> trader.getName())
                             .sorted()
                             .collect(Collectors.joining(","));

        names = transactions.stream() // Stream<Transaction>
                            .map(Transaction::getTrader) //Stream<Trader>
                            .map(Trader::getName) //Stream<String>
                            .distinct()
                            .sorted()
                            .collect(Collectors.joining(","));

        System.out.println("names = " + names);

//   7. What’s the highest value of all the transactions?
        transactions.stream()
                    .max(comparing(Transaction::getValue))
                    .map(Transaction::getValue)
//                    .ifPresent(transaction -> System.out.println(transaction.getValue()));
                    .ifPresent(System.out::println);

//      5. Are any traders based in Milan?

        boolean isAnyoneFromMilan = transactions.stream()
//                                              .map(Transaction::getTrader)
                                                .anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));

        System.out.println("isAnyoneFromMilan = " + isAnyoneFromMilan);
    }
}