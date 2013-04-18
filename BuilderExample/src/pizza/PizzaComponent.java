package pizza;

public interface PizzaComponent {
}

enum Dough implements PizzaComponent {
    THIN, DEEP_DISH, HAND_TOSSED
}
enum Sauce implements PizzaComponent {
    REGULAR, SPICY
}

enum Cheese implements PizzaComponent {
    MOZZARELLA, CHEDDAR
}

enum Topping implements PizzaComponent {
    PEPPERONI, SAUSAGE, BACON, EXTRA_CHEESE, HAM, GREEN_PEPPERS, SUN_DRIED_TOMATOES, MUSHROOMS, ONIONS
}
