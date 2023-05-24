package com.tmps.behavioral.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {

  public static void main(String[] args) {

    Customer customer = new Customer(500);
    CareTacker careTacker = new CareTacker();

    careTacker.addSnapshot(customer.createCustomerSnapshot());

    customer.buy(144);

    careTacker.addSnapshot(customer.createCustomerSnapshot());

    customer.buy(200);

    System.out.println(customer);
    customer.setSnapshot(careTacker.undo());
    System.out.println(customer);
    customer.setSnapshot(careTacker.undo());
    System.out.println(customer);
    customer.setSnapshot(careTacker.redo());
    System.out.println(customer);
  }
}
