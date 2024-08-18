package TrafficLightState.Impl;

import TrafficLightState.TrafficLightState;
import TrafficLight.TrafficLight;

public class RedLightState implements TrafficLightState {

    @Override
    public void changeState(TrafficLight state) {
        state.setState(new GreenLightState());
    }

    @Override
    public void getColor() {
        System.out.println("it is in Green Color");
    }
}
