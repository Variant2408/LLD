package TrafficLightState;
import TrafficLight.TrafficLight;

public interface TrafficLightState {
    void changeState(TrafficLight state);
    void getColor();
}
