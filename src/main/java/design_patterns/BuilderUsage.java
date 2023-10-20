package design_patterns;

import java.util.ArrayList;
import java.util.List;

public class BuilderUsage {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal nonVegeMeal = builder.buildNonVegeMeal();
        Meal vegeMeal = builder.buildVegeMeal();

        nonVegeMeal.addMeal(new ChickenBurger());

        nonVegeMeal.printMealInfo();
        System.out.println("Total: " + nonVegeMeal.getTotalPrice());

        vegeMeal.printMealInfo();
        System.out.println("Total: " + vegeMeal.getTotalPrice());
    }

}

interface Item {
    public String name();
    public Packing packing();
    public float price();
}

interface Packing {
    public String pack();
}

class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}

class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}

abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}

abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}

class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}

class VegeBurger extends Burger {

    @Override
    public String name() {
        return "Vegetable Burger";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}

class Pepsi extends Drink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}

class Coke extends Drink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 6.5f;
    }
}

class Meal {

    List<Item> meal = new ArrayList<>();

    public void addMeal(Item item) {
        meal.add(item);
    }

    public float getTotalPrice() {
        float totalPrice = 0f;
        for (Item each: meal)
            totalPrice += each.price();

        return totalPrice;
    }

    public void printMealInfo() {
        for (Item each: meal) {
            System.out.println(each.name());
            System.out.println(each.price());
            System.out.println(each.packing().pack());
        }
    }

}

class MealBuilder {

    public Meal buildNonVegeMeal() {
        Meal meal = new Meal();
        meal.addMeal(new ChickenBurger());
        meal.addMeal(new Coke());
        return meal;
    }

    public Meal buildVegeMeal() {
        Meal meal = new Meal();
        meal.addMeal(new VegeBurger());
        meal.addMeal(new Pepsi());
        return meal;
    }

}