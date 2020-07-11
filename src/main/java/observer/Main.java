package observer;

public class Main {
    public static void main(String[] args) {
        NewsStation newsStation = new NewsStation();

        newsStation.registerObserver(new Observer("Observer 1"));
        newsStation.registerObserver(new Observer("Observer 2"));
        newsStation.registerObserver(new Observer("Observer 3"));

        newsStation.notifyObservers(new News("News 1"));
    }
}