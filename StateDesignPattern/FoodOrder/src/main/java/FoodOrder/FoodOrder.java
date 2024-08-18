package FoodOrder;

import FoodOrderState.FoodOrderState;
import FoodOrderState.impl.OrderInitiatedState;

public class FoodOrder {
    private FoodOrderState state=new OrderInitiatedState();

    public void setState(FoodOrderState state){
        this.state=state;
    }

    public FoodOrderState getState(){
        return this.state;
    }

    public void transitionToNextState(){
        state.transicationToNext(this);
    }

    public void showCurrentStatus(){
        state.showStatus();
    }


}
