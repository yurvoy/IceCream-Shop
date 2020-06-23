package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class PriceList {

    //Variables
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;


    //Constructors
    public PriceList() {
        this.ballPrice = 1.5;
        this.rocketPrice = 2;
        this.magnumStandardPrice = 3;
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }


    //Getters and Setters
    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumStandardPrice() {
        return magnumStandardPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType type) {
        if (type == Magnum.MagnumType.ROMANTICSTRAWBERRIES) {
            magnumStandardPrice *= 1.5;
        } else if (type == Magnum.MagnumType.ALPINENUTS) {
            magnumStandardPrice *= 1.25;
        }
        return magnumStandardPrice;
    }


}
