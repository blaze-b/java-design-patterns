package com.mclebtec.java.abstractfactory.basic;

import com.mclebtec.java.abstractfactory.basic.icecream.ChocolateIceCream;
import com.mclebtec.java.abstractfactory.basic.icecream.IceCream;
import com.mclebtec.java.abstractfactory.basic.icecream.StrawberryIceCream;
import com.mclebtec.java.abstractfactory.basic.milkshakes.ChocolateMilkShake;
import com.mclebtec.java.abstractfactory.basic.milkshakes.MilkShake;
import com.mclebtec.java.abstractfactory.basic.milkshakes.StrawberryMilkShake;

public class AmulItemFactory extends AbstractItemFactory {
    @Override
    public  IceCream createIceCream(String choice) {
        IceCream iceCream = null;
        if (choice.equalsIgnoreCase("Strawberry"))
            iceCream = new StrawberryIceCream("Amul", 10, 1000);
        else if (choice.equalsIgnoreCase("Chocolate"))
            iceCream = new ChocolateIceCream("Amul", 10, 1000);
        return iceCream;
    }

    @Override
    public MilkShake createMilkShake(String choice) {
        MilkShake milkShake = null;
        if (choice.equalsIgnoreCase("Strawberry"))
            milkShake = new StrawberryMilkShake("Amul", 10);
        else if (choice.equalsIgnoreCase("Chocolate"))
            milkShake = new ChocolateMilkShake("Amul", 10);
        return milkShake;
    }
}
