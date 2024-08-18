package Observer;

public class CurrentConditionDisplay implements Observer{

    public void update(float temperature,float humidity, float pressure){
        System.out.println("========================================");
        System.out.println("Temperature: "+temperature);
        System.out.println("Humidity: "+humidity);
        System.out.println("Pressure: "+pressure);
        System.out.println("=========================================");
    }

}
