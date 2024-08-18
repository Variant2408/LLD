package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Observable {
    List<Observer> observers;
    String stockName;
    float price;

    public StockMarket(){
        this.observers=new ArrayList<>();
    }

    @Override
    public void addInvestors(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeInvestors(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyInvestors() {
        for(Observer ob: observers){
            ob.update(this.stockName,this.price);
        }
    }
    public void setStockData(String stockName,float price){
        this.stockName=stockName;
        this.price=price;
        notifyInvestors();
    }
}

