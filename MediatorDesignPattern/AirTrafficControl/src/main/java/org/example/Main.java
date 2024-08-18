package org.example;

import AirCraft.AirCraft;
import AirCraft.Impl.CargoAirCraft;
import AirCraft.Impl.PassengerAirCraft;
import AirTrafficControl.AirTrafficControl;
import AirTrafficControl.Impl.ControlTower;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        AirTrafficControl controlTower=new ControlTower();
        AirCraft passengerCraft1=new PassengerAirCraft(controlTower,"Passenger-101");
        AirCraft passengerCraft2=new PassengerAirCraft(controlTower,"Passenger-102");
        AirCraft cargoCraft1=new CargoAirCraft(controlTower,"CargoCraft-234");
        controlTower.registerAirCraft(passengerCraft1);
        controlTower.registerAirCraft(passengerCraft2);
        controlTower.registerAirCraft(cargoCraft1);

        passengerCraft1.send("Requesting takeOff clearance");
        cargoCraft1.send("Requesting takeOff clearance");
    }
}