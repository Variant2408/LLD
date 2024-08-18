package AirCraft;

import AirTrafficControl.AirTrafficControl;

public abstract class AirCraft {
    protected AirTrafficControl mediator;
    protected String callSign;

    public AirCraft(AirTrafficControl mediator,String callSign){
        this.mediator=mediator;
        this.callSign=callSign;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
