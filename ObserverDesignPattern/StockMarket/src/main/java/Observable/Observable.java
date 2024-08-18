package Observable;

import Observer.Observer;

public interface Observable {
    public void addInvestors(Observer observer);
    public void removeInvestors(Observer observer);
    public void notifyInvestors();
}
