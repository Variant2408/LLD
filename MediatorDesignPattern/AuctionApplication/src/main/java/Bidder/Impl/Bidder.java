package Bidder.Impl;
import AuctionMediator.AuctionMediator;
import Bidder.Colleague;

public class Bidder implements Colleague {
    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator){
        this.name=name;
        this.auctionMediator=auctionMediator;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void placeBid(int Amount) {
        System.out.println(this.name+" bids: "+Amount);
        auctionMediator.placeBid(Amount,this);
    }

    @Override
    public void receiveBidNotification(int Amount) {
        System.out.println(this.name+" receivesBids: "+Amount);
    }
}
