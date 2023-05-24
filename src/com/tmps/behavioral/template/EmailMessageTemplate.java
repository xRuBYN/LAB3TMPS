package com.tmps.behavioral.template;

public abstract class EmailMessageTemplate {

  public void showEmailMessage() {
    System.out.println(generateSubject());
    System.out.println(generateBody());
    System.out.println(generateFooter());
  }
  public abstract String generateSubject();
  public abstract String generateBody();
  public abstract String generateFooter();


}
