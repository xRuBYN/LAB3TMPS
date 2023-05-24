package com.tmps.behavioral.template;

public class FreeDayMessage extends EmailMessageTemplate{

  @Override
  public String generateSubject() {
    return  "Free days!";
  }

  @Override
  public String generateBody() {
    return "Our free days are marked in calendar";
  }

  @Override
  public String generateFooter() {
    return "Name of user";
  }
}
