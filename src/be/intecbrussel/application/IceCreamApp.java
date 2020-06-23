package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;


public class IceCreamApp {

    public static void main(String[] args) throws OutOfStockException {

        //New Price List
        PriceList priceList = new PriceList(2.5, 3, 4);

        //New Ice cream Salon
        System.out.println("ICE CREAM SALON");
        System.out.println("----------------------------------");
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList, 0);

        //Order
        Eatable[] order1 = new Eatable[]{
                iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.MOKKA, Cone.Flavor.STRACIATELLA, Cone.Flavor.BANANA}),
                iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.VANILLA}),
                iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),
                iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS),
                iceCreamSalon.orderIceRocket()
        };

        //Eating
        for (int i = 0; i < order1.length; i++) {
            order1[i].eat();
        }

        //Ice cream Salon profit
        System.out.println("----------------------------------");
        System.out.println("Salon profit : " + iceCreamSalon.getProfit() + "€");


    }
}
