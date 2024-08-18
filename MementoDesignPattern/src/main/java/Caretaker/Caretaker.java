package Caretaker;

import Memento.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Memento>mementos=new ArrayList<>();

    public void add(Memento memento){
        mementos.add(memento);
    }

    public Memento undo(){
        if(!mementos.isEmpty()){
            int lastIndex=mementos.size()-1;
            Memento lastMemento=mementos.get(lastIndex);
            mementos.remove(lastIndex);
            return lastMemento;
        }
        return null;
    }
}
