package pizza;

import java.util.List;

public class PizzaClient {

    public static <T> void printList(List<T> input) { for(T i : input) System.out.println(i); }

    public static void main(String[] args) {

        FluentPizzaBuilder makeMyPizza = new FluentPizzaBuilder();

        Pizza myPizza = makeMyPizza.withDough(Dough.DEEP_DISH)
                                    .withSauce(Sauce.REGULAR)
                                    .withCheese(Cheese.CHEDDAR)
                                    .withToppings(Topping.BACON, Topping.GREEN_PEPPERS, Topping.EXTRA_CHEESE)
                                    .bake();

        printList(myPizza.pizzaComponents());
    }

}
