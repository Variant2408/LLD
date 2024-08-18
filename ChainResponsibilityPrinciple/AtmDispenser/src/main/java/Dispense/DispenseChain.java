package Dispense;
import Currency.Currency;


public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency curr);
}
