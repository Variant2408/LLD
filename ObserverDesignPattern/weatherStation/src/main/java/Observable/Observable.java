package Observable;

import Observer.Observer;

public interface Observable {
    public void registerObservers(Observer observer);
    public void removeObservers(Observer observer);
    public void notifyObservers();
}
