package TrafficLightState.Impl;

import TrafficLightState.TrafficLightState;
import TrafficLight.TrafficLight;

public class GreenLightState implements TrafficLightState {

    @Override
    public void changeState(TrafficLight state) {
        state.setState(new YellowLightState());
    }

    @Override
    public void getColor() {
        System.out.println("it is in Yellow Color");
    }
}
