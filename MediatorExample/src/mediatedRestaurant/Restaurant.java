package mediatedRestaurant;

import java.util.List;

public class Restaurant {
    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        Cook cook = new Cook(waiter);
        Patron patron = new Patron(waiter);

        patron.askForMealOptions();
        patron.order();


    }
}
