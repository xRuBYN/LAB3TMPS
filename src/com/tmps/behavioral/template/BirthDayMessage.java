package com.tmps.behavioral.template;

public class BirthDayMessage extends EmailMessageTemplate{

  @Override
  public String generateSubject() {
    return  "Congratulations!!";
  }
  @Override
  public String generateBody() {
    return "Our dear, we congratulate you on your birthday!!!";
  }

  @Override
  public String generateFooter() {
    return "From our team";
  }
}
