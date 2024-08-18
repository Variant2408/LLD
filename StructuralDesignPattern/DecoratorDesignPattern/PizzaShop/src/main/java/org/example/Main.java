package org.example;

import Pizza.BasePizza;
import Pizza.Impl.Margherita;
import Pizza.ToppingDecorator.Impl.ExtraCheese;
import Pizza.ToppingDecorator.Impl.Mushroom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        BasePizza pizza=new ExtraCheese(new Mushroom(new Margherita()));
        int cost=pizza.cost();
        System.out.println("Cost of Pizza: "+cost);
    }
}