package org.example;

import Caretaker.Caretaker;
import Memento.Memento;
import Originator.Originator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Caretaker caretaker=new Caretaker();
        Originator originator=new Originator(5,10);

        Memento snapShot1=originator.createMemento();
        caretaker.add(snapShot1);

        originator.setHeight(12);
        Memento snapShot2=originator.createMemento();
        caretaker.add(snapShot2);

        originator.setWidth(15);

        originator.restoreMemento(caretaker.undo());
        System.out.println("Height: "+originator.getHeight());
        System.out.println("Width: "+originator.getWidth());
    }
}