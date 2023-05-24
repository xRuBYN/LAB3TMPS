package com.tmps.behavioral.memento;

public class Customer {
  private double balance;

  public Customer(double balance) {
    this.balance = balance;
  }

  public void buy(double productPrice) {
    if(balance > productPrice) {
      balance -=productPrice;
    } else {
      System.out.println("Please add money in your balance");
    }
  }

  public CustomerSnapshot createCustomerSnapshot() {
    return new CustomerSnapshot(balance);
  }

  public void setSnapshot(CustomerSnapshot customerSnapshot) {
    balance = customerSnapshot.getBalance();
  }

  @Override
  public String toString() {
    return "Customer{" +
        "balance=" + balance +
        '}';
  }
}
