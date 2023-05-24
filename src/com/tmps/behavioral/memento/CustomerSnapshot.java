package com.tmps.behavioral.memento;

public class CustomerSnapshot {
  private double balance;

  public CustomerSnapshot(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  @Override
  public String toString() {
    return "CustomerSnapshot{" +
        "balance=" + balance +
        '}';
  }
}
