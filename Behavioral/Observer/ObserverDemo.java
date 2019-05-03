package Behavioral.Observer;

public class ObserverDemo {
    public static void main(String[] args){
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news 1 published");

        System.out.println(observer.getNews());

        observable.setNews("news 2 published");

        System.out.println(observer.getNews());
    }
}
