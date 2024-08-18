package org.example;

import AuctionMediator.AuctionMediator;
import AuctionMediator.Impl.Auction;
import Bidder.Impl.Bidder;
import Bidder.Colleague;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        AuctionMediator auctionMediator=new Auction();
        Colleague bidder1=new Bidder("Alice",auctionMediator);
        Colleague bidder2=new Bidder("Bob",auctionMediator);
        Colleague bidder3=new Bidder("Hales",auctionMediator);

        auctionMediator.addBider(bidder1);
        auctionMediator.addBider(bidder2);
        auctionMediator.addBider(bidder3);

        bidder1.placeBid(1200000);
        bidder3.placeBid(1500000);
    }
}