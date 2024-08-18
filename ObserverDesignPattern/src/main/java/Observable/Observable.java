package Observable;

import Observer.Observer;

import java.util.List;

public interface Observable {
    void addFollowers(Observer observer);
    void removeFollowers(Observer observer);
    void notifyFollowers();

}
