package mediatedRestaurant;

public class Patron {

    private final Waiter waiter;

    private MealType suggestion;

    public Patron(Waiter waiter) {
        this.waiter = waiter;
        waiter.register(this);
    }

    public void askForMealOptions() {
        System.out.println("Patron asks waiter for suggestion.");
        waiter.getSuggestion();
    }

    public void listenToSuggestion(MealType suggestion) {
        System.out.println("Patron considers suggestion of "+suggestion+".");
        this.suggestion = suggestion;
    }

    public void order() {
        System.out.println("Patron orders suggested meal of "+suggestion+".");
        waiter.order(suggestion);
    }

    public void receive(MealType meal) {
        if (meal != suggestion) {
            System.out.println("Patron complains that he was served "+meal+" instead of "+suggestion+".");
            waiter.complain(suggestion);
        } else {
            System.out.println("Patron eats meal of "+meal+".");
        }
    }
}
