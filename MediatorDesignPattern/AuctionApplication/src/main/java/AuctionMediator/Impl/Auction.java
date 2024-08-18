package AuctionMediator.Impl;

import AuctionMediator.AuctionMediator;
import Bidder.Colleague;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {
    List<Colleague> colleagueList;

    public Auction(){
        this.colleagueList=new ArrayList<>();
    }

    @Override
    public void addBider(Colleague colleague) {
        this.colleagueList.add(colleague);
    }

    @Override
    public void placeBid(int bidAmount,Colleague colleague) {
        for(Colleague obj: colleagueList){
            if(obj!=colleague)
                obj.receiveBidNotification(bidAmount);
        }
    }
}
