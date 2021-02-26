package com.mclebtec.java.pattern.creational.factory.icecream;

import com.mclebtec.java.pattern.creational.factory.icecream.impl.ChocolateIceCream;
import com.mclebtec.java.pattern.creational.factory.icecream.impl.StrawberryIceCream;

public class IceCreamFactory {

    static public IceCream createIceCream(String choice) {
        IceCream iceCream = null;
        if (choice.equalsIgnoreCase("Strawberry"))
            iceCream = new StrawberryIceCream(1, 120);
        else if (choice.equalsIgnoreCase("Chocolate"))
            iceCream = new ChocolateIceCream(2, 120);
        return iceCream;
    }
}
