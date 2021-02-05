package com.mclebtec.java.pattern.creational.prototype.statues;

public class JesusStatues implements StatueMold, Cloneable {

    @Override
    public void createStatue() {
        try {
            Object obj = this.clone();
            System.out.println("created statue object with id" + obj.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
