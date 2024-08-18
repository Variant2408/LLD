package AuctionMediator;

import Bidder.Colleague;

public interface AuctionMediator {
    void addBider(Colleague colleague);
    void placeBid(int bidAmount,Colleague colleague);
}
