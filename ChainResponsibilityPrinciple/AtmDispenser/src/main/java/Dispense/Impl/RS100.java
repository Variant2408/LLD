package Dispense.Impl;

import Currency.Currency;
import Dispense.DispenseChain;

public class RS100 implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency curr) {
        if(curr.getAmount()>=100){
            int num= curr.getAmount()/100;
            int remainder=curr.getAmount()%100;
            System.out.println("Dispensing " + num + " 100INR note");
            if(remainder!=0)
                this.nextChain.dispense(new Currency(remainder));
        }else{
            this.nextChain.dispense(curr);
        }
    }
}
