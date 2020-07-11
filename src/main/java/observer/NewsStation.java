package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsStation {

    private List<Observer> observers = new ArrayList<>();

    public News currentNews;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(News news) {
        this.currentNews = news;
        observers.forEach(observer -> observer.notifyAboutNews(news));
    }
}