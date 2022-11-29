package Model;

import java.util.ArrayList;
import java.util.Random;
public class Meal {
    Random random = new Random();
    private ArrayList<String> meals = new ArrayList<String>();
    private ArrayList<String> drinks = new ArrayList<String>();
    private String choice1;
    private String choice2;

    public void createMeals() {
        meals.add("Pizza");
        meals.add("Carbonara");
        meals.add("Burger");

        System.out.println(meals);

        drinks.add("Coca Cola");
        drinks.add("Sprite");
        drinks.add("Juice");

        System.out.println(drinks);

        choice1 = meals.get(random.nextInt(meals.size()));
        choice2 = drinks.get(random.nextInt(drinks.size()));
        System.out.println("[Model.Guest] I'll order " + choice1 + " and " + choice2);
        meals.clear();
        drinks.clear();
    }
}
