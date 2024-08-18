package org.example;

import Observable.Observable;
import Observer.Observer;
import Observer.Investor;
import Observable.StockMarket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Investor investor1=new Investor("Alice");
        Investor investor2=new Investor("Bob");

        StockMarket st=new StockMarket();
        st.addInvestors(investor1);
        st.addInvestors(investor2);

        st.setStockData("TATA",2343.56f);
    }
}