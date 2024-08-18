package FoodOrderState.impl;

import FoodOrderState.FoodOrderState;
import FoodOrder.FoodOrder;

public class WaitingToBePickedState implements FoodOrderState {

    @Override
    public void transicationToNext(FoodOrder order) {
        order.setState(new OutForDeliveryState());
    }

    @Override
    public void showStatus() {
        System.out.println("Food prepared and waiting to be picked.");
    }
}
