package com.tmps.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTacker {
  private List<CustomerSnapshot> snapshots = new ArrayList<>();

  private int currentIndex = 0;
  public void addSnapshot(CustomerSnapshot customerSnapshot) {
    currentIndex++;
    this.snapshots.add(customerSnapshot);
  }

  public CustomerSnapshot getSnapshot(int index) {
    if(index >= 0 &&  index < snapshots.size()) {
      currentIndex = index;
      return snapshots.get(index);
    } else {
      System.out.println("SnapShotNotExist");
      return null;
    }
  }

  public CustomerSnapshot undo() {
    if(currentIndex <=  0){
      System.out.println("error");
      return null;
    } else {
      currentIndex--;
      return getSnapshot(currentIndex);
    }
  }
  public CustomerSnapshot redo() {
    if(currentIndex >= snapshots.size()) {
      System.out.println("error");
      return null;
    } else {
      currentIndex++;
      return getSnapshot(currentIndex);
    }

  }
}
