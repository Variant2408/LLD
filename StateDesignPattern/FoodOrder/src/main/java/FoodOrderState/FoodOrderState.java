package FoodOrderState;

import FoodOrder.FoodOrder;

public interface FoodOrderState {
    void transicationToNext(FoodOrder order);
    void showStatus();
}
