package com.mclebtec.java.pattern.creational.builder.bonus.meal;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private int cost;
    private List<Item> items = new ArrayList<>();

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItems(Item item) {
        cost += cost;
        items.add(item);
    }

    @Override
    public String toString() {
        return "Meal{" +
                "cost=" + cost +
                ", items=" + items +
                '}';
    }
}

class Item {

    private Wrap wrap;
    private int cost = 2;
    private String name;

    public Wrap getWrap() {
        return wrap;
    }

    public void setWrap(Wrap wrap) {
        this.wrap = wrap;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Burger extends Item {
    public Burger() {
        System.out.println("Parent Burger");
    }
}

class VegBurger extends Burger {
    public VegBurger() {
        setName("VegBurger");
    }
}

class ChickenBurger extends Burger {
    public ChickenBurger() {
        setName("ChickenBurger");
    }
}

class Drink extends Item {
    public Drink() {
        System.out.println("Parent Drink");
    }
}

class Milk extends Drink {
    public Milk() {
        setName("Milk");
        setCost(10);
    }
}

class Blood extends Drink {
    public Blood() {
        setName("Blood");
        setCost(0);
    }
}

class Wrap {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Bottle extends Wrap {
    public Bottle() {
        setName("Bottle");
    }
}

class Box extends Wrap {
    public Box() {
        setName("Box");
    }
}