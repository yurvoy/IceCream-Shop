package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller extends Profitable {

    Cone orderCone(Cone.Flavor[] flavors) throws OutOfStockException;

    IceRocket orderIceRocket() throws OutOfStockException;

    Magnum orderMagnum(Magnum.MagnumType type) throws OutOfStockException;


}
