package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaAccount implements Observable{
    List<Observer> observers;
    String post;

    public SocialMediaAccount(){
        this.observers=new ArrayList<>();
    }

    @Override
    public void addFollowers(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeFollowers(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyFollowers() {
        for(Observer obj: observers){
            obj.update(this.post);
        }
    }

    public void uploadPost(String post){
        this.post=post;
        notifyFollowers();
    }
}
