package TrafficLight;

import TrafficLightState.Impl.RedLightState;
import TrafficLightState.TrafficLightState;

public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight(){
        this.state=new RedLightState();
    }

    public void setState(TrafficLightState state){
        this.state=state;
    }
    public TrafficLightState getState(){
        return this.state;
    }

    public void changeState(){
        state.changeState(this);
    }

    public void showStatus(){
        state.getColor();
    }



}
