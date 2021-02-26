package com.mclebtec.java.builder.bonus.meal;

public class MealBuilder {
    public Meal buildVegMeal(){
        Meal meal = new Meal();
        Wrap wrap = new Bottle();
        Item vegBurger = new VegBurger();
        vegBurger.setWrap(wrap);
        wrap = new Box();
        Drink milk = new Milk();
        milk.setWrap(wrap);
        meal.addItems(vegBurger);
        meal.addItems(milk);
        return meal;
    }

    public Meal buildNonVegMeal(){
        Meal meal = new Meal();
        Wrap wrap = new Bottle();
        Item chickenBurger = new ChickenBurger();
        chickenBurger.setWrap(wrap);
        wrap = new Box();
        Drink drink = new Blood();
        drink.setWrap(wrap);
        meal.addItems(chickenBurger);
        meal.addItems(drink);
        return meal;
    }
}
