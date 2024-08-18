package Originator;
import Memento.Memento;

public class Originator {
    int height;
    int width;

    public Originator(int height,int width){
        this.height=height;
        this.width=width;
    }

    public void setHeight(int height){
        this.height=height;
    }
    public void setWidth(int width){
        this.width=width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Memento createMemento(){
        return new Memento(this.height,this.width);
    }

    public void restoreMemento(Memento memento){
        this.height=memento.getHeight();
        this.width=memento.getWidth();
    }

}
