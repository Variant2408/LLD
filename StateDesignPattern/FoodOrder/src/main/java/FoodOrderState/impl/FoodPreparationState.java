package FoodOrderState.impl;

import FoodOrderState.FoodOrderState;
import FoodOrder.FoodOrder;

public class FoodPreparationState implements FoodOrderState {

    @Override
    public void transicationToNext(FoodOrder order) {
        order.setState(new WaitingToBePickedState());
    }

    @Override
    public void showStatus() {
        System.out.println("Food preparation started, waiting for the food to be prepared.");
    }

}
