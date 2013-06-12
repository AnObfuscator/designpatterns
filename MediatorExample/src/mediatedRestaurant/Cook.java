package mediatedRestaurant;

import java.util.Random;

public class Cook {

    private final Random randomizer;
    private final MealType[] meals = MealType.values();
    private final Waiter waiter;

    public Cook(Waiter waiter) {
        this.waiter = waiter;
        waiter.register(this);
        randomizer = new Random();

    }

    public MealType getSuggestion() {
            MealType suggestion = getRandomMeal();
            System.out.println("Cook suggests "+suggestion+".");
            return suggestion;
    }

    public void prepare(MealType meal) {
        MealType preparedMeal = getRandomMeal();
        System.out.println("Cook prepares "+preparedMeal);
        waiter.serve(preparedMeal);
    }

    private MealType getRandomMeal() {
        return meals[randomizer.nextInt(meals.length)];
    }
}
