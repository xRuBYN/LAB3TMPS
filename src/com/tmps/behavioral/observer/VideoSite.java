package com.tmps.behavioral.observer;

public class VideoSite {
  public static void main(String[] args) {
    VideoPlatform videoPlatform = new VideoPlatform();

    Observer observer1 = new Subscriber("Ursu Rubin");
    Observer observer2 = new Subscriber("Plesu Catalin");
    Observer observer3 = new Subscriber("Ion Ion");
    videoPlatform.addObserver(observer1);
    videoPlatform.addObserver(observer2);
    videoPlatform.addObserver(observer3);

    videoPlatform.addVideo("Panda 3");
    videoPlatform.addVideo("Panda 2");
    videoPlatform.deleteVideo("Panda 2");
  }
}
