package FoodOrderState.impl;

import FoodOrderState.FoodOrderState;
import FoodOrder.FoodOrder;

public class OrderInitiatedState implements FoodOrderState {
    @Override
    public void transicationToNext(FoodOrder order) {
        order.setState(new OrderPlacedState());
    }

    @Override
    public void showStatus() {
        System.out.println("Order initiated, waiting for the order to be placed.");
    }
}
