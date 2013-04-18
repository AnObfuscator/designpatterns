package pizza;

import java.util.Arrays;

public class FluentPizzaBuilder {

    private Pizza pizza;

    public FluentPizzaBuilder() {
        pizza = new Pizza();
    }

    public FluentPizzaBuilder withDough(Dough dough) {
        pizza.setDough(dough);
        return this;
    }

    public FluentPizzaBuilder withSauce(Sauce sauce) {
        pizza.setSauce(sauce);
        return this;
    }

    public FluentPizzaBuilder withCheese(Cheese cheese) {
        pizza.setCheese(cheese);
        return this;
    }

    public FluentPizzaBuilder withToppings(Topping... toppings) {
        pizza.setToppingsList(Arrays.asList(toppings));
        return this;
    }

    public Pizza bake() {
        return pizza;
    }
}
