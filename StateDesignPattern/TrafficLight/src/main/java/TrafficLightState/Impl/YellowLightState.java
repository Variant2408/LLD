package TrafficLightState.Impl;

import TrafficLightState.TrafficLightState;
import TrafficLight.TrafficLight;

public class YellowLightState implements TrafficLightState {

    @Override
    public void changeState(TrafficLight state) {
        state.setState(new RedLightState());
    }

    @Override
    public void getColor() {
        System.out.println("it is in Red Color");
    }
}
