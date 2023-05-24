package com.tmps.behavioral.strategy;

import java.util.List;

public class CloudSaver implements SaverService{

  @Override
  public void save(List<?> objects) {
    System.out.println(objects + " Was saved in cloud.");
  }
}
