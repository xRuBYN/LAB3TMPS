package com.tmps.behavioral.strategy;

public class Main {
  public static void main(String[] args) {
    SaverService cloudSaver = new CloudSaver();
    CarService carService = new CarService(cloudSaver);
    Car car = new Car(1L, "Dacia");
    Car car1 = new Car(2L, "Audi");
    Car car2 = new Car(3L, "Merceds");

    carService.addCar(car);
    carService.addCar(car1);
    carService.addCar(car2);
    carService.persistData();

    SaverService localSaver = new LocalSaver();
    carService.setSaverService(localSaver);
    carService.persistData();

  }
}
