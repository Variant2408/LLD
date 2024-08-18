package Bidder;

public interface Colleague {
    String getName();
    void placeBid(int Amount);
    void receiveBidNotification(int Amount);
}
