package Behavioral.Observer;

public class NewsChannel implements Channel {
    String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return this.news;
    }
}
