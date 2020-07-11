package observer;

public class Observer {

    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public void notifyAboutNews(News news) {
        System.out.println(name + " received: " + news.getContent());
    }
}