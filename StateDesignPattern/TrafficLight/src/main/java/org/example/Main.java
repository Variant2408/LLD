package org.example;

import TrafficLight.TrafficLight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        TrafficLight trafficLight=new TrafficLight();
        trafficLight.showStatus();
        trafficLight.changeState();
        trafficLight.showStatus();
        trafficLight.changeState();
        trafficLight.showStatus();
        trafficLight.changeState();
        trafficLight.showStatus();
    }
}