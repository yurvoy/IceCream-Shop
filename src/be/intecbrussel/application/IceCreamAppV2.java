package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {

    public static void main(String[] args) throws OutOfStockException {

        //New Price List
        PriceList priceList = new PriceList(2, 2.5, 3);

        //New Stock
        Stock stock = new Stock(2, 4, 6, 4);

        //New Ice cream Salon
        System.out.println("ICE CREAM CAR");
        System.out.println(stock);
        System.out.println("----------------------------------");
        IceCreamCar iceCreamCar = new IceCreamCar(priceList, stock, 0);


        try {
            //Order
            Eatable[] order2 = new Eatable[]{
                    iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.MOKKA, Cone.Flavor.STRACIATELLA, Cone.Flavor.BANANA}),
                    iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.VANILLA}),
                    iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),
                    iceCreamCar.orderMagnum(Magnum.MagnumType.ALPINENUTS),
                    iceCreamCar.orderIceRocket(),
                    iceCreamCar.orderIceRocket(),
//                    iceCreamCar.orderIceRocket(),
//                    iceCreamCar.orderIceRocket()
            };

            //Eating
            for (int i = 0; i < order2.length; i++) {
                order2[i].eat();
            }

            //Ice cream Salon profit
            System.out.println("----------------------------------");
            System.out.println("Ice cream Car profit : " + iceCreamCar.getProfit() + "€");
            System.out.println("It remains in our " + stock);


            //Error message
        } catch (OutOfStockException outOfStock) {
            System.out.println("We can't serve this order, sorry...");
            outOfStock.printStackTrace();
        }


    }
}
