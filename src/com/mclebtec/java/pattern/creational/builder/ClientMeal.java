package com.mclebtec.java.pattern.creational.builder;

import com.mclebtec.java.pattern.creational.builder.bonus.meal.Meal;
import com.mclebtec.java.pattern.creational.builder.bonus.meal.MealBuilder;

import java.util.Scanner;

public class ClientMeal {
    public static void main(String[] args) {
        System.out.println("Welcome to Meal Builder project  ");
        Scanner scan = new Scanner(System.in);
        int repeatRunFlag = 1;
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = null;
        while (repeatRunFlag == 1) {
            System.out.println("Which Meal would you like to order ? ");
            System.out.println("press 1 for Veg Meal");
            System.out.println("press 2 for Non Veg Meal ");
            int type = scan.nextInt();
            if (type == 1)
                meal = mealBuilder.buildVegMeal();
            else
                meal = mealBuilder.buildNonVegMeal();
            System.out.println(meal);
            System.out.println("=============================");
            System.out.println("Press 1 to Repeat .... ");
            try {
                repeatRunFlag = scan.nextInt();
            } catch (Exception e) {
                repeatRunFlag = 0;
            }
        }
    }
}
