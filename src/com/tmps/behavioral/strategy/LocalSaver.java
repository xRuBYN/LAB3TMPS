package com.tmps.behavioral.strategy;

import java.util.List;

public class LocalSaver implements SaverService {
  @Override
  public void save(List<?> objects) {
    System.out.println(objects + " Was saved local.");
  }
}
