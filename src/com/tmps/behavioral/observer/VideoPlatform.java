package com.tmps.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class VideoPlatform implements Observed{

  private List<String> videos = new ArrayList<>();

  private List<Observer> subscribers = new ArrayList<>();

  public void addVideo(String video) {
    this.videos.add(video);
    notifyAllObservers();
  }

  public void deleteVideo(String video) {
    this.videos.remove(video);
    notifyAllObservers();
  }

  @Override
  public void addObserver(Observer observer) {
    this.subscribers.add(observer);

  }

  @Override
  public void removeObserver(Observer observer) {
    this.subscribers.remove(observer);
  }

  @Override
  public void notifyAllObservers() {
    for (Observer subscriber : subscribers) {
      subscriber.handleEvent(videos);
    }
  }
}
