package be.intecbrussel.eatables;

import be.intecbrussel.sellers.OutOfStockException;

public interface Eatable {

    void eat() throws OutOfStockException;
}
