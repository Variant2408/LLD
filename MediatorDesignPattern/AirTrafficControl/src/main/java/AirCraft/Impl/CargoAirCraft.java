package AirCraft.Impl;

import AirCraft.AirCraft;
import AirTrafficControl.AirTrafficControl;

public class CargoAirCraft extends AirCraft {

    public CargoAirCraft(AirTrafficControl mediator,String callSign){
        super(mediator,callSign);
    }

    @Override
    public void send(String message) {
        System.out.println(this.callSign+" sends: "+message);
        mediator.sendMessage(message,this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.callSign+" recieves: "+message);
    }
}
