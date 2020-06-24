package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

import java.util.ArrayList;
import java.util.List;

public class IceCreamCar implements IceCreamSeller {


    private PriceList priceList;
    private Stock stock;
    private double profit;


    //Constructors
    public IceCreamCar() {

    }

    public IceCreamCar(PriceList priceList, Stock stock, double profit) {
        this.priceList = priceList;
        this.stock = stock;
        this.profit = profit;
    }


    //Methods
    @Override
    public Cone orderCone(Cone.Flavor[] flavors) throws OutOfStockException {
        prepareCone(flavors);
        return new Cone(flavors);
    }

    private Cone prepareCone(Cone.Flavor[] flavors) throws OutOfStockException {
        if (stock.getCones() < 1) {
            throw new OutOfStockException("Cones, out of stock !");
        } else if (stock.getBalls() < flavors.length) {
            throw new OutOfStockException("Balls, out of stock !");
        } else {
            profit += priceList.getBallPrice() * flavors.length;
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - flavors.length);
        }
        return new Cone(flavors);
    }


    @Override
    public IceRocket orderIceRocket() throws OutOfStockException {
        prepareIceRocket();
        return new IceRocket();
    }

    private IceRocket prepareIceRocket() throws OutOfStockException {
        if (stock.getIceRocket() < 1) {
            throw new OutOfStockException("Ice Rocket, out of stock !");
        } else {
            stock.setIceRocket(stock.getIceRocket() - 1);
            profit += priceList.getRocketPrice();
        }
        return new IceRocket();
    }


    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) throws OutOfStockException {
        prepareMagnum(type);
        return new Magnum(type);
    }

    private Magnum prepareMagnum(Magnum.MagnumType type) throws OutOfStockException {
        if (stock.getMagni() < 1) {
            throw new OutOfStockException("Magnum, out of stock !");
        } else {
            profit += priceList.getMagnumStandardPrice();
            stock.setMagni(stock.getMagni() - 1);
        }
        return new Magnum(type);
    }


    @Override
    public double getProfit() {
        return profit;
    }



}
