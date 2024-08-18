package org.example;

import Observable.WeatherData;
import Observer.CurrentConditionDisplay;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        WeatherData weatherData=new WeatherData();


        CurrentConditionDisplay tv=new CurrentConditionDisplay();
        CurrentConditionDisplay mobile =new CurrentConditionDisplay();

        weatherData.registerObservers(tv);
        weatherData.registerObservers(mobile);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(60,45,29.2f);
    }
}