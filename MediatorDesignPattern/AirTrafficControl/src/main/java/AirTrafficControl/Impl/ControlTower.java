package AirTrafficControl.Impl;

import AirTrafficControl.AirTrafficControl;
import AirCraft.AirCraft;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements AirTrafficControl {
    List<AirCraft> airCraftList;
    public  ControlTower(){
        this.airCraftList=new ArrayList<>();
    }

    @Override
    public void registerAirCraft(AirCraft airCraft) {
        airCraftList.add(airCraft);
    }

    @Override
    public void sendMessage(String message, AirCraft airCraft) {
        for(AirCraft obj: airCraftList){
            if(obj!=airCraft)
                obj.receive(message);
        }
    }
}
