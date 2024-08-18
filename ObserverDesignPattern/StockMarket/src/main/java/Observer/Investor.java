package Observer;

public class Investor implements Observer {
    String name;

    public Investor(String Name){
        this.name=name;
    }

    public void update(String stockName,float price){
        System.out.println("================");
        System.out.println("StockName: "+stockName);
        System.out.println("Price: "+price);
    }
}
