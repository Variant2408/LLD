package AirTrafficControl;
import AirCraft.AirCraft;

public interface AirTrafficControl {
    void sendMessage(String message,AirCraft airCraft);
    void registerAirCraft(AirCraft airCraft);
}
