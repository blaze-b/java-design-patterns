package com.mclebtec.java.abstractfactory.basic;

import com.mclebtec.java.abstractfactory.basic.icecream.IceCream;
import com.mclebtec.java.abstractfactory.basic.milkshakes.MilkShake;

public abstract class AbstractItemFactory {
    public abstract IceCream createIceCream(String choice);

    public abstract MilkShake createMilkShake(String choice);
}
