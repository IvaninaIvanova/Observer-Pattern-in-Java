package observer;

import java.util.ArrayList;
import java.util.List;

public class Post implements  Subject{

    private List<Observer> observers;
    private String post;

    public Post() {
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers){
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.post;
    }
    
    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setPost(this);
    }

    public void setPost(String post){
        this.post = post;
        this.notifyObservers();
    }
}


