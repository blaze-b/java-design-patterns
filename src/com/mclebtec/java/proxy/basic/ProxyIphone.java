package com.mclebtec.java.proxy.basic;

public class ProxyIphone implements IPhone{
    @Override
    public void getColor() {
        System.out.println(this.getClass().getSimpleName() + " Colors: Gold, Rose Gold, Carbon Black");
    }

    @Override
    public void getDimension() {
        System.out.println(this.getClass().getSimpleName() + " Dimension: Normal and Plus");
    }

    @Override
    public void operateDisplay() {
        System.out.println(this.getClass().getSimpleName() + " Sorry, This is proxy object, display will work only in Real object");
    }
}
