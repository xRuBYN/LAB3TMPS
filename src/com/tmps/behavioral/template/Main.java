package com.tmps.behavioral.template;

public class Main {
  public static void main(String[] args) {
    EmailMessageTemplate freeDayMessage = new FreeDayMessage();
    EmailMessageTemplate birthDayMessage = new BirthDayMessage();

    freeDayMessage.showEmailMessage();
    System.out.println("---------------------------------------");
    birthDayMessage.showEmailMessage();
  }
}
