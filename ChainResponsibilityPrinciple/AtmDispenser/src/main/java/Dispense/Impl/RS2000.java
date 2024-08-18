package Dispense.Impl;

import Currency.Currency;
import Dispense.DispenseChain;

public class RS2000 implements DispenseChain {

    private DispenseChain nextChain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain=nextChain;
    }

    @Override
    public void dispense(Currency curr) {
        if(curr.getAmount()>=2000){
            int num= curr.getAmount()/2000;
            int remainder= curr.getAmount()%2000;
            System.out.println("Dispensing " + num + " 2000INR note");
            if(remainder!=0){
                nextChain.dispense(new Currency(remainder));
            }
        }else{
            this.nextChain.dispense(curr);
        }
    }


}
