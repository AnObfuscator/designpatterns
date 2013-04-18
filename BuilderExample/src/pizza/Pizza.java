package pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza {

    public Pizza(Dough dough, Sauce sauce, Cheese cheese, Topping... toppings) {
        setDough(dough);
        setSauce(sauce);
        setCheese(cheese);
        setToppingsList(Arrays.asList(toppings));
    }

    public Pizza() {}

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private Dough dough;

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    private Sauce sauce;

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    private Cheese cheese;

    public List<Topping> getToppingsList() {
        return toppingsList;
    }

    public void setToppingsList(List<Topping> toppingsList) {
        this.toppingsList = toppingsList;
    }

    private List<Topping> toppingsList;

    public void addTopping(Topping topping) {
        if (toppingsList == null) toppingsList = new ArrayList<Topping>();
        toppingsList.add(topping);
    }

    public void addTopping(Topping... toppings) {
        for (Topping topping : toppings)
            addTopping(topping);
    }


    public List<PizzaComponent> pizzaComponents() {
        List<PizzaComponent> pizzaList = new ArrayList<PizzaComponent>();
        pizzaList.add(dough);
        pizzaList.add(sauce);
        pizzaList.add(cheese);
        pizzaList.addAll(toppingsList);
        return pizzaList;
    }
}
