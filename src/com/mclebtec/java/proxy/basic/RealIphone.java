package com.mclebtec.java.proxy.basic;

public class RealIphone implements IPhone{
    @Override
    public void getColor () {
        System.out.println(this.getClass().getSimpleName() +" Colors: Gold, Rose Gold, Carbon Black");
    }

    @Override
    public void getDimension () {
        System.out.println(this.getClass().getSimpleName() + " Dimension: Normal and Plus");
    }

    @Override
    public void operateDisplay () {
        System.out.println(this.getClass().getSimpleName() +" Multi color display working in real Phone object :-) ");
    }
}
