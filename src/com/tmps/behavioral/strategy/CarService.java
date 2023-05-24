package com.tmps.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class CarService {
  public SaverService saverService;

  List<Car> cars = new ArrayList<>();
  public CarService(SaverService saverService) {
    this.saverService = saverService;
  }
  public void addCar(Car car) {
    cars.add(car);
  }
  public void persistData() {
    saverService.save(cars);
  }

  public void setSaverService(SaverService saverService) {
    this.saverService = saverService;
  }
}
