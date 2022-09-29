import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.*;

public class Menu {
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

        Random random = new Random();
        String choice1 = meals.get(random.nextInt(meals.size()));
        String choice2 = drinks.get(random.nextInt(drinks.size()));
        System.out.println("[Guest] I'll order " + choice1 + " and " + choice2);
    }
}
