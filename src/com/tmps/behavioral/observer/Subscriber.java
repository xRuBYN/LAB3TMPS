package com.tmps.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
  private String name;

  public Subscriber(String name) {
    this.name = name;
  }

  @Override
  public void handleEvent(List<String> videos) {
    System.out.println("Mr." + name  + " we have some change on video hosting. " + videos);
  }
}
