package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<Channel> observers = new ArrayList<>();

    public void addObserver(Channel channel){
        this.observers.add(channel);
    }

    public void removeObserver(Channel channel){
        this.observers.remove(channel);
    }

    public void setNews(String news){
        this.news = news;
        for (Channel channel : this.observers) {
            channel.update(this.news);
        }
    }
}
