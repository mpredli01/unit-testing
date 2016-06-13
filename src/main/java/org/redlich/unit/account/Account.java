package org.redlich.unit.account;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance = new BigDecimal(0);

    public Account(BigDecimal initial) {
        balance = initial;
        }

    public BigDecimal getBalance() {
        return balance;
        }

    public void withdraw(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("cannot do that...");
            }
        balance = balance.subtract(amount);
        }
    }